package zl.management.controller.AchievementAwardController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;

public class EditAchievementAwardController implements Controller {
	private static AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		AchievementAward obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/achievementAward/editAchievementAward.jsp";
	}

}
