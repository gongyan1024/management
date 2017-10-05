package zl.management.controller.MeetingHost;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostPathDaoImp;
import zl.management.domain.filePath.MeetingHostPath;

public class DeleteMeetingHostController implements Controller {
	private MeetingHostPathDaoImp dao = DAOFactory.getMeetingHostPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "showDownloadMeetingHost?id=" + request.getParameter("id");
		ControllDeal.deleteFile(request, response, dao, MeetingHostPath.class, resPath);
		return null;
	}
}
