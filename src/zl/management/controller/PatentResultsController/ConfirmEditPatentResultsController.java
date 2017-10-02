package zl.management.controller.PatentResultsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsDaoImp;
import zl.management.domain.PatentResults;

public class ConfirmEditPatentResultsController implements Controller {
	private static PatentResultsDaoImp dao = DAOFactory.getPatentResultsDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		PatentResults obj = ControllDeal.comfirmEditDomain(request, response, dao, PatentResults.class);
		dao.update(obj);
		ControllDeal.sendMessage(request, response, "编辑成功！1秒后为您自动跳到主页！！", "showPatentResults");
		return null;
	}

}
