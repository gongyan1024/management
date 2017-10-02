package zl.management.controller.PatentResultsController;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.PatentResultsDaoImp;
import zl.management.domain.PatentResults;
import zl.management.util.ExcelUtil;

public class ExportPatentResultsController implements Controller {
	private static PatentResultsDaoImp dao = DAOFactory.getPatentResultsDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<PatentResults> list = dao.list();
		String[] headers = { "专利名称", "第一发明人类型", "第一发明人", "所属单位", "教研室", "专利发明人", "专利类型", "专利范围", "专利状态", "申请号", "申请日期",
				"公开号", "公开日期", "授权号", "授权日期", "学校署名", "审核状态", "备注", "是否为职务专利" };
		try {
			String fileName = "专利成果一览表";
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
