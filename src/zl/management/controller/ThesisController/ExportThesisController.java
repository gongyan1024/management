package zl.management.controller.ThesisController;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ThesisDaoImp;
import zl.management.domain.Thesis;
import zl.management.util.ExcelUtil;

public class ExportThesisController implements Controller {
	private static ThesisDaoImp dao = DAOFactory.getThesisDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<Thesis> list = dao.list();
		String[] headers = { "论文级别", "论文类型", "论文题目", "第一作者类型", "第一作者", "所属单位", "教研室", "所有作者", "第一作者职工号", "发表/出版时间",
				"论文转载", "论文收录", "发表刊物/论文集", "刊物级别", "编辑部地址", "学科门类", "一级学科", "项目来源", "发表范围", "论文集出版单位", "卷号", "期号",
				"页码范围", "个人执笔数", "学校署名", "关键字", "审核状态", "备注", "版面", "是否为译文", "ISSN号", "CN号" };
		try {
			String fileName = "论文成果一览表";
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
