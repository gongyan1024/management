package zl.management.controller.AttendMeetingController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AttendMeetingPathDaoImp;
import zl.management.domain.filePath.AttendMeetingPath;

public class UploadAttendMeetingController implements Controller {
	private static AttendMeetingPathDaoImp dao = DAOFactory.getAttendMeetingPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, AttendMeetingPath.class, "editAttendMeeting");
		return null;
	}

}
