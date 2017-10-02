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
		
		String lectureName = request.getParameter("lectureName");
		String subordinateUnit = request.getParameter("subordinateUnit");
		String speaker = request.getParameter("speaker");
		String lectureLevel = request.getParameter("lectureLevel");
		String lectureType = request.getParameter("lectureType");
		
		Map<String, Object> params = new HashMap<String, Object> ();
		params.put("lectureName", lectureName);
		params.put("subordinateUnit", subordinateUnit);
		params.put("speaker", speaker);
		params.put("lectureLevel", lectureLevel);
		params.put("lectureType", lectureType);
		
		ControllDeal.showDomain(request, response, dao, AcademicLecture.class, params);
		return "/WEB-INF/jsp/academicLecture/showAcademicLecture.jsp";
	}
}
