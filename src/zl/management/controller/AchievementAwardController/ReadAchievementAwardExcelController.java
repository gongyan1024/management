package zl.management.controller.AchievementAwardController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;

public class ReadAchievementAwardExcelController implements Controller {
	private AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.readExcel(request, response, dao, AchievementAward.class, "showAchievementAward", "成果获奖表格", "bonusName");

		return null;
	}

}
