package zl.management.controller.ArtWorkController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkDaoImp;
import zl.management.domain.ArtWork;

public class DropArtWorkController implements Controller {
	private ArtWorkDaoImp dao = DAOFactory.getArtWorkDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resultPath = "showArtWork?pageNumber=" + request.getParameter("pageNumber") + "&jump=1";
		ControllDeal.dropDomain(request, response, dao, ArtWork.class);
		try {
			response.sendRedirect(resultPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
