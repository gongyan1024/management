package zl.management.controller.ResearchReportController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchReportDaoImp;
import zl.management.domain.ResearchReport;

public class EditResearchReportController implements Controller {
	private static ResearchReportDaoImp dao = DAOFactory.getResearchReportDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		ResearchReport obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/researchReport/editResearchReport.jsp";
	}

}
