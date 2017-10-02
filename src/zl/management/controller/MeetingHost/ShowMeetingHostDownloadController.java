package zl.management.controller.MeetingHost;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostPathDaoImp;
import zl.management.domain.filePath.MeetingHostPath;

public class ShowMeetingHostDownloadController implements Controller {
	private static MeetingHostPathDaoImp dao = DAOFactory.getMeetingHostPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/meetingHost/meetingHostFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, MeetingHostPath.class, "showMeetingHost", resPath);
	}
}
