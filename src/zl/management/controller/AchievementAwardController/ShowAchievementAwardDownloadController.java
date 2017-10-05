package zl.management.controller.AchievementAwardController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardPathDaoImp;
import zl.management.domain.filePath.AchievementAwardPath;

public class ShowAchievementAwardDownloadController implements Controller {
	private static AchievementAwardPathDaoImp dao = DAOFactory.getAchievementAwardPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/achievementAward/achievementAwardFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, AchievementAwardPath.class, "showAchievementAward", resPath);
	}
}
