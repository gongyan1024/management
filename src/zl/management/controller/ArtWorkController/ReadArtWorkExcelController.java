package zl.management.controller.ArtWorkController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkDaoImp;
import zl.management.domain.ArtWork;

public class ReadArtWorkExcelController implements Controller {
	private ArtWorkDaoImp dao = DAOFactory.getArtWorkDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.readExcel(request, response, dao, ArtWork.class, "showArtWork", "艺术作品表格", "resultsName");
		return null;
	}

}
