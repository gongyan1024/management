package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ResearcherController.AddResearcher;
import zl.management.controller.ResearcherController.ConfirmEditController;
import zl.management.controller.ResearcherController.DeteleResearcherController;
import zl.management.controller.ResearcherController.DownloadResController;
import zl.management.controller.ResearcherController.EditResearcherController;
import zl.management.controller.ResearcherController.FindResearcher;
import zl.management.controller.ResearcherController.ReadResearcherController;
import zl.management.controller.ResearcherController.ExportResearcherController;
import zl.management.controller.ResearcherController.ShowDownloadResController;
import zl.management.controller.ResearcherController.ShowResearcherControll;
import zl.management.controller.ResearcherController.ShowResearcherDetailController;
import zl.management.controller.ResearcherController.UploadResPathController;

@WebServlet(name = "ResearcherDispatcherServlet", urlPatterns = { "/showResearchs", "/exportResearchs",
		"/confirmEditResearchs", "/editResearchs", "/uploadResearchs", "/showDownloadResearchs", "/downloadResearchs",
		"/showResearcherDetail", "/readExcelResearchs", "/deleteResearchs", "/findResearcher",
		"/confrimFindResearcher", "/addResearcher", "/confrimAddResearcher" })

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

		if ("showResearchs".equals(action)) {
			dispatchUrl = new ShowResearcherControll().handleRequest(req, resp);
		} else if ("exportResearchs".equals(action)) {
			dispatchUrl = new ExportResearcherController().handleRequest(req, resp);
		} else if ("confirmEditResearchs".equals(action)) {
			dispatchUrl = new ConfirmEditController().handleRequest(req, resp);
		} else if ("editResearchs".equals(action)) {
			dispatchUrl = new EditResearcherController().handleRequest(req, resp);
		} else if ("uploadResearchs".equals(action)) {
			dispatchUrl = new UploadResPathController().handleRequest(req, resp);
		} else if ("showDownloadResearchs".equals(action)) {
			dispatchUrl = new ShowDownloadResController().handleRequest(req, resp);
		} else if ("downloadResearchs".equals(action)) {
			dispatchUrl = new DownloadResController().handleRequest(req, resp);
		} else if ("showResearcherDetail".equals(action)) {
			dispatchUrl = new ShowResearcherDetailController().handleRequest(req, resp);
		} else if ("readExcelResearchs".equals(action)) {
			dispatchUrl = new ReadResearcherController().handleRequest(req, resp);
		} else if ("deleteResearchs".equals(action)) {
			dispatchUrl = new DeteleResearcherController().handleRequest(req, resp);
		} else if ("findResearcher".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/researchers/findResearcher.jsp";
		} else if("confrimFindResearcher".equals(action)) {
			dispatchUrl = new FindResearcher().handleRequest(req, resp);
		} else if("addResearcher".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/researchers/addResearcher.jsp";
		} else if("confrimAddResearcher".equals(action)) {
			dispatchUrl = new AddResearcher().handleRequest(req, resp);
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
