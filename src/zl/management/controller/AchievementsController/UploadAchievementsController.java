package zl.management.controller.AchievementsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementsPathDaoImp;
import zl.management.domain.filePath.AchievementsPath;

public class UploadAchievementsController implements Controller {
	private static AchievementsPathDaoImp dao = DAOFactory.getAchievementsPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, AchievementsPath.class, "editAchievements");
		return null;
	}

}
