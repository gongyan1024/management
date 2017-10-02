package zl.management.controller.PatentResultsController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsDaoImp;
import zl.management.domain.PatentResults;

public class DropPatentResultsController implements Controller {
	private PatentResultsDaoImp dao = DAOFactory.getPatentResultsDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resultPath = "showPatentResults";
		ControllDeal.dropDomain(request, response, dao, PatentResults.class);
		try {
			response.sendRedirect(resultPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
