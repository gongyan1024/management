package zl.management.controller.ProjectApprovalController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ProjectApprovalDaoImp;
import zl.management.domain.ProjectApproval;

public class ExportProjectApprovalController implements Controller {
	private static ProjectApprovalDaoImp dao = DAOFactory.getProjectApprovalDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String[] headers = { "项目名称", "项目编号", "负责人", "负责人职工号", "所属单位", "项目性质", "项目级别", "项目成员", "项目年度", "项目分类", "项目子类",
				"项目状态", "是否变更", "是否延期", "批准号", "项目来源单位", "承担单位排名", "立项日期", "开始时间", "计划完成日期", "结项日期", "结项等级", "实际完成时间",
				"成果形式", "是否为子课题", "合同类型", "合同经费", "经费卡号", "配套经费", "配套卡号", "所属档案盒", "学科门类", "学科分类", "项目来源", "研究类别",
				"国民经济行业（大类）", "国民经济行业(中类)", "合作形式", "社会经济目标", "审核状态", "备注", "负责人职称", "起止时间", "到帐经费", "支出经费", "已提管理费" };
		String fileName = "项目立项一览表";
		ControllDeal.exportExcel(request, response, dao, fileName, ProjectApproval.class, headers);
		return null;
	}

}
