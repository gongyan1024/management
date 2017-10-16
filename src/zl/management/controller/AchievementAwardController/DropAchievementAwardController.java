package zl.management.controller.AchievementAwardController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;

public class DropAchievementAwardController implements Controller {
	private AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resultPath = "showAchievementAward?pageNumber=" + request.getParameter("pageNumber") + "&jump=1";
		ControllDeal.dropDomain(request, response, dao, AchievementAward.class);
		try {
			response.sendRedirect(resultPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
