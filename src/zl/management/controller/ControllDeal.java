package zl.management.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.dao.BaseDao;
import zl.management.domain.filePath.DomainPath;
import zl.management.util.Pager;
import zl.management.util.SystemContext;
import zl.management.util.UDUtil;

public class ControllDeal {
	public static <T> void showDomain(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
			Class<T> clz, Map<String, Object> params) {
		SystemContext.setPageSize(8);

		int index = 1;
		String indexStr = request.getParameter("pageNumber");
		if (indexStr != null && !"".equals(indexStr)) {
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

	public static <T> T createObjByForm(HttpServletRequest request, HttpServletResponse response, Class<T> clz) {
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
		return t;
	}

	public static void sendMessage(HttpServletRequest request, HttpServletResponse response, String info,
			String target) {
		String message = String.format(info + "<meta http-equiv='refresh' content='1;url=%s'", target);
		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		;
	}

	public static <T> T comfirmEditDomain(HttpServletRequest request, HttpServletResponse response, BaseDao<T> dao,
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

		return t;
	}

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
}
