package zl.management.controller.ArtWorkController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkDaoImp;
import zl.management.domain.ArtWork;

public class ExportArtWorkController implements Controller {
	private static ArtWorkDaoImp dao = DAOFactory.getArtWorkDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String[] headers = { "所有作者", "成果名称", "第一作者类型", "第一作者", "所属单位", "教研室", "发表时间", "第一作者职工号", "成果类型", "成果认定级别",
				"发表刊物/论文集", "出版时间", "刊物级别", "学校署名", "审核状态", "备注" };
		String fileName = "艺术作品一览表";
		ControllDeal.exportExcel(request, response, dao, fileName, ArtWork.class, headers);
		return null;
	}

}
