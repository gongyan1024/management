package zl.management.controller.PatentResultsController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsDaoImp;
import zl.management.domain.PatentResults;

public class ConfirmFindPatentResultsController implements Controller {
	private PatentResultsDaoImp dao = DAOFactory.getPatentResultsDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String patentName = "%" + request.getParameter("patentName").trim() + "%";
		String firstInventor = request.getParameter("firstInventor").trim();
		String patentInventor = request.getParameter("patentInventor").trim();
		String applicationNumber = request.getParameter("applicationNumber").trim();
		String patentStatus = request.getParameter("patentStatus").trim();
		String openNo = request.getParameter("openNo").trim();
		String licenseNo = request.getParameter("licenseNo").trim();
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("patentName", patentName);
		params.put("firstInventor", firstInventor);
		params.put("patentInventor", patentInventor);
		params.put("applicationNumber", applicationNumber);
		params.put("patentStatus", patentStatus);
		params.put("openNo", openNo);
		params.put("licenseNo", licenseNo);
		
		request.getSession().setAttribute("isFind", "1");
		request.getSession().setAttribute("findParams", params);
		ControllDeal.showDomain(request, response, dao, PatentResults.class, params);
		return "/WEB-INF/jsp/patentResults/showPatentResults.jsp";
	}
}
