package zl.management.controller.IdentificationResultController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.IdentificationResultDaoImp;
import zl.management.domain.IdentificationResult;

public class ExportIdentificationResultController implements Controller {
	private static IdentificationResultDaoImp dao = DAOFactory.getIdentificationResultDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String[] headers = { "成果名称", "第一作者类型", "第一作者", "所属单位", "教研室", "第一作者职工号", "成果作者", "鉴定部门", "鉴定日期", "鉴定结论", "鉴定号",
				"完成形式", "备注", "学科门类", "一级学科", "项目来源", "学校署名", "审核状态" };
		String fileName = "鉴定成果一览表";
		ControllDeal.exportExcel(request, response, dao, fileName, IdentificationResult.class, headers);
		return null;
	}

}
