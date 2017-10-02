package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.AttendMeetingController.ConfirmAddAttendMeetingController;
import zl.management.controller.AttendMeetingController.ConfirmEditAttendMeetingController;
import zl.management.controller.AttendMeetingController.ConfirmFindAttendMeetingController;
import zl.management.controller.AttendMeetingController.DeleteAttendMeetingController;
import zl.management.controller.AttendMeetingController.DownloadAttendMeetingController;
import zl.management.controller.AttendMeetingController.EditAttendMeetingController;
import zl.management.controller.AttendMeetingController.ExportAttendMeetingController;
import zl.management.controller.AttendMeetingController.ReadAttendMeetingExcelController;
import zl.management.controller.AttendMeetingController.ShowAttendMeetingController;
import zl.management.controller.AttendMeetingController.ShowAttendingMeetingDetailController;
import zl.management.controller.AttendMeetingController.ShowAttendMeetingDownloadController;
import zl.management.controller.AttendMeetingController.UploadAttendMeetingController;

@WebServlet(name = "AttendMeetingDispatcherServlet", urlPatterns = { "/showAttendMeeting", "/exportAttendMeeting",
		"/addAttendMeeting", "/editAttendMeeting", "/uploadAttendMeeting", "/showDownloadAttendMeeting",
		"/downloadAttendMeeting", "/showAttendMeetingDetail", "/readExcelAttendMeeting", "/deleteAttendMeeting",
		"/findAttendMeeting", "/confrimEditAttendMeeting", "/confrimAddAttendMeeting", "/confirmFindAttendMeeting" })

public class AttendMeetingDispatcherServlet extends HttpServlet {

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

		if ("showAttendMeeting".equals(action)) {
			dispatchUrl = new ShowAttendMeetingController().handleRequest(req, resp);
		} else if ("exportAttendMeeting".equals(action)) {
			dispatchUrl = new ExportAttendMeetingController().handleRequest(req, resp);
		} else if ("addAttendMeeting".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/attendMeeting/addAttendMeeting.jsp";
		} else if ("confrimAddAttendMeeting".equals(action)) {
			dispatchUrl = new ConfirmAddAttendMeetingController().handleRequest(req, resp);
		} else if ("editAttendMeeting".equals(action)) {
			dispatchUrl = new EditAttendMeetingController().handleRequest(req, resp);
		} else if ("confrimEditAttendMeeting".equals(action)) {
			dispatchUrl = new ConfirmEditAttendMeetingController().handleRequest(req, resp);
		} else if ("uploadAttendMeeting".equals(action)) {
			dispatchUrl = new UploadAttendMeetingController().handleRequest(req, resp);
		} else if ("showDownloadAttendMeeting".equals(action)) {
			dispatchUrl = new ShowAttendMeetingDownloadController().handleRequest(req, resp);
		} else if ("downloadAttendMeeting".equals(action)) {
			dispatchUrl = new DownloadAttendMeetingController().handleRequest(req, resp);
		} else if ("showAttendMeetingDetail".equals(action)) {
			dispatchUrl = new ShowAttendingMeetingDetailController().handleRequest(req, resp);
		} else if ("readExcelAttendMeeting".equals(action)) {
			dispatchUrl = new ReadAttendMeetingExcelController().handleRequest(req, resp);
		} else if ("deleteAttendMeeting".equals(action)) {
			dispatchUrl = new DeleteAttendMeetingController().handleRequest(req, resp);
		} else if ("findAttendMeeting".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/attendMeeting/findAttendMeeting.jsp";
			;
		} else if ("confirmFindAttendMeeting".equals(action)) {
			dispatchUrl = new ConfirmFindAttendMeetingController().handleRequest(req, resp);
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
