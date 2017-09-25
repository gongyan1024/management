package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ResearcherController.ConfirmEditController;
import zl.management.controller.ResearcherController.DownloadResController;
import zl.management.controller.ResearcherController.EditController;
import zl.management.controller.ResearcherController.ResearcherExportExcel;
import zl.management.controller.ResearcherController.ShowDownloadResController;
import zl.management.controller.ResearcherController.ShowResearcherControll;
import zl.management.controller.ResearcherController.ShowResearcherDetailController;
import zl.management.controller.ResearcherController.UploadResController;

@WebServlet(name = "ResearcherDispatcherServlet", urlPatterns = { "/showResearchs", "/exportResearchs",
		"/confirmEditResearchs", "/editResearchs", "/uploadResearchs", "/showDownloadResearchs", "/downloadResearchs",
		"/showResearcherDetail" })

public class ResearcherDispatcherServlet extends HttpServlet {

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

		System.out.println(action);
		if ("showResearchs".equals(action)) {
			dispatchUrl = new ShowResearcherControll().handleRequest(req, resp);
		} else if ("exportResearchs".equals(action)) {
			dispatchUrl = new ResearcherExportExcel().handleRequest(req, resp);
		} else if ("confirmEditResearchs".equals(action)) {
			dispatchUrl = new ConfirmEditController().handleRequest(req, resp);
		} else if ("editResearchs".equals(action)) {
			dispatchUrl = new EditController().handleRequest(req, resp);
		} else if ("uploadResearchs".equals(action)) {
			dispatchUrl = new UploadResController().handleRequest(req, resp);
		} else if ("showDownloadResearchs".equals(action)) {
			dispatchUrl = new ShowDownloadResController().handleRequest(req, resp);
		} else if ("downloadResearchs".equals(action)) {
			dispatchUrl = new DownloadResController().handleRequest(req, resp);
		} else if ("showResearcherDetail".equals(action)) {
			dispatchUrl = new ShowResearcherDetailController().handleRequest(req, resp);
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
