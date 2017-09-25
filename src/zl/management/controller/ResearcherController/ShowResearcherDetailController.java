package zl.management.controller.ResearcherController;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;

public class ShowResearcherDetailController implements Controller {
	private ResearchersDao dao = DAOFactory.getResearchersDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		Researchers r = dao.load(id);
		request.setAttribute("r", r);
		
		return "/WEB-INF/jsp/showResearcherDetail.jsp";
	}

}
