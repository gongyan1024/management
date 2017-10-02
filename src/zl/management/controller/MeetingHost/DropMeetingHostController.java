package zl.management.controller.MeetingHost;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostDaoImp;
import zl.management.domain.MeetingHost;

public class DropMeetingHostController implements Controller {
	private MeetingHostDaoImp dao = DAOFactory.getMeetingHostDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resultPath = "showMeetingHost";
		ControllDeal.dropDomain(request, response, dao, MeetingHost.class);
		try {
			response.sendRedirect(resultPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
