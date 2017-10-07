package zl.management.controller.ProjectApprovalController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalDaoImp;
import zl.management.domain.ProjectApproval;

public class DropProjectApprovalController implements Controller {
	private ProjectApprovalDaoImp dao = DAOFactory.getProjectApprovalDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resultPath = "showProjectApproval";
		ControllDeal.dropDomain(request, response, dao, ProjectApproval.class);
		try {
			response.sendRedirect(resultPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
