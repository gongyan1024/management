package zl.management.controller.AchievementAwardController;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;
import zl.management.util.ExcelUtil;

public class ExportAchievementAwardController implements Controller {
	private static AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<AchievementAward> list = dao.list();
		String[] headers = { "奖励名称", "第一完成人类型", "第一完成人", "成果名称", "所属单位", "教研室", "第一作者职工号", "获奖作者", "获奖人数", "发证机关",
				"获奖日期", "获奖级别", "获奖等级", "总参加单位数", "单位排名", "奖励批准号", "学科门类", "一级学科", "项目来源", "成果形式", "审核状态", "备注",
				"奖励类别" };
		try {
			String fileName = "成果获奖一览表";
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
