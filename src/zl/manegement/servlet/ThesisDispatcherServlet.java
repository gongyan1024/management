package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ThesisController.ConfirmAddThesisController;
import zl.management.controller.ThesisController.ConfirmEditThesisController;
import zl.management.controller.ThesisController.ConfirmFindThesisController;
import zl.management.controller.ThesisController.DeleteThesisController;
import zl.management.controller.ThesisController.DownloadThesisController;
import zl.management.controller.ThesisController.DropThesisController;
import zl.management.controller.ThesisController.EditThesisController;
import zl.management.controller.ThesisController.ExportThesisController;
import zl.management.controller.ThesisController.ReadThesisExcelController;
import zl.management.controller.ThesisController.ShowThesisController;
import zl.management.controller.ThesisController.ShowThesisDetailController;
import zl.management.controller.ThesisController.ShowThesisDownloadController;
import zl.management.controller.ThesisController.UploadThesisController;

@WebServlet(name = "ThesisDispatcherServlet", urlPatterns = { "/showThesis", "/exportThesis",
		"/addThesis", "/editThesis", "/uploadThesis", "/showDownloadThesis",
		"/downloadThesis", "/showThesisDetail", "/readExcelThesis", "/deleteThesis",
		"/findThesis", "/confrimEditThesis", "/confrimAddThesis",
		"/confirmFindThesis", "/dropThesis" })

public class ThesisDispatcherServlet extends HttpServlet {

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

		if ("showThesis".equals(action)) {
			dispatchUrl = new ShowThesisController().handleRequest(req, resp);
		} else if ("exportThesis".equals(action)) {
			dispatchUrl = new ExportThesisController().handleRequest(req, resp);
		} else if ("addThesis".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/thesis/addThesis.jsp";
		} else if ("confrimAddThesis".equals(action)) {
			dispatchUrl = new ConfirmAddThesisController().handleRequest(req, resp);
		} else if ("editThesis".equals(action)) {
			dispatchUrl = new EditThesisController().handleRequest(req, resp);
		} else if ("confrimEditThesis".equals(action)) {
			dispatchUrl = new ConfirmEditThesisController().handleRequest(req, resp);
		} else if ("uploadThesis".equals(action)) {
			dispatchUrl = new UploadThesisController().handleRequest(req, resp);
		} else if ("showDownloadThesis".equals(action)) {
			dispatchUrl = new ShowThesisDownloadController().handleRequest(req, resp);
		} else if ("downloadThesis".equals(action)) {
			dispatchUrl = new DownloadThesisController().handleRequest(req, resp);
		} else if ("showThesisDetail".equals(action)) {
			dispatchUrl = new ShowThesisDetailController().handleRequest(req, resp);
		} else if ("readExcelThesis".equals(action)) {
			dispatchUrl = new ReadThesisExcelController().handleRequest(req, resp);
		} else if ("deleteThesis".equals(action)) {
			dispatchUrl = new DeleteThesisController().handleRequest(req, resp);
		} else if ("findThesis".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/thesis/findThesis.jsp";
		} else if ("confirmFindThesis".equals(action)) {
			dispatchUrl = new ConfirmFindThesisController().handleRequest(req, resp);
		} else if ("dropThesis".equals(action)) {
			dispatchUrl = new DropThesisController().handleRequest(req, resp);
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
