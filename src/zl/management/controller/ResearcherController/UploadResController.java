package zl.management.controller.ResearcherController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.filePathDao.ResearchersPathDao;
import zl.management.domain.filePath.ResearchersPath;
import zl.management.util.UDUtil;

public class UploadResController implements Controller {
	private ResearchersPathDao dao = DAOFactory.getResearchersPathDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String message = null;
		int resId = Integer.parseInt(request.getParameter("id"));
		List<String> paths = UDUtil.upload(request, response);
		if (paths == null) {
			message = String.format(
					"请选择文件,2秒后为您自动跳到编辑页面！！" + "<meta http-equiv='refresh' content='2;url=%s'",
					"editResearchs?id=" + resId);
		} else {
			for (String path : paths) {
				ResearchersPath rp = new ResearchersPath();
				rp.setreaId(resId);
				rp.setPath(path);
				dao.add(rp);
			}
			message = String.format(
					request.getAttribute("message") + "2秒后为您自动跳到编辑页面！！" + "<meta http-equiv='refresh' content='2;url=%s'",
					"editResearchs?id=" + resId);
		}

		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
