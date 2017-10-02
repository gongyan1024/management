package zl.management.controller.AcademicLectureController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.domain.AcademicLecture;

public class ConfirmEditAcademicLectureController implements Controller {
	private static AcademicLectureDaoImp dao = DAOFactory.getAcademicLectureDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		AcademicLecture al = ControllDeal.comfirmEditDomain(request, response, dao, AcademicLecture.class);
		dao.update(al);
		ControllDeal.sendMessage(request, response, "编辑成功！1秒后为您自动跳到主页！！", "showAcademicLecture");
		return null;
	}

}
