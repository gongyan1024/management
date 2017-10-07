package zl.management.controller.ProjectApprovalController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalDaoImp;
import zl.management.domain.ProjectApproval;

public class ConfirmEditProjectApprovalController implements Controller {
	private static ProjectApprovalDaoImp dao = DAOFactory.getProjectApprovalDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.comfirmEditDomain(request, response, dao, ProjectApproval.class);
		ControllDeal.sendMessage(request, response, "编辑成功！1秒后为您自动跳到主页！！", "showProjectApproval");
		return null;
	}

}
