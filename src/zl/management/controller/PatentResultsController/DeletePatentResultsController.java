package zl.management.controller.PatentResultsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsPathDaoImp;
import zl.management.domain.filePath.PatentResultsPath;

public class DeletePatentResultsController implements Controller {
	private PatentResultsPathDaoImp dao = DAOFactory.getPatentResultsPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "showDownloadPatentResults?id=" + request.getParameter("id");
		ControllDeal.deleteFile(request, response, dao, PatentResultsPath.class, resPath);
		return null;
	}
}
