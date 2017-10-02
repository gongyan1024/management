package zl.management.controller.MeetingHost;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostDaoImp;
import zl.management.domain.MeetingHost;

public class ShowMeetingHostController implements Controller {
	private static MeetingHostDaoImp dao = DAOFactory.getMeetingHostDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.showDomain(request, response, dao, MeetingHost.class, null);
		return "/WEB-INF/jsp/meetingHost/showMeetingHost.jsp";
	}

}
