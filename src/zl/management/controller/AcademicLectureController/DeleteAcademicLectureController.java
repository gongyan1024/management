package zl.management.controller.AcademicLectureController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLecturePathDaoImp;
import zl.management.domain.filePath.AcademicLecturePath;

public class DeleteAcademicLectureController implements Controller {
	private AcademicLecturePathDaoImp dao = DAOFactory.getAcademicLecturePathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "showDownloadAcademicLecture?id=" + request.getParameter("id");
		ControllDeal.deleteFile(request, response, dao, AcademicLecturePath.class, resPath);
		return null;
	}
}
