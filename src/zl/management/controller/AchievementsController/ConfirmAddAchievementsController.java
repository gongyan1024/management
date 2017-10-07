package zl.management.controller.AchievementsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementsDaoImp;
import zl.management.domain.Achievements;

public class ConfirmAddAchievementsController implements Controller {
	private static AchievementsDaoImp dao = DAOFactory.getAchievementsDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.createObjByForm(request, response, Achievements.class, dao);
		ControllDeal.sendMessage(request, response, "添加成功！1秒后为您自动跳到主页！！", "showAchievements");
		return null;
	}

}
