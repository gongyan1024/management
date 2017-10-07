package zl.management.controller.ProjectApprovalController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalPathDaoImp;
import zl.management.domain.filePath.ProjectApprovalPath;

public class UploadProjectApprovalController implements Controller {
	private static ProjectApprovalPathDaoImp dao = DAOFactory.getProjectApprovalPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, ProjectApprovalPath.class, "editProjectApproval");
		return null;
	}

}
