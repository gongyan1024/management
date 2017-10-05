package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.AchievementsController.ConfirmAddAchievementsController;
import zl.management.controller.AchievementsController.ConfirmEditAchievementsController;
import zl.management.controller.AchievementsController.ConfirmFindAchievementsController;
import zl.management.controller.AchievementsController.DeleteAchievementsController;
import zl.management.controller.AchievementsController.DownloadAchievementsController;
import zl.management.controller.AchievementsController.DropAchievementsController;
import zl.management.controller.AchievementsController.EditAchievementsController;
import zl.management.controller.AchievementsController.ExportAchievementsController;
import zl.management.controller.AchievementsController.ReadAchievementsExcelController;
import zl.management.controller.AchievementsController.ShowAchievementsController;
import zl.management.controller.AchievementsController.ShowAchievementsDetailController;
import zl.management.controller.AchievementsController.ShowAchievementsDownloadController;
import zl.management.controller.AchievementsController.UploadAchievementsController;

@WebServlet(name = "AchievementsDispatcherServlet", urlPatterns = { "/showAchievements", "/exportAchievements",
		"/addAchievements", "/editAchievements", "/uploadAchievements", "/showDownloadAchievements",
		"/downloadAchievements", "/showAchievementsDetail", "/readExcelAchievements", "/deleteAchievements",
		"/findAchievements", "/confrimEditAchievements", "/confrimAddAchievements",
		"/confirmFindAchievements", "/dropAchievements" })

public class AchievementsDispatcherServlet extends HttpServlet {

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

		if ("showAchievements".equals(action)) {
			dispatchUrl = new ShowAchievementsController().handleRequest(req, resp);
		} else if ("exportAchievements".equals(action)) {
			dispatchUrl = new ExportAchievementsController().handleRequest(req, resp);
		} else if ("addAchievements".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/achievements/addAchievements.jsp";
		} else if ("confrimAddAchievements".equals(action)) {
			dispatchUrl = new ConfirmAddAchievementsController().handleRequest(req, resp);
		} else if ("editAchievements".equals(action)) {
			dispatchUrl = new EditAchievementsController().handleRequest(req, resp);
		} else if ("confrimEditAchievements".equals(action)) {
			dispatchUrl = new ConfirmEditAchievementsController().handleRequest(req, resp);
		} else if ("uploadAchievements".equals(action)) {
			dispatchUrl = new UploadAchievementsController().handleRequest(req, resp);
		} else if ("showDownloadAchievements".equals(action)) {
			dispatchUrl = new ShowAchievementsDownloadController().handleRequest(req, resp);
		} else if ("downloadAchievements".equals(action)) {
			dispatchUrl = new DownloadAchievementsController().handleRequest(req, resp);
		} else if ("showAchievementsDetail".equals(action)) {
			dispatchUrl = new ShowAchievementsDetailController().handleRequest(req, resp);
		} else if ("readExcelAchievements".equals(action)) {
			dispatchUrl = new ReadAchievementsExcelController().handleRequest(req, resp);
		} else if ("deleteAchievements".equals(action)) {
			dispatchUrl = new DeleteAchievementsController().handleRequest(req, resp);
		} else if ("findAchievements".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/achievements/findAchievements.jsp";
		} else if ("confirmFindAchievements".equals(action)) {
			dispatchUrl = new ConfirmFindAchievementsController().handleRequest(req, resp);
		} else if ("dropAchievements".equals(action)) {
			dispatchUrl = new DropAchievementsController().handleRequest(req, resp);
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
