package zl.management.controller.ThesisController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ThesisDaoImp;
import zl.management.domain.Thesis;

public class ConfirmEditThesisController implements Controller {
	private static ThesisDaoImp dao = DAOFactory.getThesisDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		Thesis obj = ControllDeal.comfirmEditDomain(request, response, dao, Thesis.class);
		dao.update(obj);
		ControllDeal.sendMessage(request, response, "编辑成功！1秒后为您自动跳到主页！！", "showThesis");
		return null;
	}

}
