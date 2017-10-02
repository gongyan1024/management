package zl.management.controller.MeetingHost;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostPathDaoImp;
import zl.management.domain.filePath.MeetingHostPath;

public class UploadMeetingHostController implements Controller {
	private static MeetingHostPathDaoImp dao = DAOFactory.getMeetingHostPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, MeetingHostPath.class, "editMeetingHost");
		return null;
	}

}
