package zl.management.controller.ResearcherController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;

public class ConfirmEditController implements Controller {
	private ResearchersDao dao = DAOFactory.getResearchersDao();
	
	/*
	 * (non Javadoc) 
	 * @Title: handleRequest
	 * @Description: 未使用校验器,注意
	 * @param request
	 * @param response
	 * @return 
	 * @see zl.management.controller.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		int id = Integer.parseInt(request.getParameter("id"));
		Researchers r = dao.load(id);
		Class<Researchers> clz = Researchers.class;
		
		
		Field[] fields = clz.getDeclaredFields();
		String fieldName = null;
		for (int i = 0; i < fields.length; ++i) {
			fieldName = fields[i].getName();
			if ("evidences".equals(fieldName) || "id".equals(fieldName))
				continue;
			
			String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
			Method method = null;
			try {
				method = clz.getMethod(methodName, new Class[] {String.class});
				method.invoke(r, new Object[] {request.getParameter(fieldName)});
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		dao.update(r);
		String message = String.format(
				"修改成功！1秒后为您自动跳到主页面！！" + "<meta http-equiv='refresh' content='1;url=%s'",
				"homePage");
		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		};
		
		return null;
	}
}
