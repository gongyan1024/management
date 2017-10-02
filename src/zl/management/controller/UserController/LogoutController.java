package zl.management.controller.UserController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;

public class LogoutController implements Controller {

	public LogoutController() {
	}

	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("user");
		String message = String.format(
				"注销成功！2秒后为您自动跳到登录页面！！" + "<meta http-equiv='refresh' content='2;url=%s'",
				"login");
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
