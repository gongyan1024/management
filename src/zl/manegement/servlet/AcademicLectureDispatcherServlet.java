package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.AcademicLectureController.ConfirmAddAcademicLectureController;
import zl.management.controller.AcademicLectureController.ConfirmEditAcademicLectureController;
import zl.management.controller.AcademicLectureController.ConfirmFindAcademicLectureController;
import zl.management.controller.AcademicLectureController.DeleteAcademicLectureController;
import zl.management.controller.AcademicLectureController.DownloadAcademicLectureController;
import zl.management.controller.AcademicLectureController.DropAcademicLectureController;
import zl.management.controller.AcademicLectureController.EditAcademicLectureController;
import zl.management.controller.AcademicLectureController.ExportAcademicLectureController;
import zl.management.controller.AcademicLectureController.ReadAcademicLectureExcelController;
import zl.management.controller.AcademicLectureController.ShowAcademicLectureController;
import zl.management.controller.AcademicLectureController.ShowAcademicLectureDetailController;
import zl.management.controller.AcademicLectureController.ShowAcademicLectureDownloadController;
import zl.management.controller.AcademicLectureController.UploadAcademicLectureController;

@WebServlet(name = "AcademicLectureDispatcherServlet", urlPatterns = { "/showAcademicLecture", "/exportAcademicLecture",
		"/addAcademicLecture", "/editAcademicLecture", "/uploadAcademicLecture", "/showDownloadAcademicLecture",
		"/downloadAcademicLecture", "/showAcademicLectureDetail", "/readExcelAcademicLecture", "/deleteAcademicLecture",
		"/findAcademicLecture", "/confrimEditAcademicLecture", "/confrimAddAcademicLecture",
		"/confirmFindAcademicLecture", "/dropAcademicLecture" })

public class AcademicLectureDispatcherServlet extends HttpServlet {

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

		if ("showAcademicLecture".equals(action)) {
			dispatchUrl = new ShowAcademicLectureController().handleRequest(req, resp);
		} else if ("exportAcademicLecture".equals(action)) {
			dispatchUrl = new ExportAcademicLectureController().handleRequest(req, resp);
		} else if ("addAcademicLecture".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/academicLecture/addAcademicLecture.jsp";
		} else if ("confrimAddAcademicLecture".equals(action)) {
			dispatchUrl = new ConfirmAddAcademicLectureController().handleRequest(req, resp);
		} else if ("editAcademicLecture".equals(action)) {
			dispatchUrl = new EditAcademicLectureController().handleRequest(req, resp);
		} else if ("confrimEditAcademicLecture".equals(action)) {
			dispatchUrl = new ConfirmEditAcademicLectureController().handleRequest(req, resp);
		} else if ("uploadAcademicLecture".equals(action)) {
			dispatchUrl = new UploadAcademicLectureController().handleRequest(req, resp);
		} else if ("showDownloadAcademicLecture".equals(action)) {
			dispatchUrl = new ShowAcademicLectureDownloadController().handleRequest(req, resp);
		} else if ("downloadAcademicLecture".equals(action)) {
			dispatchUrl = new DownloadAcademicLectureController().handleRequest(req, resp);
		} else if ("showAcademicLectureDetail".equals(action)) {
			dispatchUrl = new ShowAcademicLectureDetailController().handleRequest(req, resp);
		} else if ("readExcelAcademicLecture".equals(action)) {
			dispatchUrl = new ReadAcademicLectureExcelController().handleRequest(req, resp);
		} else if ("deleteAcademicLecture".equals(action)) {
			dispatchUrl = new DeleteAcademicLectureController().handleRequest(req, resp);
		} else if ("findAcademicLecture".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/academicLecture/findAcademicLecture.jsp";
		} else if ("confirmFindAcademicLecture".equals(action)) {
			dispatchUrl = new ConfirmFindAcademicLectureController().handleRequest(req, resp);
		} else if ("dropAcademicLecture".equals(action)) {
			dispatchUrl = new DropAcademicLectureController().handleRequest(req, resp);
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
