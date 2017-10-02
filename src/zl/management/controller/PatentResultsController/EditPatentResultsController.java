package zl.management.controller.PatentResultsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsDaoImp;
import zl.management.domain.PatentResults;

public class EditPatentResultsController implements Controller {
	private static PatentResultsDaoImp dao = DAOFactory.getPatentResultsDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		PatentResults obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/patentResults/editPatentResults.jsp";
	}

}
