package zl.management.controller.AchievementAwardController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.domain.AchievementAward;

public class ConfirmFindAchievementAwardController implements Controller {
	private AchievementAwardDaoImp dao = DAOFactory.getAchievementAwardDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String bonusName = "%" + request.getParameter("bonusName").trim() + "%";
		String firstAdult = request.getParameter("firstAdult").trim();
		String outcomeName = "%" + request.getParameter("outcomeName").trim() + "%";
		String issuingAuthority = request.getParameter("issuingAuthority").trim();
		String awardLevel = request.getParameter("awardLevel").trim();
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("bonusName", bonusName);
		params.put("firstAdult", firstAdult);
		params.put("outcomeName", outcomeName);
		params.put("issuingAuthority", issuingAuthority);
		params.put("awardLevel", awardLevel);
		request.getSession().setAttribute("isFind", "1");
		request.getSession().setAttribute("findParams", params);
		
		request.getSession().setAttribute("isFind", "1");
		request.getSession().setAttribute("findParams", params);
		ControllDeal.showDomain(request, response, dao, AchievementAward.class, params);
		return "/WEB-INF/jsp/achievementAward/showAchievementAward.jsp";
	}
}
