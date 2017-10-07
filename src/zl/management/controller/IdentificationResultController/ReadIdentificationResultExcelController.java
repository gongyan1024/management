package zl.management.controller.IdentificationResultController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.IdentificationResultDaoImp;
import zl.management.domain.IdentificationResult;

public class ReadIdentificationResultExcelController implements Controller {
	private IdentificationResultDaoImp dao = DAOFactory.getIdentificationResultDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.readExcel(request, response, dao, IdentificationResult.class, "showIdentificationResult", "鉴定成果表格", "outcomeName");

		return null;
	}
}
