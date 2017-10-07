package zl.management.controller.ArtWorkController;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkDaoImp;
import zl.management.domain.ArtWork;
import zl.management.util.ExcelUtil;

public class ExportArtWorkController implements Controller {
	private static ArtWorkDaoImp dao = DAOFactory.getArtWorkDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		List<ArtWork> list = dao.list();
		String[] headers = { "所有作者", "成果名称", "第一作者类型", "第一作者", "所属单位", "教研室", "发表时间", "第一作者职工号", "成果类型", "成果认定级别",
				"发表刊物/论文集", "出版时间", "刊物级别", "学校署名", "审核状态", "备注" };
		try {
			String fileName = "艺术作品一览表";
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
