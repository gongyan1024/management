package zl.management.controller.ResearcherController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchersDaoImp;
import zl.management.domain.Researchers;

public class FindResearcher implements Controller {
	private static ResearchersDaoImp dao = DAOFactory.getResearchersDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String name = "%" + request.getParameter("name").trim() + "%"; //模糊查询
		String staffNumber = request.getParameter("staffNumber").trim();
		String sex = request.getParameter("sex").trim();
		String birth = request.getParameter("birth").trim();
		String finalDegree = request.getParameter("finalDegree").trim();
		String finalEducation = request.getParameter("finalEducation").trim();
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		params.put("staffNumber", staffNumber);
		params.put("sex", sex);
		params.put("birth", birth);
		params.put("finalDegree", finalDegree);
		params.put("finalEducation", finalEducation);
		
		request.getSession().setAttribute("isFind", "1");
		request.getSession().setAttribute("findParams", params);
		
		ControllDeal.showDomain(request, response, dao, Researchers.class, params);
		
		return "/WEB-INF/jsp/researchers/showResearcher.jsp";
	}

}
