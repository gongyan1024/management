package zl.management.controller.UserController;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.UserDao;
import zl.management.domain.User;
import zl.management.validator.UserValidator;

public class ComfirmNewPwdController implements Controller {
	private UserDao userDao = DAOFactory.getUserDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String oldPassword = request.getParameter("password");
		String newPassword = request.getParameter("newPassword");
		String confirmPwd = request.getParameter("confirmPwd");

		int id = Integer.parseInt(request.getParameter("id"));
		User u = userDao.load(id);
		
		UserValidator validator = new UserValidator();
		Map<String, String> errors = validator.validateModifyPwd(u, oldPassword, newPassword, confirmPwd);
		if(errors.isEmpty()) {
			u.setPassword(newPassword);
			userDao.update(u);
			String message = String.format(
					"注册成功！2秒后为您自动跳到登录页面！！" + "<meta http-equiv='refresh' content='2;url=%s'",
					"login");
			
			request.setAttribute("message", message);
			try {
				request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			request.setAttribute("errors", errors);
			try {
				request.getRequestDispatcher("modifyPassword").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
