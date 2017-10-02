package zl.management.controller.ResearcherController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchersDaoImp;
import zl.management.domain.Researchers;

public class ConfirmEditController implements Controller {
	private ResearchersDaoImp dao = DAOFactory.getResearchersDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		Researchers r = ControllDeal.comfirmEditDomain(request, response, dao, Researchers.class);
		dao.update(r);
		ControllDeal.sendMessage(request, response, "编辑成功！1秒后为您自动跳到主页！！", "showResearchs");
		return null;
	}
}
