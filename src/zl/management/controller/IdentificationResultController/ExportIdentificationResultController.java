package zl.management.controller.IdentificationResultController;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.IdentificationResultDaoImp;
import zl.management.domain.IdentificationResult;
import zl.management.util.ExcelUtil;

public class ExportIdentificationResultController implements Controller {
	private static IdentificationResultDaoImp dao = DAOFactory.getIdentificationResultDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<IdentificationResult> list = dao.list();
		String[] headers = { "成果名称", "第一作者类型", "第一作者", "所属单位", "教研室", "第一作者职工号", "成果作者", "鉴定部门", "鉴定日期", "鉴定结论", "鉴定号",
				"完成形式", "备注", "学科门类", "一级学科", "项目来源", "学校署名", "审核状态" };
		try {
			String fileName = "鉴定成果一览表";
			response.setContentType("application/x-download");
			response.setCharacterEncoding("utf-8");
			response.setHeader("Content-disposition",
					"attachment;filename=" + new String(fileName.getBytes("utf-8"), "iso8859-1") + ".xls");
			ExcelUtil.exportExcel(fileName, headers, list, response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
