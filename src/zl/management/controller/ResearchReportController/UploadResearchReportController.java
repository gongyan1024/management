package zl.management.controller.ResearchReportController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchReportPathDaoImp;
import zl.management.domain.filePath.ResearchReportPath;

public class UploadResearchReportController implements Controller {
	private static ResearchReportPathDaoImp dao = DAOFactory.getResearchReportPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, ResearchReportPath.class, "editResearchReport");
		return null;
	}

}
