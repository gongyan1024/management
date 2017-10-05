package zl.management.controller.AchievementAwardController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;

public class ConfirmAddAchievementAwardController implements Controller {
	private static AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		AchievementAward obj = ControllDeal.createObjByForm(request, response, AchievementAward.class);
		dao.add(obj);
		ControllDeal.sendMessage(request, response, "添加成功！1秒后为您自动跳到主页！！", "showAchievementAward");
		
		return null;
	}

}
