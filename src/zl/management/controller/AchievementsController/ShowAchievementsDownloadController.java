package zl.management.controller.AchievementsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementsPathDaoImp;
import zl.management.domain.filePath.AchievementsPath;

public class ShowAchievementsDownloadController implements Controller {
	private static AchievementsPathDaoImp dao = DAOFactory.getAchievementsPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/achievements/achievementsFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, AchievementsPath.class, "showAchievements", resPath);
	}
}
