package zl.management.controller.PatentResultsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsPathDaoImp;
import zl.management.domain.filePath.PatentResultsPath;

public class UploadPatentResultsController implements Controller {
	private static PatentResultsPathDaoImp dao = DAOFactory.getPatentResultsPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, PatentResultsPath.class, "editPatentResults");
		return null;
	}

}
