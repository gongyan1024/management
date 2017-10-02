package zl.management.controller.AcademicLectureController;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLecturePathDaoImp;

public class DeleteAcademicLectureController implements Controller {
	private AcademicLecturePathDaoImp dao = DAOFactory.getAcademicLecturePathDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String resPath = "showDownloadAcademicLecture?id=" + request.getParameter("id");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String path = request.getParameter("path");
		File file = new File(path);
		file.delete();
		dao.delete(path);
		try {
			response.sendRedirect(resPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
