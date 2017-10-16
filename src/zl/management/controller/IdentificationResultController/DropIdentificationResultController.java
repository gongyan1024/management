package zl.management.controller.IdentificationResultController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.IdentificationResultDaoImp;
import zl.management.domain.IdentificationResult;

public class DropIdentificationResultController implements Controller {
	private IdentificationResultDaoImp dao = DAOFactory.getIdentificationResultDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resultPath = "showIdentificationResult?pageNumber=" + request.getParameter("pageNumber") + "&jump=1";
		ControllDeal.dropDomain(request, response, dao, IdentificationResult.class);
		try {
			response.sendRedirect(resultPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
