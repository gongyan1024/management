package zl.management.controller.AcademicLectureController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.domain.AcademicLecture;

public class ConfirmFindAcademicLectureController implements Controller {
	private AcademicLectureDaoImp dao = DAOFactory.getAcademicLectureDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String lectureName = "%" + request.getParameter("lectureName").trim() + "%";
		String subordinateUnit = request.getParameter("subordinateUnit").trim();
		String speaker = request.getParameter("speaker").trim();
		String lectureLevel = request.getParameter("lectureLevel").trim();
		String lectureType = request.getParameter("lectureType").trim();
		String lectureDate = request.getParameter("lectureDate").trim();
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("lectureName", lectureName);
		params.put("subordinateUnit", subordinateUnit);
		params.put("speaker", speaker);
		params.put("lectureLevel", lectureLevel);
		params.put("lectureType", lectureType);
		params.put("lectureDate", lectureDate);
		
		request.getSession().setAttribute("isFind", "1");
		request.getSession().setAttribute("findParams", params);
		ControllDeal.showDomain(request, response, dao, AcademicLecture.class, params);
		return "/WEB-INF/jsp/academicLecture/showAcademicLecture.jsp";
	}
}
