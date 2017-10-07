package zl.management.controller.IdentificationResultController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.IdentificationResultDaoImp;
import zl.management.domain.IdentificationResult;

public class EditIdentificationResultController implements Controller {
	private static IdentificationResultDaoImp dao = DAOFactory.getIdentificationResultDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		IdentificationResult obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/identificationResult/editIdentificationResult.jsp";
	}

}
