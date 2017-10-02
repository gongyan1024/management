package zl.management.controller.AcademicLectureController;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.domain.AcademicLecture;
import zl.management.util.ExcelUtil;
import zl.management.util.UDUtil;

public class ReadAcademicLectureExcelController implements Controller {
	private AcademicLectureDaoImp dao = DAOFactory.getAcademicLectureDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<String> paths = UDUtil.upload(request, response);
		if (paths == null) {
			ControllDeal.sendMessage(request, response, "导入成功,2秒后为您自动跳到学术讲座表格！！", "showAcademicLecture");
		} else {
			/*
			 * 功能: 将excel中的数据创建成实体对象,并存在一个列表中newInfo
			 */
			Class<AcademicLecture> clz = AcademicLecture.class;
			Field[] fields = clz.getDeclaredFields();
			String fieldName = null;

			for (String path : paths) {
				// 这里一般只有一个excel文件
				File file = new File(path);

				List<AcademicLecture> oldInfo = dao.list();
				// 这里存储的是Excel导入的信息
				List<AcademicLecture> newInfo = new ArrayList<AcademicLecture>();

				List<List<Object>> sheet = ExcelUtil.readExcel(file);

				for (int i = 1; i < sheet.size(); ++i) {
					AcademicLecture o = new AcademicLecture();
					List<Object> row = sheet.get(i);
					int fieldIndex = 0;
					for (int j = 0; j < row.size(); ++j) {
						// 这里可能取到excel表中没有但是实体类存在的字段,比如id, 比如evidences.
						fieldName = fields[fieldIndex].getName();
						if ("id".equals(fieldName)) {
							fieldName = fields[++fieldIndex].getName();
						} 
						String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
						Method method = null;
						try {
							method = clz.getMethod(methodName, new Class[] { String.class });
							method.invoke(o, new Object[] { (row.get(j)) });
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException
								| IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}
						fieldIndex++;
					}
					newInfo.add(o);
				}
				
				/*
				 * 功能: 比较oldInfo和newInfo,如果出现以下情形 1.如果该对象oldInfo中存在, newInfo不存在,
				 * 删除该对象在数据库中的信息(包括关联对象) 2.如果该对象oldInfo和newInfo存在, 那么将该对象进行更新
				 * 3.如果该对象oldInfo不存在, newInfo存在, 那么往数据库添加数据
				 * 
				 * 2个对象是如何实现比较的, 这里暂时用身份证作为标识符
				 */
				Map<String, AcademicLecture> oldMap = new HashMap<String, AcademicLecture>();
				Map<String, AcademicLecture> newMap = new HashMap<String, AcademicLecture>();
				List<String> oldKey = new ArrayList<String>();
				List<String> newKey = new ArrayList<String>();
				for (int i = 0; i < oldInfo.size(); ++i) {
					oldMap.put(oldInfo.get(i).getLectureName(), oldInfo.get(i));
					oldKey.add(oldInfo.get(i).getLectureName());
				}
				for (int i = 0; i < newInfo.size(); ++i) {
					newMap.put(newInfo.get(i).getLectureName(), newInfo.get(i));
					newKey.add(newInfo.get(i).getLectureName());
				}
				for (int i = 0; i < oldKey.size(); ++i) {
					String tmpOldKey = oldKey.get(i);
					int id = oldMap.get(tmpOldKey).getId();
					if (newKey.contains(tmpOldKey)) {
						AcademicLecture tmpO = newMap.get(tmpOldKey);
						tmpO.setId(id);
						dao.update(tmpO);
					} else {
						dao.delete(id);
					}
				}

				for (int i = 0; i < newKey.size(); ++i) {
					String tmpNewKey = newKey.get(i);
					if (!oldKey.contains(tmpNewKey)) {
						dao.add(newMap.get(tmpNewKey));
					}
				}
			}
			ControllDeal.sendMessage(request, response, "导入成功,2秒后为您自动跳到参加会议表格！！", "showAcademicLecture");
		}

		return null;
	}

}
