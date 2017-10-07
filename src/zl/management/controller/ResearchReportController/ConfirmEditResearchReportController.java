package zl.management.controller.ResearchReportController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchReportDaoImp;
import zl.management.domain.ResearchReport;

public class ConfirmEditResearchReportController implements Controller {
	private static ResearchReportDaoImp dao = DAOFactory.getResearchReportDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.comfirmEditDomain(request, response, dao, ResearchReport.class);
		ControllDeal.sendMessage(request, response, "编辑成功！1秒后为您自动跳到主页！！", "showResearchReport");
		return null;
	}

}
