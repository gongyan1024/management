package zl.management.util;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

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

			for (int i = 0; i < fields.length; ++i) {
				HSSFCell cell = row.createCell(i);
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

					cell.setCellValue(textValue);

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
}
