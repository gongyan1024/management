package zl.management.controller.PatentResultsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsDaoImp;
import zl.management.domain.PatentResults;

public class ReadPatentResultsExcelController implements Controller {
	private PatentResultsDaoImp dao = DAOFactory.getPatentResultsDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.readExcel(request, response, dao, PatentResults.class, "showPatentResults", "专利成果表格", "patentName");
		return null;
	}
}
