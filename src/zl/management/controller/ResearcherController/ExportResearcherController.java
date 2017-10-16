package zl.management.controller.ResearcherController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ResearchersDaoImp;
import zl.management.domain.Researchers;

public class ExportResearcherController implements Controller {
	private static ResearchersDaoImp dao = DAOFactory.getResearchersDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String[] headers = { "人员名称", "英文名", "职工号", "性别", "出生日期", "科研单位", "科研教研室", "人事单位", "最后学位", "最后学历", "政治面貌", "职称",
				"定职日期", "荣誉称号", "学科门类", "是否统计", "一级学科", "二级学科", "三级学科", "相关学科", "研究方向", "身份证号码", "教师类别", "导师类型",
				"是否为专家", "聘任日期", "行政职务", "国籍", "民族", "家庭住址", "邮政编码", "住宅电话", "手机", "EMAIL", "办公电话", "办公传真", "个人网址",
				"在职情况", "第一外语", "第二外语", "第一外语程度", "第二外语程度", "进修情况", "学术兼职", "学术特长", "审核状态" };
		
		ControllDeal.exportExcel(request, response, dao, "科研人员信息一览表", Researchers.class, headers);
		return null;
	}

}
