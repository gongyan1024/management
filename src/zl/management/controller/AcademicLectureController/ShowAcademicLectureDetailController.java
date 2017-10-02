package zl.management.controller.AcademicLectureController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.domain.AcademicLecture;

public class ShowAcademicLectureDetailController implements Controller {
	private AcademicLectureDaoImp dao = DAOFactory.getAcademicLectureDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		AcademicLecture al = dao.load(id);
		request.setAttribute("r", al);
		return "/WEB-INF/jsp/academicLecture/showAcademicLectureDetail.jsp";
	}
}
