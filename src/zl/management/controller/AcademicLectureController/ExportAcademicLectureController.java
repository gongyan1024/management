package zl.management.controller.AcademicLectureController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.domain.AcademicLecture;

public class ExportAcademicLectureController implements Controller {
	private static AcademicLectureDaoImp dao = DAOFactory.getAcademicLectureDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String[] headers = { "讲座名称", "所属单位", "教研室", "讲座类型", "讲座日期", "讲座级别", "讲座归属", "主讲人", "主讲人单位", "主讲人职务", "主讲人职称",
				"讲座地点", "审核状态", "参加讲座人数", "相关学科", "讲座对象", "主持人", "嘉宾", "主讲人学术简历", "观点综述" };
		String fileName = "学术讲座一览表";
		
		ControllDeal.exportExcel(request, response, dao, fileName, AcademicLecture.class, headers);
		
		return null;
	}

}
