package zl.management.controller.ThesisController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ThesisDaoImp;
import zl.management.domain.Thesis;

public class ShowThesisController implements Controller {
	private static ThesisDaoImp dao = DAOFactory.getThesisDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.showDomain(request, response, dao, Thesis.class, null);
		return "/WEB-INF/jsp/thesis/showThesis.jsp";
	}

}
