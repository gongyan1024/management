package zl.management.controller.ResearchReportController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchReportPathDaoImp;
import zl.management.domain.filePath.ResearchReportPath;

public class ShowResearchReportDownloadController implements Controller {
	private static ResearchReportPathDaoImp dao = DAOFactory.getResearchReportPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/researchReport/researchReportFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, ResearchReportPath.class, "showResearchReport", resPath);
	}
}
