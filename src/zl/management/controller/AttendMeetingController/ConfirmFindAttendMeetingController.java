package zl.management.controller.AttendMeetingController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.domain.AttendMeeting;

public class ConfirmFindAttendMeetingController implements Controller {
	private AttendMeetingDaoImp dao = DAOFactory.getAttendMeetingDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String conferenceName = "%" + request.getParameter("conferenceName") + "%";
		String attendee = request.getParameter("attendee");
		String sponsor = request.getParameter("sponsor");
		String participantDate = request.getParameter("participantDate");
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("attendee", attendee);
		params.put("conferenceName", conferenceName);
		params.put("sponsor", sponsor);
		params.put("participantDate", participantDate);
		
		ControllDeal.showDomain(request, response, dao, AttendMeeting.class, params);
		return "/WEB-INF/jsp/attendMeeting/showAttendMeeting.jsp";
	}
}
