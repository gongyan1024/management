package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.MeetingHost.ConfirmAddMeetingHostController;
import zl.management.controller.MeetingHost.ConfirmEditMeetingHostController;
import zl.management.controller.MeetingHost.ConfirmFindMeetingHostController;
import zl.management.controller.MeetingHost.DeleteMeetingHostController;
import zl.management.controller.MeetingHost.DownloadMeetingHostController;
import zl.management.controller.MeetingHost.DropMeetingHostController;
import zl.management.controller.MeetingHost.EditMeetingHostController;
import zl.management.controller.MeetingHost.ExportMeetingHostController;
import zl.management.controller.MeetingHost.ReadMeetingHostExcelController;
import zl.management.controller.MeetingHost.ShowMeetingHostController;
import zl.management.controller.MeetingHost.ShowMeetingHostDetailController;
import zl.management.controller.MeetingHost.ShowMeetingHostDownloadController;
import zl.management.controller.MeetingHost.UploadMeetingHostController;

@WebServlet(name = "MeetingHostDispatcherServlet", urlPatterns = { "/showMeetingHost", "/exportMeetingHost",
		"/addMeetingHost", "/editMeetingHost", "/uploadMeetingHost", "/showDownloadMeetingHost", "/downloadMeetingHost",
		"/showMeetingHostDetail", "/readExcelMeetingHost", "/deleteMeetingHost", "/findMeetingHost",
		"/confrimEditMeetingHost", "/confrimAddMeetingHost", "/confirmFindMeetingHost", "/dropMeetingHost" })

public class MeetingHostDispatcherServlet extends HttpServlet {

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

		if ("showMeetingHost".equals(action)) {
			dispatchUrl = new ShowMeetingHostController().handleRequest(req, resp);
		} else if ("exportMeetingHost".equals(action)) {
			dispatchUrl = new ExportMeetingHostController().handleRequest(req, resp);
		} else if ("addMeetingHost".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/meetingHost/addMeetingHost.jsp";
		} else if ("confrimAddMeetingHost".equals(action)) {
			dispatchUrl = new ConfirmAddMeetingHostController().handleRequest(req, resp);
		} else if ("editMeetingHost".equals(action)) {
			dispatchUrl = new EditMeetingHostController().handleRequest(req, resp);
		} else if ("confrimEditMeetingHost".equals(action)) {
			dispatchUrl = new ConfirmEditMeetingHostController().handleRequest(req, resp);
		} else if ("uploadMeetingHost".equals(action)) {
			dispatchUrl = new UploadMeetingHostController().handleRequest(req, resp);
		} else if ("showDownloadMeetingHost".equals(action)) {
			dispatchUrl = new ShowMeetingHostDownloadController().handleRequest(req, resp);
		} else if ("downloadMeetingHost".equals(action)) {
			dispatchUrl = new DownloadMeetingHostController().handleRequest(req, resp);
		} else if ("showMeetingHostDetail".equals(action)) {
			dispatchUrl = new ShowMeetingHostDetailController().handleRequest(req, resp);
		} else if ("readExcelMeetingHost".equals(action)) {
			dispatchUrl = new ReadMeetingHostExcelController().handleRequest(req, resp);
		} else if ("deleteMeetingHost".equals(action)) {
			dispatchUrl = new DeleteMeetingHostController().handleRequest(req, resp);
		} else if ("findMeetingHost".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/meetingHost/findMeetingHost.jsp";
		} else if ("confirmFindMeetingHost".equals(action)) {
			dispatchUrl = new ConfirmFindMeetingHostController().handleRequest(req, resp);
		} else if ("dropMeetingHost".equals(action)) {
			dispatchUrl = new DropMeetingHostController().handleRequest(req, resp);
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
