package zl.management.controller.ResearcherController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;
import zl.management.util.Pager;
import zl.management.util.SystemContext;

public class ShowResearcherControll implements Controller {
	private static ResearchersDao dao = DAOFactory.getResearchersDao();
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		SystemContext.setPageSize(8);	

		int index = 1;
		String indexStr = request.getParameter("pageNumber");
		if (indexStr != null && !"".equals(indexStr)) {
			index = Integer.parseInt(indexStr);
		}

		SystemContext.setPageIndex(index);
		SystemContext.setPageOffset((index - 1) * SystemContext.getPageSize());
		
		Pager<Researchers> page = dao.find(null);
		page.setPageIndex(index);
		List<Researchers> entryList = page.getDatas();
		
		request.setAttribute("entryList", entryList);
		request.setAttribute("totalPages", page.getTotalPage());
		request.setAttribute("pageNumber", index);
		
		return "/WEB-INF/jsp/showResearcher.jsp";
	}

}
