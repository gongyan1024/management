package zl.management.controller.ArtWorkController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkPathDaoImp;
import zl.management.domain.filePath.ArtWorkPath;

public class UploadArtWorkController implements Controller {
	private static ArtWorkPathDaoImp dao = DAOFactory.getArtWorkPathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.uploadFile(request, response, dao, ArtWorkPath.class, "editArtWork");
		return null;
	}

}
