package zl.management.controller.ResearcherController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchersDaoImp;
import zl.management.domain.Researchers;

public class ReadResearcherController implements Controller {
	private ResearchersDaoImp dao = DAOFactory.getResearchersDao();
	
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.readExcel(request, response, dao, Researchers.class, "showResearchs", "科研人士表格", "staffNumber");
		return null;
	}

}
