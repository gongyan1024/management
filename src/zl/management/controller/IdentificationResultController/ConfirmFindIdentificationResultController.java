package zl.management.controller.IdentificationResultController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.IdentificationResultDaoImp;
import zl.management.domain.IdentificationResult;

public class ConfirmFindIdentificationResultController implements Controller {
	private IdentificationResultDaoImp dao = DAOFactory.getIdentificationResultDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		String outcomeName = "%" + request.getParameter("outcomeName") + "%";
		String subordinateUnit = request.getParameter("subordinateUnit");
		String firstAuthorType = request.getParameter("firstAuthorType");
		String firstAuthorName = request.getParameter("firstAuthorName");
		String auditStatus = request.getParameter("auditStatus");
		String firstAuthorNumber = request.getParameter("firstAuthorNumber");
		String author = "%" + request.getParameter("author") + "%";

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("outcomeName", outcomeName);
		params.put("subordinateUnit", subordinateUnit);
		params.put("firstAuthorType", firstAuthorType);
		params.put("firstAuthorName", firstAuthorName);
		params.put("auditStatus", auditStatus);
		params.put("firstAuthorNumber", firstAuthorNumber);
		params.put("author", author);

		ControllDeal.showDomain(request, response, dao, IdentificationResult.class, params);
		return "/WEB-INF/jsp/identificationResult/showIdentificationResult.jsp";
	}
}
