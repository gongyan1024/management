package zl.management.controller.AttendMeetingController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.domain.AttendMeeting;

public class EditAttendMeetingController implements Controller {
	private static AttendMeetingDaoImp dao = DAOFactory.getAttendMeetingDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		AttendMeeting atm = dao.load(id);
		request.setAttribute("r", atm);
		return "/WEB-INF/jsp/attendMeeting/editAttendMeeting.jsp";
	}

}
