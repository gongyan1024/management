package zl.management.controller.AchievementsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementsDaoImp;
import zl.management.domain.Achievements;

public class ShowAchievementsController implements Controller {
	private static AchievementsDaoImp dao = DAOFactory.getAchievementsDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.showDomain(request, response, dao, Achievements.class, null);
		return "/WEB-INF/jsp/achievements/showAchievements.jsp";
	}

}
