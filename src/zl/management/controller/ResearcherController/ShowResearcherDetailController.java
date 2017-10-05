package zl.management.controller.ResearcherController;

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
		Researchers r = null;
		if (request.getParameter("id") != null) {
			int id = Integer.parseInt(request.getParameter("id"));
			r = dao.load(id);
		} else {
			String staffNum = request.getParameter("staffNum"); 
			r = dao.loadByStaffNum(staffNum);
		}
		request.setAttribute("r", r);

		return "/WEB-INF/jsp/researchers/showResearcherDetail.jsp";
	}

}
