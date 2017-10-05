package zl.management.controller.AchievementAwardController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardPathDaoImp;
import zl.management.domain.filePath.AchievementAwardPath;

public class UploadAchievementAwardController implements Controller {
	private static AchievementAwardPathDaoImp dao = DAOFactory.getAchievementAwardPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, AchievementAwardPath.class, "editAchievementAward");
		return null;
	}

}
