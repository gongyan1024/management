package zl.management.controller.AttendMeetingController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AttendMeetingPathDaoImp;
import zl.management.domain.filePath.AttendMeetingPath;

public class ShowAttendMeetingDownloadController implements Controller {
	private static AttendMeetingPathDaoImp dao = DAOFactory.getAttendMeetingPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/attendMeeting/attendMeetingFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, AttendMeetingPath.class, "showAttendMeeting", resPath);
	}
}
