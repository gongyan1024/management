package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.UserController.ConfirmLogin;
import zl.management.controller.UserController.ConfirmRegister;
import zl.management.controller.UserController.HomePageControll;
import zl.management.controller.UserController.Logout;

@WebServlet(name = "UserDispatcherServlet", urlPatterns = {"/homePage", "/login", "/registered", "/saveUser", "/confirmLogin", "/logout" })

public class UserDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = -6490741461955755851L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	private void process(HttpServletRequest req, HttpServletResponse resp) {
		String uri = req.getRequestURI();
		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex + 1);
		String dispatchUrl = null;

		if ("login".equals(action) || "".equals(action)) {
			dispatchUrl = "/WEB-INF/jsp/login.jsp";
		} else if ("registered".equals(action)) {
			dispatchUrl = "/WEB-INF/jsp/registered.jsp";
		} else if ("confirmLogin".equals(action)) {
			dispatchUrl = new ConfirmLogin().handleRequest(req, resp); 
		} else if ("saveUser".equals(action)) {
			dispatchUrl = new ConfirmRegister().handleRequest(req, resp);
		} else if ("logout".equals(action)) {
			dispatchUrl = new Logout().handleRequest(req, resp);
		} else if ("homePage".equals(action)) {
			dispatchUrl = new HomePageControll().handleRequest(req, resp);
		}

		if (null != dispatchUrl) {
			RequestDispatcher rd = req.getRequestDispatcher(dispatchUrl);
			try {
				rd.forward(req, resp);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
