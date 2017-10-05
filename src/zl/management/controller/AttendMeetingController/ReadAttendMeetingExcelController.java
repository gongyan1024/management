package zl.management.controller.AttendMeetingController;

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
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.domain.AttendMeeting;
import zl.management.util.ExcelUtil;
import zl.management.util.UDUtil;

public class ReadAttendMeetingExcelController implements Controller {
	private AttendMeetingDaoImp dao = DAOFactory.getAttendMeetingDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.readExcel(request, response, dao, AttendMeeting.class, "showAttendMeeting", "参加会议表格", "conferenceName");
		List<String> paths = UDUtil.upload(request, response);
		if (paths == null) {
			ControllDeal.sendMessage(request, response, "导入成功,2秒后为您自动跳到参加会议表格！！", "showAttendMeeting");
		} else {
			/*
			 * 功能: 将excel中的数据创建成实体对象,并存在一个列表中newInfo
			 */
			Class<AttendMeeting> clz = AttendMeeting.class;
			Field[] fields = clz.getDeclaredFields();
			String fieldName = null;

			for (String path : paths) {
				// 这里一般只有一个excel文件
				File file = new File(path);

				List<AttendMeeting> oldInfo = dao.list();
				// 这里存储的是Excel导入的信息
				List<AttendMeeting> newInfo = new ArrayList<AttendMeeting>();

				List<List<Object>> sheet = ExcelUtil.readExcel(file);

				for (int i = 1; i < sheet.size(); ++i) {
					AttendMeeting o = new AttendMeeting();
					List<Object> row = sheet.get(i);
					int fieldIndex = 0;
					for (int j = 0; j < row.size(); ++j) {
						// 这里可能取到excel表中没有但是实体类存在的字段,比如id, 比如evidences.
						fieldName = fields[fieldIndex].getName();
						if ("id".equals(fieldName)) {
							fieldName = fields[++fieldIndex].getName();
						} else if ("evidences".equals(fieldName)) {
							continue;
						}

						fieldIndex++;

						String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
						Method method = null;
						try {
							method = clz.getMethod(methodName, new Class[] { String.class });
							method.invoke(o, new Object[] { (row.get(j)) });
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException
								| IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}
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
				Map<String, AttendMeeting> oldMap = new HashMap<String, AttendMeeting>();
				Map<String, AttendMeeting> newMap = new HashMap<String, AttendMeeting>();
				List<String> oldKey = new ArrayList<String>();
				List<String> newKey = new ArrayList<String>();
				for (int i = 0; i < oldInfo.size(); ++i) {
					oldMap.put(oldInfo.get(i).getConferenceName(), oldInfo.get(i));
					oldKey.add(oldInfo.get(i).getConferenceName());
				}
				for (int i = 0; i < newInfo.size(); ++i) {
					newMap.put(newInfo.get(i).getConferenceName(), newInfo.get(i));
					newKey.add(newInfo.get(i).getConferenceName());
				}
				for (int i = 0; i < oldKey.size(); ++i) {
					String tmpOldKey = oldKey.get(i);
					int id = oldMap.get(tmpOldKey).getId();
					if (newKey.contains(tmpOldKey)) {
						AttendMeeting tmpO = newMap.get(tmpOldKey);
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
				file.delete();
			}
			ControllDeal.sendMessage(request, response, "导入成功,2秒后为您自动跳到参加会议表格！！", "showAttendMeeting");
		}

		return null;
	}

}
