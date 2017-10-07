package zl.management.controller.ArtWorkController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.ArtWorkDaoImp;
import zl.management.domain.ArtWork;

public class ConfirmAddArtWorkController implements Controller {
	private static ArtWorkDaoImp dao = DAOFactory.getArtWorkDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		ControllDeal.createObjByForm(request, response, ArtWork.class, dao);
		ControllDeal.sendMessage(request, response, "添加成功！1秒后为您自动跳到主页！！", "showArtWork");
		
		return null;
	}

}
