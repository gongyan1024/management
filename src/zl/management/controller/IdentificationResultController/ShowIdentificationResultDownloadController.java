package zl.management.controller.IdentificationResultController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.IdentificationResultPathDaoImp;
import zl.management.domain.filePath.IdentificationResultPath;

public class ShowIdentificationResultDownloadController implements Controller {
	private static IdentificationResultPathDaoImp dao = DAOFactory.getIdentificationResultPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/identificationResult/identificationResultFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, IdentificationResultPath.class, "showIdentificationResult", resPath);
	}
}
