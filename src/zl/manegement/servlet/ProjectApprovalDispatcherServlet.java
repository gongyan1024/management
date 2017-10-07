package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ProjectApprovalController.ConfirmAddProjectApprovalController;
import zl.management.controller.ProjectApprovalController.ConfirmEditProjectApprovalController;
import zl.management.controller.ProjectApprovalController.ConfirmFindProjectApprovalController;
import zl.management.controller.ProjectApprovalController.DeleteProjectApprovalController;
import zl.management.controller.ProjectApprovalController.DownloadProjectApprovalController;
import zl.management.controller.ProjectApprovalController.DropProjectApprovalController;
import zl.management.controller.ProjectApprovalController.EditProjectApprovalController;
import zl.management.controller.ProjectApprovalController.ExportProjectApprovalController;
import zl.management.controller.ProjectApprovalController.ReadProjectApprovalExcelController;
import zl.management.controller.ProjectApprovalController.ShowProjectApprovalController;
import zl.management.controller.ProjectApprovalController.ShowProjectApprovalDetailController;
import zl.management.controller.ProjectApprovalController.ShowProjectApprovalDownloadController;
import zl.management.controller.ProjectApprovalController.UploadProjectApprovalController;

@WebServlet(name = "ProjectApprovalDispatcherServlet", urlPatterns = { "/showProjectApproval", "/exportProjectApproval",
		"/addProjectApproval", "/editProjectApproval", "/uploadProjectApproval", "/showDownloadProjectApproval",
		"/downloadProjectApproval", "/showProjectApprovalDetail", "/readExcelProjectApproval", "/deleteProjectApproval",
		"/findProjectApproval", "/confrimEditProjectApproval", "/confrimAddProjectApproval",
		"/confirmFindProjectApproval", "/dropProjectApproval" })

public class ProjectApprovalDispatcherServlet extends HttpServlet {

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

		if ("showProjectApproval".equals(action)) {
			dispatchUrl = new ShowProjectApprovalController().handleRequest(req, resp);
		} else if ("exportProjectApproval".equals(action)) {
			dispatchUrl = new ExportProjectApprovalController().handleRequest(req, resp);
		} else if ("addProjectApproval".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/projectApproval/addProjectApproval.jsp";
		} else if ("confrimAddProjectApproval".equals(action)) {
			dispatchUrl = new ConfirmAddProjectApprovalController().handleRequest(req, resp);
		} else if ("editProjectApproval".equals(action)) {
			dispatchUrl = new EditProjectApprovalController().handleRequest(req, resp);
		} else if ("confrimEditProjectApproval".equals(action)) {
			dispatchUrl = new ConfirmEditProjectApprovalController().handleRequest(req, resp);
		} else if ("uploadProjectApproval".equals(action)) {
			dispatchUrl = new UploadProjectApprovalController().handleRequest(req, resp);
		} else if ("showDownloadProjectApproval".equals(action)) {
			dispatchUrl = new ShowProjectApprovalDownloadController().handleRequest(req, resp);
		} else if ("downloadProjectApproval".equals(action)) {
			dispatchUrl = new DownloadProjectApprovalController().handleRequest(req, resp);
		} else if ("showProjectApprovalDetail".equals(action)) {
			dispatchUrl = new ShowProjectApprovalDetailController().handleRequest(req, resp);
		} else if ("readExcelProjectApproval".equals(action)) {
			dispatchUrl = new ReadProjectApprovalExcelController().handleRequest(req, resp);
		} else if ("deleteProjectApproval".equals(action)) {
			dispatchUrl = new DeleteProjectApprovalController().handleRequest(req, resp);
		} else if ("findProjectApproval".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/projectApproval/findProjectApproval.jsp";
		} else if ("confirmFindProjectApproval".equals(action)) {
			dispatchUrl = new ConfirmFindProjectApprovalController().handleRequest(req, resp);
		} else if ("dropProjectApproval".equals(action)) {
			dispatchUrl = new DropProjectApprovalController().handleRequest(req, resp);
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
