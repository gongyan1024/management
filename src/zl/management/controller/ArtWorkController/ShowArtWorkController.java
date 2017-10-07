package zl.management.controller.ArtWorkController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkDaoImp;
import zl.management.domain.ArtWork;

public class ShowArtWorkController implements Controller {
	private static ArtWorkDaoImp dao = DAOFactory.getArtWorkDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.showDomain(request, response, dao, ArtWork.class, null);
		return "/WEB-INF/jsp/artWork/showArtWork.jsp";
	}

}
