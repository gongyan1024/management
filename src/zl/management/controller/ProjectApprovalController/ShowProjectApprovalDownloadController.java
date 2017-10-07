package zl.management.controller.ProjectApprovalController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalPathDaoImp;
import zl.management.domain.filePath.ProjectApprovalPath;

public class ShowProjectApprovalDownloadController implements Controller {
	private static ProjectApprovalPathDaoImp dao = DAOFactory.getProjectApprovalPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/projectApproval/projectApprovalFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, ProjectApprovalPath.class, "showProjectApproval", resPath);
	}
}
