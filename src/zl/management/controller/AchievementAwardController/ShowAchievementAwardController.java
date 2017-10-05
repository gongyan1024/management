package zl.management.controller.AchievementAwardController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;

public class ShowAchievementAwardController implements Controller {
	private static AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.showDomain(request, response, dao, AchievementAward.class, null);
		return "/WEB-INF/jsp/achievementAward/showAchievementAward.jsp";
	}

}
