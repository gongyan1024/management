package zl.management.controller.MeetingHost;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostDaoImp;
import zl.management.domain.MeetingHost;

public class ExportMeetingHostController implements Controller {
	private static MeetingHostDaoImp dao = DAOFactory.getMeetingHostDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String[] headers = { "会议名称", "会议主题", "承办部门", "教研室", "学科门类", "一级学科", "会议地点", "会议类型", "开始日期", "结束日期", "论文数量",
				"国外代表数量", "代表人数", "会议联系人", "电话", "电邮", "是否形成综合报告或建议", "会议经费(万元)", "经费来源", "会议简介" };
		String fileName = "主办会议一览表";
		ControllDeal.exportExcel(request, response, dao, fileName, MeetingHost.class, headers);
		return null;
	}

}
