package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.IdentificationResultController.ConfirmAddIdentificationResultController;
import zl.management.controller.IdentificationResultController.ConfirmEditIdentificationResultController;
import zl.management.controller.IdentificationResultController.ConfirmFindIdentificationResultController;
import zl.management.controller.IdentificationResultController.DeleteIdentificationResultController;
import zl.management.controller.IdentificationResultController.DownloadIdentificationResultController;
import zl.management.controller.IdentificationResultController.DropIdentificationResultController;
import zl.management.controller.IdentificationResultController.EditIdentificationResultController;
import zl.management.controller.IdentificationResultController.ExportIdentificationResultController;
import zl.management.controller.IdentificationResultController.ReadIdentificationResultExcelController;
import zl.management.controller.IdentificationResultController.ShowIdentificationResultController;
import zl.management.controller.IdentificationResultController.ShowIdentificationResultDetailController;
import zl.management.controller.IdentificationResultController.ShowIdentificationResultDownloadController;
import zl.management.controller.IdentificationResultController.UploadIdentificationResultController;

@WebServlet(name = "IdentificationResultDispatcherServlet", urlPatterns = { "/showIdentificationResult", "/exportIdentificationResult",
		"/addIdentificationResult", "/editIdentificationResult", "/uploadIdentificationResult", "/showDownloadIdentificationResult",
		"/downloadIdentificationResult", "/showIdentificationResultDetail", "/readExcelIdentificationResult", "/deleteIdentificationResult",
		"/findIdentificationResult", "/confrimEditIdentificationResult", "/confrimAddIdentificationResult",
		"/confirmFindIdentificationResult", "/dropIdentificationResult" })

public class IdentificationResultDispatcherServlet extends HttpServlet {

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

		if ("showIdentificationResult".equals(action)) {
			dispatchUrl = new ShowIdentificationResultController().handleRequest(req, resp);
		} else if ("exportIdentificationResult".equals(action)) {
			dispatchUrl = new ExportIdentificationResultController().handleRequest(req, resp);
		} else if ("addIdentificationResult".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/identificationResult/addIdentificationResult.jsp";
		} else if ("confrimAddIdentificationResult".equals(action)) {
			dispatchUrl = new ConfirmAddIdentificationResultController().handleRequest(req, resp);
		} else if ("editIdentificationResult".equals(action)) {
			dispatchUrl = new EditIdentificationResultController().handleRequest(req, resp);
		} else if ("confrimEditIdentificationResult".equals(action)) {
			dispatchUrl = new ConfirmEditIdentificationResultController().handleRequest(req, resp);
		} else if ("uploadIdentificationResult".equals(action)) {
			dispatchUrl = new UploadIdentificationResultController().handleRequest(req, resp);
		} else if ("showDownloadIdentificationResult".equals(action)) {
			dispatchUrl = new ShowIdentificationResultDownloadController().handleRequest(req, resp);
		} else if ("downloadIdentificationResult".equals(action)) {
			dispatchUrl = new DownloadIdentificationResultController().handleRequest(req, resp);
		} else if ("showIdentificationResultDetail".equals(action)) {
			dispatchUrl = new ShowIdentificationResultDetailController().handleRequest(req, resp);
		} else if ("readExcelIdentificationResult".equals(action)) {
			dispatchUrl = new ReadIdentificationResultExcelController().handleRequest(req, resp);
		} else if ("deleteIdentificationResult".equals(action)) {
			dispatchUrl = new DeleteIdentificationResultController().handleRequest(req, resp);
		} else if ("findIdentificationResult".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/identificationResult/findIdentificationResult.jsp";
		} else if ("confirmFindIdentificationResult".equals(action)) {
			dispatchUrl = new ConfirmFindIdentificationResultController().handleRequest(req, resp);
		} else if ("dropIdentificationResult".equals(action)) {
			dispatchUrl = new DropIdentificationResultController().handleRequest(req, resp);
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
