package zl.management.controller.AchievementAwardController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;

public class ConfirmEditAchievementAwardController implements Controller {
	private static AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		AchievementAward obj = ControllDeal.comfirmEditDomain(request, response, dao, AchievementAward.class);
		dao.update(obj);
		ControllDeal.sendMessage(request, response, "编辑成功！1秒后为您自动跳到主页！！", "showAchievementAward");
		return null;
	}

}
