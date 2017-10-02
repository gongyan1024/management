package zl.management.controller.ResearcherController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchersPathDaoImp;
import zl.management.domain.filePath.ResearchersPath;

public class ShowDownloadResController implements Controller {
	private ResearchersPathDaoImp dao = DAOFactory.getResearchersPathDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/researchers/fileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, ResearchersPath.class, "showResearchs", resPath);
	}
}
