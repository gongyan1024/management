package zl.management.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.dao.BaseDao;
import zl.management.domain.filePath.DomainPath;
import zl.management.util.ExcelUtil;
import zl.management.util.Pager;
import zl.management.util.SystemContext;
import zl.management.util.UDUtil;

/** 
 * @ClassName: ControllDeal 
 * @Description: 处理类
 * @author: zhenlin
 * @date: 2017年10月5日 下午9:34:35  
 */
/** 
 * @ClassName: ControllDeal 
 * @Description: TODO
 * @author: zhenlin
 * @date: 2017年10月5日 下午9:39:54  
 */
public class ControllDeal {

	/** 
	 * @Title: showDomain 
	 * @Description: 将数据库的数据以表格的形式展示
	 * @param request	 
	 * @param response
	 * @param dao 
	 * @param clz
	 * @param params 这里是筛选条件
	 * @return: void	 
	 */
	public static <T> void showDomain(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
			Class<T> clz, Map<String, Object> params) {
		SystemContext.setPageSize(8);

		int index = 1;
		String indexStr = request.getParameter("pageNumber");
		if (indexStr != null && !"".equals(indexStr) && !"0".equals(indexStr)) {
			index = Integer.parseInt(indexStr);
		}

		SystemContext.setPageIndex(index);
		SystemContext.setPageOffset((index - 1) * SystemContext.getPageSize());
		if (params == null)
			params = new HashMap<String, Object>();
		Pager<T> page = dao.find(clz, params);
		page.setPageIndex(index);
		List<T> entryList = page.getDatas();

		request.setAttribute("entryList", entryList);
		request.setAttribute("totalPages", page.getTotalPage());
		request.setAttribute("pageNumber", index);
	}
	
	
	/** 
	 * @Title: createObjByForm 
	 * @Description: 根据新增表格来创建对象, 并存取在数据库
	 * @param request
	 * @param response
	 * @param clz
	 * @param dao
	 * @return: void
	 */
	public static <T> void createObjByForm(HttpServletRequest request, HttpServletResponse response, Class<T> clz, BaseDao<T> dao) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		T t = null;
		try {
			t = clz.newInstance();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		Field[] fields = clz.getDeclaredFields();
		String fieldName = null;
		for (int i = 0; i < fields.length; ++i) {
			fieldName = fields[i].getName();
			if ("evidences".equals(fieldName) || "id".equals(fieldName))
				continue;

			String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
			Method method = null;
			try {
				method = clz.getMethod(methodName, new Class[] { String.class });
				method.invoke(t, new Object[] { request.getParameter(fieldName) });
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		dao.add(t);
	}

	/** 
	 * @Title: sendMessage 
	 * @Description: 跳转页面
	 * @param request
	 * @param response
	 * @param info
	 * @param target
	 * @return: void
	 */
	public static void sendMessage(HttpServletRequest request, HttpServletResponse response, String info,
			String target) {
		String message = String.format(info + "<meta http-equiv='refresh' content='1;url=%s'", target);
		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	/** 
	 * @Title: comfirmEditDomain 
	 * @Description: 编辑信息更新到数据库
	 * @param request
	 * @param response
	 * @param dao
	 * @param clz
	 * @return: void
	 */
	public static <T> void comfirmEditDomain(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
			Class<T> clz) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		int id = Integer.parseInt(request.getParameter("id"));
		T t = dao.load(clz, id);
		Field[] fields = clz.getDeclaredFields();
		String fieldName = null;
		for (int i = 0; i < fields.length; ++i) {
			fieldName = fields[i].getName();
			if ("evidences".equals(fieldName) || "id".equals(fieldName))
				continue;

			String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
			Method method = null;
			try {
				method = clz.getMethod(methodName, new Class[] { String.class });
				method.invoke(t, new Object[] { request.getParameter(fieldName) });
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
		}

		dao.update(t);
	}

	/** 
	 * @Title: uploadFile 
	 * @Description: 上传文件佐证,将文件上传到数据库
	 * @param request
	 * @param response
	 * @param dao
	 * @param clz
	 * @param editPath
	 * @return: void
	 */
	public static <T> void uploadFile(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
			Class<T> clz, String editPath) {
		String message = null;
		int id = Integer.parseInt(request.getParameter("id"));
		List<String> paths = UDUtil.upload(request, response);
		if (paths == null) {
			message = String.format("请选择文件,1秒后为您自动跳到编辑页面！！" + "<meta http-equiv='refresh' content='2;url=%s'",
					editPath + "?id=" + id);
		} else {
			for (String path : paths) {
				T t = null;
				try {
					t = clz.newInstance();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				DomainPath dp = (DomainPath) t;
				dp.setDid(id);
				dp.setPath(path);
				dao.add(t);
			}
			message = String.format(request.getAttribute("message") + "1秒后为您自动跳到编辑页面！！"
					+ "<meta http-equiv='refresh' content='2;url=%s'", editPath + "?id=" + id);
		}

		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** 
	 * @Title: showDownload 
	 * @Description: 将佐证文件列表传给页面
	 * @param request
	 * @param response
	 * @param dao
	 * @param clz
	 * @param showPath
	 * @param dowloadPath
	 * @return
	 * @return: String
	 */
	public static <T> String showDownload(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
			Class<T> clz, String showPath, String dowloadPath) {
		int id = Integer.parseInt(request.getParameter("id"));
		Map<String, String> fileNameMap = new HashMap<String, String>();

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("did", id);
		List<T> pathList = dao.list(clz, params);
		if (pathList.isEmpty()) {
			sendMessage(request, response, "无文件", showPath);
			return null;
		} else {
			for (T t : pathList) {
				DomainPath dp = (DomainPath) t;
				String path = dp.getPath(); // 这里获得的是带有uuid的名称
				int index = path.indexOf("_");
				String realPath = path.substring(index + 1);
				fileNameMap.put(realPath, path);
			}

			request.setAttribute("fileNameMap", fileNameMap);
			return dowloadPath;
		}
	}

	/** 
	 * @Title: dropDomain 
	 * @Description: 删除单行记录
	 * @param request
	 * @param response
	 * @param dao
	 * @param clz
	 * @return: void
	 */
	public static <T> void dropDomain(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
			Class<T> clz) {
		int id = Integer.parseInt(request.getParameter("id"));
		dao.delete(clz, id);
	}

	/** 
	 * @Title: readExcel 
	 * @Description: 读取excel文件并将数据存到数据库
	 * @param request
	 * @param response
	 * @param dao
	 * @param clz
	 * @param showPath
	 * @param info
	 * @param keyField
	 * @return: void
	 */
	public static <T> void readExcel(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
			Class<T> clz, String showPath, String info, String keyField) {
		List<String> paths = UDUtil.upload(request, response);

		if (paths == null) {
			sendMessage(request, response, "请选择文件,1秒后为您自动跳到" + info, showPath);
		} else {
			/*
			 * 功能: 将excel中的数据创建成实体对象,并存在一个列表中newInfo
			 */
			Field[] fields = clz.getDeclaredFields();
			String fieldName = null;

			for (String path : paths) {
				// 这里一般只有一个excel文件
				File file = new File(path);

				Map<String, Object> params = new HashMap<String, Object>();

				// 这里存储的是导入前数据库的信息.
				List<T> oldInfo = dao.list(clz, params);
				// 这里存储的是Excel导入的信息
				List<T> newInfo = new ArrayList<T>();

				List<List<Object>> sheet = ExcelUtil.readExcel(file);

				for (int i = 1; i < sheet.size(); ++i) {
					T obj = null;
					try {
						obj = clz.newInstance();
					} catch (InstantiationException | IllegalAccessException e1) {
						e1.printStackTrace();
					}
					List<Object> row = sheet.get(i);
					int fieldIndex = 0;
					for (int j = 0; j < row.size(); ++j) {
						// 这里可能取到excel表中没有但是实体类存在的字段,比如id
						fieldName = fields[fieldIndex].getName();
						if ("id".equals(fieldName)) {
							fieldName = fields[++fieldIndex].getName();
						}

						fieldIndex++;

						String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
						Method method = null;
						try {
							method = clz.getMethod(methodName, new Class[] { String.class });
							method.invoke(obj, new Object[] { (row.get(j)) });
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException
								| IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}
					}
					newInfo.add(obj);
				}

				/*
				 * 功能: 比较oldInfo和newInfo,如果出现以下情形 1.如果该对象oldInfo中存在, newInfo不存在,
				 * 删除该对象在数据库中的信息(包括关联对象) 2.如果该对象oldInfo和newInfo存在, 那么将该对象进行更新
				 * 3.如果该对象oldInfo不存在, newInfo存在, 那么往数据库添加数据
				 */
				String getKeyStr = "get" + keyField.substring(0, 1).toUpperCase() + keyField.substring(1);
				Method getkeyMethod = null;
				Method getId = null;
				Method setId = null;
				try {
					getkeyMethod = clz.getMethod(getKeyStr, new Class[] {});
					getId = clz.getMethod("getId", new Class[] {});
					setId = clz.getMethod("setId", new Class[] { int.class });
				} catch (NoSuchMethodException | SecurityException e1) {
					e1.printStackTrace();
				}
				Map<String, T> oldMap = new HashMap<String, T>();
				Map<String, T> newMap = new HashMap<String, T>();
				List<String> oldKey = new ArrayList<String>();
				List<String> newKey = new ArrayList<String>();

				for (int i = 0; i < oldInfo.size(); ++i) {
					Object oldKeyStr = null;
					try {
						oldKeyStr = getkeyMethod.invoke(oldInfo.get(i), new Object[] {});
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
					oldMap.put((String) oldKeyStr, oldInfo.get(i));
					oldKey.add((String) oldKeyStr);
				}
				for (int i = 0; i < newInfo.size(); ++i) {
					Object newKeyStr = null;
					try {
						newKeyStr = getkeyMethod.invoke(newInfo.get(i), new Object[] {});
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
					newMap.put((String) newKeyStr, newInfo.get(i));
					newKey.add((String) newKeyStr);
				}

				for (int i = 0; i < oldKey.size(); ++i) {
					String tmpKey = oldKey.get(i);
					int id = 0;
					try {
						id = (int) getId.invoke(oldMap.get(tmpKey), new Object[] {});
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
					if (newKey.contains(tmpKey)) {
						T tmpObj = newMap.get(tmpKey);
						try {
							setId.invoke(tmpObj, id);
						} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
							e.printStackTrace();
						}
						dao.update(tmpObj);
					} else {
						dao.delete(clz, id);
					}
				}

				for (int i = 0; i < newKey.size(); ++i) {
					String tmpKey = newKey.get(i);
					if (!oldKey.contains(tmpKey)) {
						dao.add(newMap.get(tmpKey));
					}
				}
				file.delete();
			}
			sendMessage(request, response, "导入成功,1秒后为您自动跳到" + info, showPath);
		}
	}
	
	public static <T> void deleteFile(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
			Class<T> clz, String resPath) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String path = request.getParameter("path");
		File file = new File(path);
		file.delete();
		dao.delete(path);
		try {
			response.sendRedirect(resPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
