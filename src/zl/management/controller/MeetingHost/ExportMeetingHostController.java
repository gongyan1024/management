package zl.management.controller.MeetingHost;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostDaoImp;
import zl.management.domain.MeetingHost;
import zl.management.util.ExcelUtil;

public class ExportMeetingHostController implements Controller {
	private static MeetingHostDaoImp dao = DAOFactory.getMeetingHostDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<MeetingHost> list = dao.list();
		String[] headers = { "会议名称", "会议主题", "承办部门", "教研室", "学科门类", "一级学科", "会议地点", "会议类型", "开始日期", "结束日期", "论文数量",
				"国外代表数量", "代表人数", "会议联系人", "电话", "电邮", "是否形成综合报告或建议", "会议经费(万元)", "经费来源", "会议简介" };
		try {
			String fileName = "主办会议一览表";
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
