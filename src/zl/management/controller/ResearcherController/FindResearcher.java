package zl.management.controller.ResearcherController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;
import zl.management.util.Pager;
import zl.management.util.SystemContext;

public class FindResearcher implements Controller {
	private static ResearchersDao dao = DAOFactory.getResearchersDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String name = "%" + request.getParameter("name") + "%"; //模糊查询
		String sex = request.getParameter("sex");
		String idCard = request.getParameter("idCard");
		String homePhone = request.getParameter("homePhone");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String officePhone = request.getParameter("officePhone");
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		params.put("sex", sex);
		params.put("idCard", idCard);
		params.put("homePhone", homePhone);
		params.put("phone", phone);
		params.put("email", email);
		params.put("officePhone", officePhone);
		
		SystemContext.setPageSize(8);	

		int index = 1;
		String indexStr = request.getParameter("pageNumber");
		if (indexStr != null && !"".equals(indexStr)) {
			index = Integer.parseInt(indexStr);
		}

		SystemContext.setPageIndex(index);
		SystemContext.setPageOffset((index - 1) * SystemContext.getPageSize());
		
		Pager<Researchers> page = dao.find(params);
		page.setPageIndex(index);
		List<Researchers> entryList = page.getDatas();
		
		request.setAttribute("entryList", entryList);
		request.setAttribute("totalPages", page.getTotalPage());
		request.setAttribute("pageNumber", index);
		
		return "/WEB-INF/jsp/researchers/showResearcher.jsp";
	}

}
