package zl.management.controller.UserController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.UserDao;
import zl.management.domain.User;
import zl.management.validator.UserValidator;

public class ConfirmRegister implements Controller {
	private UserDao userDao = DAOFactory.getUserDao();
	public ConfirmRegister() {
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		/*
		 * 由于没有创建表单对象, 这里的password和confirmPwd暂时连接在一起,以" "分割
		 */
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPwd = request.getParameter("confirmPwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		password += " ";
		password += confirmPwd;
		
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		user.setUsername(username);
		
		UserValidator validator = new UserValidator();
		Map<String, String> errors = validator.validateRegistered(user);
		System.out.println(name);
		System.out.println(email);
		
		if(errors.isEmpty()) {
			//注意密码此时是密码加验证密码
			int index = password.indexOf(" ");
			password = password.substring(0, index);
			user.setPassword(password);
			user.setType(0);
			userDao.add(user);
			
			String message = String.format(
					"注册成功！2秒后为您自动跳到登录页面！！" + "<meta http-equiv='refresh' content='2;url=%s'",
					"login");
			
			request.setAttribute("message", message);
			try {
				request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			return null; 
		}else {
			request.setAttribute("errors", errors);
			
			try {
				request.getRequestDispatcher("registered").forward(request, response);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
	}

}
