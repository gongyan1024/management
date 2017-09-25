package zl.management.controller.ResearcherController;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;
import zl.management.util.ExcelUtil;

public class ResearcherExportExcel implements Controller {
	private static ResearchersDao dao = DAOFactory.getResearchersDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<Researchers> list = dao.list(); 
		String[] headers = { "人员名称", "性别", "	身份证信息", "出生日期", "科研单位", "最后学位", "最后学历", "职称", "研究方向", "行政职务", "国籍",
				"民族", "家庭住址", "邮政编码", "住宅电话", "手机", "EMAIL", "办公电话", "学术兼职", "学术特长", "附件上传" };
		try {
			String fileName = "科研人员信息一览表";
	        response.setContentType("application/x-download");    
	        response.setCharacterEncoding("utf-8");
	        response.setHeader("Content-disposition", "attachment;filename=" + new String(fileName.getBytes("utf-8"), "iso8859-1") + ".xls"); 
	        ExcelUtil.exportExcel("科研人员信息一览表", headers, list, response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
