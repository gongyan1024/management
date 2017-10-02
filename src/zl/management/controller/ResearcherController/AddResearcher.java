package zl.management.controller.ResearcherController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;

public class AddResearcher implements Controller {
	private ResearchersDao dao = DAOFactory.getResearchersDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		Researchers r = ControllDeal.createObjByForm(request, response, Researchers.class);
		dao.add(r);
		ControllDeal.sendMessage(request, response, "添加成功！1秒后为您自动跳到主页！！", "showResearchs");

		return null;
	}
}
