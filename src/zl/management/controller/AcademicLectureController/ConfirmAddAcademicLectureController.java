package zl.management.controller.AcademicLectureController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.domain.AcademicLecture;

public class ConfirmAddAcademicLectureController implements Controller {
	private static AcademicLectureDaoImp dao = DAOFactory.getAcademicLectureDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.createObjByForm(request, response, AcademicLecture.class, dao);
		ControllDeal.sendMessage(request, response, "添加成功！1秒后为您自动跳到主页！！", "showAcademicLecture");
		
		return null;
	}

}
