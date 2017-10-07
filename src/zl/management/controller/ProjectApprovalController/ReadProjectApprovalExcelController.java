package zl.management.controller.ProjectApprovalController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalDaoImp;
import zl.management.domain.ProjectApproval;

public class ReadProjectApprovalExcelController implements Controller {
	private ProjectApprovalDaoImp dao = DAOFactory.getProjectApprovalDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.readExcel(request, response, dao, ProjectApproval.class, "showProjectApproval", "项目立项表格", "entryName");

		return null;
	}

}
