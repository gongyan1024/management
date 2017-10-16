package zl.management.controller.AchievementAwardController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;

public class ExportAchievementAwardController implements Controller {
	private static AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String[] headers = { "奖励名称", "第一完成人类型", "第一完成人", "成果名称", "所属单位", "教研室", "第一作者职工号", "获奖作者", "获奖人数", "发证机关",
				"获奖日期", "获奖级别", "获奖等级", "总参加单位数", "单位排名", "奖励批准号", "学科门类", "一级学科", "项目来源", "成果形式", "审核状态", "备注",
				"奖励类别" };
		String fileName = "成果获奖一览表";
		ControllDeal.exportExcel(request, response, dao, fileName, AchievementAward.class, headers);
		return null;
	}

}
