package zl.management.controller.ArtWorkController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkPathDaoImp;
import zl.management.domain.filePath.ArtWorkPath;

public class DeleteArtWorkController implements Controller {
	private ArtWorkPathDaoImp dao = DAOFactory.getArtWorkPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "showDownloadArtWork?id=" + request.getParameter("id");
		ControllDeal.deleteFile(request, response, dao, ArtWorkPath.class, resPath);
		return null;
	}
}
