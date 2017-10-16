package zl.management.controller.ProjectApprovalController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalDaoImp;
import zl.management.domain.ProjectApproval;

public class ConfirmFindProjectApprovalController implements Controller {
	private ProjectApprovalDaoImp dao = DAOFactory.getProjectApprovalDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String entryName = "%" + request.getParameter("entryName").trim() + "%";
		String projectNumber = request.getParameter("projectNumber").trim();
		String personInCharge = request.getParameter("personInCharge").trim();
		String projectMembers = "%" + request.getParameter("projectMembers").trim() + "%";
		String projectStatus = request.getParameter("projectStatus").trim();
		String projectYear = request.getParameter("projectYear").trim();
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("entryName", entryName);
		params.put("projectNumber", projectNumber);
		params.put("personInCharge", personInCharge);
		params.put("projectMembers", projectMembers);
		params.put("projectStatus", projectStatus);
		params.put("projectYear", projectYear);
		
		request.getSession().setAttribute("isFind", "1");
		request.getSession().setAttribute("findParams", params);
		ControllDeal.showDomain(request, response, dao, ProjectApproval.class, params);
		return "/WEB-INF/jsp/projectApproval/showProjectApproval.jsp";
	}
}
