package zl.management.controller.ProjectApprovalController;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalDaoImp;
import zl.management.domain.ProjectApproval;

public class ShowProjectApprovalController implements Controller {
	private static ProjectApprovalDaoImp dao = DAOFactory.getProjectApprovalDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> params = ControllDeal.judgeIsFind(request, response);
		ControllDeal.showDomain(request, response, dao, ProjectApproval.class, params);
		return "/WEB-INF/jsp/projectApproval/showProjectApproval.jsp";
	}

}
