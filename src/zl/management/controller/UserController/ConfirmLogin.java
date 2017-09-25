package zl.management.controller.UserController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.domain.User;
import zl.management.validator.UserValidator;

public class ConfirmLogin implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);

		UserValidator userValidator = new UserValidator();
		List<String> errors = userValidator.validateLogin(user);

		if (errors.isEmpty()) {
			user = DAOFactory.getUserDao().loadByUsername(username);
			request.getSession().setAttribute("user", user);
			try {
				response.sendRedirect("homePage");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		} else {
			String reason = errors.get(0);
			String message = String.format(
					"对不起，" + reason + "！！请重新登录！2秒后为您自动跳到登录页面！！" + "<meta http-equiv='refresh' content='2;url=%s'",
					"login");
			request.setAttribute("message", message);
			try {
				request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return null;
		}
	}

}
