package zl.management.controller.AcademicLectureController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.domain.AcademicLecture;

public class DropAcademicLectureController implements Controller {
	private AcademicLectureDaoImp dao = DAOFactory.getAcademicLectureDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resultPath = "showAcademicLecture";
		ControllDeal.dropDomain(request, response, dao, AcademicLecture.class);
		try {
			response.sendRedirect(resultPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
