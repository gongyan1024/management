package zl.management.controller.AttendMeetingController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.domain.AttendMeeting;

public class ExportAttendMeetingController implements Controller {
	private static AttendMeetingDaoImp dao = DAOFactory.getAttendMeetingDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String[] headers = { "参会人", "所属单位", "教研室", "会议名称", "主办单位", "会议类型", "学科门类", "参会地址", "参会日期", "是否提交论文", "论文题目",
				"是否特邀报告", "报告题目", "审核状态" };
		String fileName = "参加会议一览表";
		ControllDeal.exportExcel(request, response, dao, fileName, AttendMeeting.class, headers);
		return null;
	}

}
