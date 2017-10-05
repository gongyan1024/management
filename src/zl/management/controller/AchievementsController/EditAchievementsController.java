package zl.management.controller.AchievementsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementsDaoImp;
import zl.management.domain.Achievements;

public class EditAchievementsController implements Controller {
	private static AchievementsDaoImp dao = DAOFactory.getAchievementsDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		Achievements obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/achievements/editAchievements.jsp";
	}

}
