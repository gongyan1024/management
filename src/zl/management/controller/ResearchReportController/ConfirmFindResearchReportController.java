package zl.management.controller.ResearchReportController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchReportDaoImp;
import zl.management.domain.ResearchReport;

public class ConfirmFindResearchReportController implements Controller {
	private ResearchReportDaoImp dao = DAOFactory.getResearchReportDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String reportTopic = "%" + request.getParameter("reportTopic").trim() + "%";
		String firstAuthorName = request.getParameter("firstAuthorName").trim();
		String researchSection = request.getParameter("researchSection").trim();
		String author = "%" + request.getParameter("author").trim() + "%";
		String firstAuthorNumber = request.getParameter("firstAuthorNumber").trim();
		String auditStatus = request.getParameter("auditStatus").trim();
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("reportTopic", reportTopic);
		params.put("firstAuthorName", firstAuthorName);
		params.put("researchSection", researchSection);
		params.put("author", author);
		params.put("firstAuthorNumber", firstAuthorNumber);
		params.put("auditStatus", auditStatus);
		
		request.getSession().setAttribute("isFind", "1");
		request.getSession().setAttribute("findParams", params);
		ControllDeal.showDomain(request, response, dao, ResearchReport.class, params);
		return "/WEB-INF/jsp/researchReport/showResearchReport.jsp";
	}
}
