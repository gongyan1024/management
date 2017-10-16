package zl.management.controller.MeetingHost;

import java.util.Map;

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
		Map<String, Object> params = ControllDeal.judgeIsFind(request, response);
		ControllDeal.showDomain(request, response, dao, MeetingHost.class, params);
		return "/WEB-INF/jsp/meetingHost/showMeetingHost.jsp";
	}

}
