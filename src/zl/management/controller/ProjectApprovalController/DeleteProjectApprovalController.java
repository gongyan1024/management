package zl.management.controller.ProjectApprovalController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalPathDaoImp;
import zl.management.domain.filePath.ProjectApprovalPath;

public class DeleteProjectApprovalController implements Controller {
	private ProjectApprovalPathDaoImp dao = DAOFactory.getProjectApprovalPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "showDownloadProjectApproval?id=" + request.getParameter("id");
		ControllDeal.deleteFile(request, response, dao, ProjectApprovalPath.class, resPath);
		return null;
	}
}
