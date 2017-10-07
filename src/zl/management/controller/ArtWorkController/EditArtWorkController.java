package zl.management.controller.ArtWorkController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkDaoImp;
import zl.management.domain.ArtWork;

public class EditArtWorkController implements Controller {
	private static ArtWorkDaoImp dao = DAOFactory.getArtWorkDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		ArtWork obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/artWork/editArtWork.jsp";
	}

}
