package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ResearchReportController.ConfirmAddResearchReportController;
import zl.management.controller.ResearchReportController.ConfirmEditResearchReportController;
import zl.management.controller.ResearchReportController.ConfirmFindResearchReportController;
import zl.management.controller.ResearchReportController.DeleteResearchReportController;
import zl.management.controller.ResearchReportController.DownloadResearchReportController;
import zl.management.controller.ResearchReportController.DropResearchReportController;
import zl.management.controller.ResearchReportController.EditResearchReportController;
import zl.management.controller.ResearchReportController.ExportResearchReportController;
import zl.management.controller.ResearchReportController.ReadResearchReportExcelController;
import zl.management.controller.ResearchReportController.ShowResearchReportController;
import zl.management.controller.ResearchReportController.ShowResearchReportDetailController;
import zl.management.controller.ResearchReportController.ShowResearchReportDownloadController;
import zl.management.controller.ResearchReportController.UploadResearchReportController;

@WebServlet(name = "ResearchReportDispatcherServlet", urlPatterns = { "/showResearchReport", "/exportResearchReport",
		"/addResearchReport", "/editResearchReport", "/uploadResearchReport", "/showDownloadResearchReport",
		"/downloadResearchReport", "/showResearchReportDetail", "/readExcelResearchReport", "/deleteResearchReport",
		"/findResearchReport", "/confrimEditResearchReport", "/confrimAddResearchReport",
		"/confirmFindResearchReport", "/dropResearchReport" })

public class ResearchReportDispatcherServlet extends HttpServlet {

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

		if ("showResearchReport".equals(action)) {
			dispatchUrl = new ShowResearchReportController().handleRequest(req, resp);
		} else if ("exportResearchReport".equals(action)) {
			dispatchUrl = new ExportResearchReportController().handleRequest(req, resp);
		} else if ("addResearchReport".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/researchReport/addResearchReport.jsp";
		} else if ("confrimAddResearchReport".equals(action)) {
			dispatchUrl = new ConfirmAddResearchReportController().handleRequest(req, resp);
		} else if ("editResearchReport".equals(action)) {
			dispatchUrl = new EditResearchReportController().handleRequest(req, resp);
		} else if ("confrimEditResearchReport".equals(action)) {
			dispatchUrl = new ConfirmEditResearchReportController().handleRequest(req, resp);
		} else if ("uploadResearchReport".equals(action)) {
			dispatchUrl = new UploadResearchReportController().handleRequest(req, resp);
		} else if ("showDownloadResearchReport".equals(action)) {
			dispatchUrl = new ShowResearchReportDownloadController().handleRequest(req, resp);
		} else if ("downloadResearchReport".equals(action)) {
			dispatchUrl = new DownloadResearchReportController().handleRequest(req, resp);
		} else if ("showResearchReportDetail".equals(action)) {
			dispatchUrl = new ShowResearchReportDetailController().handleRequest(req, resp);
		} else if ("readExcelResearchReport".equals(action)) {
			dispatchUrl = new ReadResearchReportExcelController().handleRequest(req, resp);
		} else if ("deleteResearchReport".equals(action)) {
			dispatchUrl = new DeleteResearchReportController().handleRequest(req, resp);
		} else if ("findResearchReport".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/researchReport/findResearchReport.jsp";
		} else if ("confirmFindResearchReport".equals(action)) {
			dispatchUrl = new ConfirmFindResearchReportController().handleRequest(req, resp);
		} else if ("dropResearchReport".equals(action)) {
			dispatchUrl = new DropResearchReportController().handleRequest(req, resp);
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
