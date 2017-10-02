package zl.management.controller.PatentResultsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsDaoImp;
import zl.management.domain.PatentResults;

public class ShowPatentResultsDetailController implements Controller {
	private PatentResultsDaoImp dao = DAOFactory.getPatentResultsDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		PatentResults al = dao.load(id);
		request.setAttribute("r", al);
		return "/WEB-INF/jsp/patentResults/showPatentResultsDetail.jsp";
	}
}
