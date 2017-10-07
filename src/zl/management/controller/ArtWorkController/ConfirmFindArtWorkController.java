package zl.management.controller.ArtWorkController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkDaoImp;
import zl.management.domain.ArtWork;

public class ConfirmFindArtWorkController implements Controller {
	private ArtWorkDaoImp dao = DAOFactory.getArtWorkDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String resultsName = "%" + request.getParameter("resultsName") + "%";
		String firstAuthorName = request.getParameter("firstAuthorName");
		String researchSection = request.getParameter("researchSection");
		String author = "%" + request.getParameter("author") + "%";
		String firstAuthorNumber = request.getParameter("firstAuthorNumber");
		String auditStatus = request.getParameter("auditStatus");
		String resultsType = request.getParameter("resultsType");
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("resultsName", resultsName);
		params.put("firstAuthorName", firstAuthorName);
		params.put("researchSection", researchSection);
		params.put("author", author);
		params.put("firstAuthorNumber", firstAuthorNumber);
		params.put("auditStatus", auditStatus);
		params.put("resultsType", resultsType);
		
		ControllDeal.showDomain(request, response, dao, ArtWork.class, params);
		return "/WEB-INF/jsp/artWork/showArtWork.jsp";
	}
}
