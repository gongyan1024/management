package zl.management.controller.ThesisController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ThesisPathDaoImp;
import zl.management.domain.filePath.ThesisPath;

public class DeleteThesisController implements Controller {
	private ThesisPathDaoImp dao = DAOFactory.getThesisPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "showDownloadThesis?id=" + request.getParameter("id");
		ControllDeal.deleteFile(request, response, dao, ThesisPath.class, resPath);
		return null;
	}
}
