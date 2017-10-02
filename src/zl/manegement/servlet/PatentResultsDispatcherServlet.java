package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.PatentResultsController.ConfirmAddPatentResultsController;
import zl.management.controller.PatentResultsController.ConfirmEditPatentResultsController;
import zl.management.controller.PatentResultsController.ConfirmFindPatentResultsController;
import zl.management.controller.PatentResultsController.DeletePatentResultsController;
import zl.management.controller.PatentResultsController.DownloadPatentResultsController;
import zl.management.controller.PatentResultsController.DropPatentResultsController;
import zl.management.controller.PatentResultsController.EditPatentResultsController;
import zl.management.controller.PatentResultsController.ExportPatentResultsController;
import zl.management.controller.PatentResultsController.ReadPatentResultsExcelController;
import zl.management.controller.PatentResultsController.ShowPatentResultsController;
import zl.management.controller.PatentResultsController.ShowPatentResultsDetailController;
import zl.management.controller.PatentResultsController.ShowPatentResultsDownloadController;
import zl.management.controller.PatentResultsController.UploadPatentResultsController;

@WebServlet(name = "PatentResultsDispatcherServlet", urlPatterns = { "/showPatentResults", "/exportPatentResults",
		"/addPatentResults", "/editPatentResults", "/uploadPatentResults", "/showDownloadPatentResults",
		"/downloadPatentResults", "/showPatentResultsDetail", "/readExcelPatentResults", "/deletePatentResults",
		"/findPatentResults", "/confrimEditPatentResults", "/confrimAddPatentResults",
		"/confirmFindPatentResults", "/dropPatentResults" })

public class PatentResultsDispatcherServlet extends HttpServlet {

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

		if ("showPatentResults".equals(action)) {
			dispatchUrl = new ShowPatentResultsController().handleRequest(req, resp);
		} else if ("exportPatentResults".equals(action)) {
			dispatchUrl = new ExportPatentResultsController().handleRequest(req, resp);
		} else if ("addPatentResults".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/patentResults/addPatentResults.jsp";
		} else if ("confrimAddPatentResults".equals(action)) {
			dispatchUrl = new ConfirmAddPatentResultsController().handleRequest(req, resp);
		} else if ("editPatentResults".equals(action)) {
			dispatchUrl = new EditPatentResultsController().handleRequest(req, resp);
		} else if ("confrimEditPatentResults".equals(action)) {
			dispatchUrl = new ConfirmEditPatentResultsController().handleRequest(req, resp);
		} else if ("uploadPatentResults".equals(action)) {
			dispatchUrl = new UploadPatentResultsController().handleRequest(req, resp);
		} else if ("showDownloadPatentResults".equals(action)) {
			dispatchUrl = new ShowPatentResultsDownloadController().handleRequest(req, resp);
		} else if ("downloadPatentResults".equals(action)) {
			dispatchUrl = new DownloadPatentResultsController().handleRequest(req, resp);
		} else if ("showPatentResultsDetail".equals(action)) {
			dispatchUrl = new ShowPatentResultsDetailController().handleRequest(req, resp);
		} else if ("readExcelPatentResults".equals(action)) {
			dispatchUrl = new ReadPatentResultsExcelController().handleRequest(req, resp);
		} else if ("deletePatentResults".equals(action)) {
			dispatchUrl = new DeletePatentResultsController().handleRequest(req, resp);
		} else if ("findPatentResults".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/patentResults/findPatentResults.jsp";
		} else if ("confirmFindPatentResults".equals(action)) {
			dispatchUrl = new ConfirmFindPatentResultsController().handleRequest(req, resp);
		} else if ("dropPatentResults".equals(action)) {
			dispatchUrl = new DropPatentResultsController().handleRequest(req, resp);
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
