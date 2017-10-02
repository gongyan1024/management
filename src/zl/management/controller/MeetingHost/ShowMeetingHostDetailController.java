package zl.management.controller.MeetingHost;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostDaoImp;
import zl.management.domain.MeetingHost;

public class ShowMeetingHostDetailController implements Controller {
	private MeetingHostDaoImp dao = DAOFactory.getMeetingHostDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		MeetingHost obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/meetingHost/showMeetingHostDetail.jsp";
	}
}
