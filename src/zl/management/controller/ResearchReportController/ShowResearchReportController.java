package zl.management.controller.ResearchReportController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchReportDaoImp;
import zl.management.domain.ResearchReport;

public class ShowResearchReportController implements Controller {
	private static ResearchReportDaoImp dao = DAOFactory.getResearchReportDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.showDomain(request, response, dao, ResearchReport.class, null);
		return "/WEB-INF/jsp/researchReport/showResearchReport.jsp";
	}

}
