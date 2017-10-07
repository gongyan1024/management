package zl.management.controller.IdentificationResultController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.IdentificationResultPathDaoImp;
import zl.management.domain.filePath.IdentificationResultPath;

public class UploadIdentificationResultController implements Controller {
	private static IdentificationResultPathDaoImp dao = DAOFactory.getIdentificationResultPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, IdentificationResultPath.class, "editIdentificationResult");
		return null;
	}

}
