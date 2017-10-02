package zl.management.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtil {
	public static <T> void exportExcel(String fileName, String[] headers, Collection<T> dataSet, OutputStream out) {

		// 创建一个工作薄
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 创建一个表单
		HSSFSheet sheet = workbook.createSheet(fileName);

		// 创建标题栏
		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < headers.length; ++i) {
			HSSFCell cell = row.createCell(i);
			cell.setCellValue(headers[i]);
		}

		// 用Itertor做collection的遍历
		Iterator<T> it = dataSet.iterator();
		int index = 0;
		while (it.hasNext()) {
			index++;
			row = sheet.createRow(index);
			T t = it.next();

			// 获取字段的原因是可以获得字段的名称, 可以根据名称来得到Method
			Field[] fields = t.getClass().getDeclaredFields();

			int rowIndex = 0;
			for (int i = 0; i < fields.length; ++i) {
				Field field = fields[i];
				String fieldName = field.getName();
				// 并不需要传佐证和id
				if ("evidences".equals(fieldName) || "id".equals(fieldName))
					continue;

				// 获取方法名
				String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
				try {
					Method method = t.getClass().getMethod(methodName, new Class[] {});
					Object value = method.invoke(t, new Object[] {});
					String textValue = null;

					if (value == null) {
						textValue = "";
					} else if (value instanceof Boolean) {
						boolean bValue = (Boolean) value;
						textValue = "男";
						if (!bValue) {
							textValue = "女";
						}
					} else if (value instanceof Date) {
						Date date = new Date();
						SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
						textValue = format.format(date);
					} else {
						textValue = value.toString();
					}
					HSSFCell cell = row.createCell(rowIndex);
					cell.setCellValue(textValue);
					rowIndex++;
				} catch (NoSuchMethodException | SecurityException | IllegalArgumentException
						| InvocationTargetException | IllegalAccessException e) {
					e.printStackTrace();
				} finally {
					try {
						workbook.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		try {
			workbook.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<List<Object>> readExcel(File	file) {
		String fileName = file.getName();
		String extension = fileName.lastIndexOf(".") == -1 ? "" : fileName
				.substring(fileName.lastIndexOf(".") + 1);
		if ("xls".equals(extension)) {
			try {
				return read2003Excel(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if ("xlsx".equals(extension)) {
			try {
				return read2007Excel(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				throw new IOException("不支持的文件类型");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * 读取 office 2003 excel
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	@SuppressWarnings("deprecation")
	private static List<List<Object>> read2003Excel(File file)
			throws IOException {
		List<List<Object>> list = new LinkedList<List<Object>>();
		HSSFWorkbook hwb = new HSSFWorkbook(new FileInputStream(file));
		HSSFSheet sheet = hwb.getSheetAt(0);
		Object value = null;
		HSSFRow row = null;
		HSSFCell cell = null;
		for (int i = sheet.getFirstRowNum(); i < sheet
				.getPhysicalNumberOfRows(); i++) {
			row = sheet.getRow(i);
			if (row == null || row.getFirstCellNum() == -1) {
				continue;
			}
			
			List<Object> linked = new LinkedList<Object>();
			for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
				cell = row.getCell(j);
				if (cell == null) {
					linked.add("");
					continue;
				}
				DecimalFormat df = new DecimalFormat("0");// 格式化 number String 字符
				SimpleDateFormat sdf = new SimpleDateFormat(
						"yyyy-MM-dd");// 格式化日期字符串
				DecimalFormat nf = new DecimalFormat("0.00");// 格式化数字
				switch (cell.getCellType()) {
				case XSSFCell.CELL_TYPE_STRING:
					value = cell.getStringCellValue();
					break;
				case XSSFCell.CELL_TYPE_NUMERIC:
		  			if ("@".equals(cell.getCellStyle().getDataFormatString())) {
						value = df.format(cell.getNumericCellValue());
					} else if ("General".equals(cell.getCellStyle()
							.getDataFormatString())) {
						value = nf.format(cell.getNumericCellValue());
					} else {
						value = sdf.format(HSSFDateUtil.getJavaDate(cell
								.getNumericCellValue()));
					}
					break;
				case XSSFCell.CELL_TYPE_BOOLEAN:
					value = cell.getBooleanCellValue();
					break;
				case XSSFCell.CELL_TYPE_BLANK:
					value = "";
					break;
				default:
					value = cell.toString();
				}
				linked.add(value);
			}
			int blankNum = 0;
			for(int j = 0; j < linked.size(); ++j) {
				if(linked.get(j) == ""  || linked.get(j) == null)
					blankNum++;
			}
			if(blankNum != linked.size())
				list.add(linked);
		}
		hwb.close();
		return list;
	}
	/**
	 * 读取Office 2007 excel
	 * */
	@SuppressWarnings("deprecation")
	private static List<List<Object>> read2007Excel(File file)
			throws IOException {
		List<List<Object>> list = new LinkedList<List<Object>>();
		// 构造 XSSFWorkbook 对象，strPath 传入文件路径
		XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(file));
		// 读取第一章表格内容
		XSSFSheet sheet = xwb.getSheetAt(0);
		Object value = null;
		XSSFRow row = null;
		XSSFCell cell = null;
		for (int i = sheet.getFirstRowNum(); i < sheet
				.getPhysicalNumberOfRows(); i++) {
			row = sheet.getRow(i);
			row = sheet.getRow(i);
			if (row == null || row.getFirstCellNum() == -1) {
				continue;
			}
			List<Object> linked = new LinkedList<Object>();
			for (int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++) {
				cell = row.getCell(j);
				if (cell == null) {
					continue;
				}
				DecimalFormat df = new DecimalFormat("0");// 格式化 number String 字符
				SimpleDateFormat sdf = new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss");// 格式化日期字符串
				DecimalFormat nf = new DecimalFormat("0.00");// 格式化数字
				switch (cell.getCellType()) {
				case XSSFCell.CELL_TYPE_STRING:
					value = cell.getStringCellValue();
					break;
				case XSSFCell.CELL_TYPE_NUMERIC:
					if ("@".equals(cell.getCellStyle().getDataFormatString())) {
						value = df.format(cell.getNumericCellValue());
					} else if ("General".equals(cell.getCellStyle()
							.getDataFormatString())) {
						value = nf.format(cell.getNumericCellValue());
					} else {
						value = sdf.format(HSSFDateUtil.getJavaDate(cell
								.getNumericCellValue()));
					}
					break;
				case XSSFCell.CELL_TYPE_BOOLEAN:
					value = cell.getBooleanCellValue();
					break;
				case XSSFCell.CELL_TYPE_BLANK:
					value = "";
					break;
				default:
					value = cell.toString();
				}
				if (value == null || "".equals(value)) {
					continue;
				}
				linked.add(value);
			}
			int blankNum = 0;
			for(int j = 0; j < linked.size(); ++j) {
				if(linked.get(j) == ""  || linked.get(j) == null)
					blankNum++;
			}
			if(blankNum != linked.size())
				list.add(linked);
		}
		xwb.close();
		return list;
	}
}
