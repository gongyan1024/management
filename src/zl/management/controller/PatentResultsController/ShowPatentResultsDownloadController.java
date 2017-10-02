package zl.management.controller.PatentResultsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsPathDaoImp;
import zl.management.domain.filePath.PatentResultsPath;

public class ShowPatentResultsDownloadController implements Controller {
	private static PatentResultsPathDaoImp dao = DAOFactory.getPatentResultsPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/patentResults/patentResultsFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, PatentResultsPath.class, "showPatentResults", resPath);
	}
}
