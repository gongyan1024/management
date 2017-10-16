package zl.management.controller.AchievementsController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementsDaoImp;
import zl.management.domain.Achievements;

public class ConfirmFindAchievementsController implements Controller {
	private AchievementsDaoImp dao = DAOFactory.getAchievementsDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String bookName = "%" + request.getParameter("bookName").trim() + "%";
		String firstAuthor = request.getParameter("firstAuthor").trim();
		String subordinateUnit = request.getParameter("subordinateUnit").trim();
		String firstAuthorNumber = request.getParameter("firstAuthorNumber").trim();
		String booksCategories = request.getParameter("booksCategories").trim();
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("bookName", bookName);
		params.put("firstAuthor", firstAuthor);
		params.put("subordinateUnit", subordinateUnit);
		params.put("firstAuthorNumber", firstAuthorNumber);
		params.put("booksCategories", booksCategories);
		
		request.getSession().setAttribute("isFind", "1");
		request.getSession().setAttribute("findParams", params);
		ControllDeal.showDomain(request, response, dao, Achievements.class, params);
		return "/WEB-INF/jsp/achievements/showAchievements.jsp";
	}
}
