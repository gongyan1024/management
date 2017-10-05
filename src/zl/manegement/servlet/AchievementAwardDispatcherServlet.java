package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.AchievementAwardController.ConfirmAddAchievementAwardController;
import zl.management.controller.AchievementAwardController.ConfirmEditAchievementAwardController;
import zl.management.controller.AchievementAwardController.ConfirmFindAchievementAwardController;
import zl.management.controller.AchievementAwardController.DeleteAchievementAwardController;
import zl.management.controller.AchievementAwardController.DownloadAchievementAwardController;
import zl.management.controller.AchievementAwardController.DropAchievementAwardController;
import zl.management.controller.AchievementAwardController.EditAchievementAwardController;
import zl.management.controller.AchievementAwardController.ExportAchievementAwardController;
import zl.management.controller.AchievementAwardController.ReadAchievementAwardExcelController;
import zl.management.controller.AchievementAwardController.ShowAchievementAwardController;
import zl.management.controller.AchievementAwardController.ShowAchievementAwardDetailController;
import zl.management.controller.AchievementAwardController.ShowAchievementAwardDownloadController;
import zl.management.controller.AchievementAwardController.UploadAchievementAwardController;

@WebServlet(name = "AchievementAwardDispatcherServlet", urlPatterns = { "/showAchievementAward", "/exportAchievementAward",
		"/addAchievementAward", "/editAchievementAward", "/uploadAchievementAward", "/showDownloadAchievementAward",
		"/downloadAchievementAward", "/showAchievementAwardDetail", "/readExcelAchievementAward", "/deleteAchievementAward",
		"/findAchievementAward", "/confrimEditAchievementAward", "/confrimAddAchievementAward",
		"/confirmFindAchievementAward", "/dropAchievementAward" })

public class AchievementAwardDispatcherServlet extends HttpServlet {

	private static final long serialVersionUID = -2420102292193160794L;

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

		if ("showAchievementAward".equals(action)) {
			dispatchUrl = new ShowAchievementAwardController().handleRequest(req, resp);
		} else if ("exportAchievementAward".equals(action)) {
			dispatchUrl = new ExportAchievementAwardController().handleRequest(req, resp);
		} else if ("addAchievementAward".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/achievementAward/addAchievementAward.jsp";
		} else if ("confrimAddAchievementAward".equals(action)) {
			dispatchUrl = new ConfirmAddAchievementAwardController().handleRequest(req, resp);
		} else if ("editAchievementAward".equals(action)) {
			dispatchUrl = new EditAchievementAwardController().handleRequest(req, resp);
		} else if ("confrimEditAchievementAward".equals(action)) {
			dispatchUrl = new ConfirmEditAchievementAwardController().handleRequest(req, resp);
		} else if ("uploadAchievementAward".equals(action)) {
			dispatchUrl = new UploadAchievementAwardController().handleRequest(req, resp);
		} else if ("showDownloadAchievementAward".equals(action)) {
			dispatchUrl = new ShowAchievementAwardDownloadController().handleRequest(req, resp);
		} else if ("downloadAchievementAward".equals(action)) {
			dispatchUrl = new DownloadAchievementAwardController().handleRequest(req, resp);
		} else if ("showAchievementAwardDetail".equals(action)) {
			dispatchUrl = new ShowAchievementAwardDetailController().handleRequest(req, resp);
		} else if ("readExcelAchievementAward".equals(action)) {
			dispatchUrl = new ReadAchievementAwardExcelController().handleRequest(req, resp);
		} else if ("deleteAchievementAward".equals(action)) {
			dispatchUrl = new DeleteAchievementAwardController().handleRequest(req, resp);
		} else if ("findAchievementAward".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/achievementAward/findAchievementAward.jsp";
		} else if ("confirmFindAchievementAward".equals(action)) {
			dispatchUrl = new ConfirmFindAchievementAwardController().handleRequest(req, resp);
		} else if ("dropAchievementAward".equals(action)) {
			dispatchUrl = new DropAchievementAwardController().handleRequest(req, resp);
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
