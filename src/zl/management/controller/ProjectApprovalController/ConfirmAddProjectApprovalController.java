package zl.management.controller.ProjectApprovalController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalDaoImp;
import zl.management.domain.ProjectApproval;

public class ConfirmAddProjectApprovalController implements Controller {
	private static ProjectApprovalDaoImp dao = DAOFactory.getProjectApprovalDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.createObjByForm(request, response, ProjectApproval.class, dao);
		ControllDeal.sendMessage(request, response, "添加成功！1秒后为您自动跳到主页！！", "showProjectApproval");
		
		return null;
	}

}
