package zl.management.controller.AttendMeetingController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.domain.AttendMeeting;

public class ShowAttendMeetingController implements Controller {
	private static AttendMeetingDaoImp dao = DAOFactory.getAttendMeetingDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.showDomain(request, response, dao, AttendMeeting.class, null);
		return "/WEB-INF/jsp/attendMeeting/showAttendMeeting.jsp";
	}

}
