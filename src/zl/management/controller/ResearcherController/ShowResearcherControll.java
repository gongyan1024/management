package zl.management.controller.ResearcherController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchersDaoImp;
import zl.management.domain.Researchers;

public class ShowResearcherControll implements Controller {
	private static ResearchersDaoImp dao = DAOFactory.getResearchersDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.showDomain(request, response, dao, Researchers.class, null);
		return "/WEB-INF/jsp/researchers/showResearcher.jsp";
	}

}
