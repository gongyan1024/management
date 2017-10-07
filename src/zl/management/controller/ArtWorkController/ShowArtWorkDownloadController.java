package zl.management.controller.ArtWorkController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkPathDaoImp;
import zl.management.domain.filePath.ArtWorkPath;

public class ShowArtWorkDownloadController implements Controller {
	private static ArtWorkPathDaoImp dao = DAOFactory.getArtWorkPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "WEB-INF/jsp/artWork/artWorkFileList.jsp?id=" + request.getParameter("id");
		return ControllDeal.showDownload(request, response, dao, ArtWorkPath.class, "showArtWork", resPath);
	}
}
