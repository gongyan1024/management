package zl.management.controller.ThesisController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ThesisDaoImp;
import zl.management.domain.Thesis;

public class ShowThesisDetailController implements Controller {
	private ThesisDaoImp dao = DAOFactory.getThesisDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		Thesis obj = dao.load(id);
		request.setAttribute("r", obj);
		return "/WEB-INF/jsp/thesis/showThesisDetail.jsp";
	}
}
