package zl.management.controller.ThesisController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ThesisPathDaoImp;
import zl.management.domain.filePath.ThesisPath;

public class ShowThesisDownloadController implements Controller {
	private static ThesisPathDaoImp dao = DAOFactory.getThesisPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/thesis/thesisFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, ThesisPath.class, "showThesis", resPath);
	}
}
