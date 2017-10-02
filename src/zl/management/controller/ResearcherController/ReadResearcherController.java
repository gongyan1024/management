package zl.management.controller.ResearcherController;

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
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;
import zl.management.util.ExcelUtil;
import zl.management.util.UDUtil;

public class ReadResearcherController implements Controller {
	private ResearchersDao dao = DAOFactory.getResearchersDao();
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<String> paths = UDUtil.upload(request, response);
		if (paths == null) {
			ControllDeal.sendMessage(request, response, "请选择文件,1秒后为您自动跳到科研人员表格！！", "showResearchs");
		} else {
			/*
			 * 功能: 将excel中的数据创建成实体对象,并存在一个列表中newInfo
			 */
			Field[] fields = Researchers.class.getDeclaredFields();
			String fieldName = null;

			for (String path : paths) {
				// 这里一般只有一个excel文件
				File file = new File(path);

				// 这里存储的是导入前数据库的信息.
				List<Researchers> oldInfo = dao.list();
				// 这里存储的是Excel导入的信息
				List<Researchers> newInfo = new ArrayList<Researchers>();

				List<List<Object>> sheet = ExcelUtil.readExcel(file);

				for (int i = 1; i < sheet.size(); ++i) {
					Researchers r = new Researchers();
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
							method = Researchers.class.getMethod(methodName, new Class[] { String.class });
							method.invoke(r, new Object[] { (row.get(j)) });
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException
								| IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}
					}
					newInfo.add(r);
				}
				
				/*
				 * 功能: 比较oldInfo和newInfo,如果出现以下情形 1.如果该对象oldInfo中存在, newInfo不存在,
				 * 删除该对象在数据库中的信息(包括关联对象) 2.如果该对象oldInfo和newInfo存在, 那么将该对象进行更新
				 * 3.如果该对象oldInfo不存在, newInfo存在, 那么往数据库添加数据
				 * 
				 * 2个对象是如何实现比较的, 这里暂时用身份证作为标识符
				 */
				Map<String, Researchers> oldMap = new HashMap<String, Researchers>();
				Map<String, Researchers> newMap = new HashMap<String, Researchers>();
				List<String> oldIdCard = new ArrayList<String>();
				List<String> newIdCard = new ArrayList<String>();
				for (int i = 0; i < oldInfo.size(); ++i) {
					oldMap.put(oldInfo.get(i).getIdCard(), oldInfo.get(i));
					oldIdCard.add(oldInfo.get(i).getIdCard());
				}
				for (int i = 0; i < newInfo.size(); ++i) {
					newMap.put(newInfo.get(i).getIdCard(), newInfo.get(i));
					newIdCard.add(newInfo.get(i).getIdCard());
				}
				for (int i = 0; i < oldIdCard.size(); ++i) {
					String tmpOIC = oldIdCard.get(i);
					int id = oldMap.get(tmpOIC).getId();
					if (newIdCard.contains(tmpOIC)) {
						Researchers tmpR = newMap.get(tmpOIC);
						tmpR.setId(id);
						dao.update(tmpR);
					} else {
						dao.delete(id);
					}
				}

				for (int i = 0; i < newIdCard.size(); ++i) {
					String tmpNIC = newIdCard.get(i);
					if (!oldIdCard.contains(tmpNIC)) {
						dao.add(newMap.get(tmpNIC));
					}
				}
			}
			ControllDeal.sendMessage(request, response, "导入成功,2秒后为您自动跳到科研人员表格！！", "showResearchs");
		}

		return null;
	}

}
