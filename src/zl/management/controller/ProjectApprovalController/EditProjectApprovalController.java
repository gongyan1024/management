package zl.management.controller.ProjectApprovalController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalDaoImp;
import zl.management.domain.ProjectApproval;

public class EditProjectApprovalController implements Controller {
	private static ProjectApprovalDaoImp dao = DAOFactory.getProjectApprovalDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		ProjectApproval obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/projectApproval/editProjectApproval.jsp";
	}

}
