package zl.management.controller.AttendMeetingController;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.domain.AttendMeeting;
import zl.management.util.ExcelUtil;

public class ExportAttendMeetingController implements Controller {
	private static AttendMeetingDaoImp dao = DAOFactory.getAttendMeetingDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<AttendMeeting> list = dao.list();
		String[] headers = { "参会人", "所属单位", "教研室", "会议名称", "主办单位", "会议类型", "学科门类", "参会地址", "参会日期", "是否提交论文", "论文题目",
				"是否特邀报告", "报告题目", "审核状态" };
		try {
			String fileName = "参加会议一览表";
			response.setContentType("application/x-download");
			response.setCharacterEncoding("utf-8");
			response.setHeader("Content-disposition",
					"attachment;filename=" + new String(fileName.getBytes("utf-8"), "iso8859-1") + ".xls");
			ExcelUtil.exportExcel(fileName, headers, list, response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
