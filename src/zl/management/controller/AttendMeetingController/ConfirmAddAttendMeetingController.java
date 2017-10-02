package zl.management.controller.AttendMeetingController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.domain.AttendMeeting;

public class ConfirmAddAttendMeetingController implements Controller {
	private static AttendMeetingDaoImp dao = DAOFactory.getAttendMeetingDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		AttendMeeting atm = ControllDeal.createObjByForm(request, response, AttendMeeting.class);
		dao.add(atm);
		ControllDeal.sendMessage(request, response, "添加成功！1秒后为您自动跳到主页！！", "showAttendMeeting");
		
		return null;
	}

}
