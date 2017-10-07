package zl.management.controller.ResearchReportController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchReportDaoImp;
import zl.management.domain.ResearchReport;

public class ReadResearchReportExcelController implements Controller {
	private ResearchReportDaoImp dao = DAOFactory.getResearchReportDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.readExcel(request, response, dao, ResearchReport.class, "showResearchReport", "研究报告表格", "reportTopic");
		return null;
	}

}
