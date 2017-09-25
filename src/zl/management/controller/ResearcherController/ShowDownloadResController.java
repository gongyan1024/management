package zl.management.controller.ResearcherController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.filePathDao.ResearchersPathDao;
import zl.management.domain.filePath.ResearchersPath;

public class ShowDownloadResController implements Controller {
	private ResearchersPathDao dao = DAOFactory.getResearchersPathDao();

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		int reaId = Integer.parseInt(request.getParameter("id"));
		Map<String, String> fileNameMap = new HashMap<String, String>();

		List<ResearchersPath> pathList = dao.list(reaId);
		if (pathList == null) {
			String message = String.format("没有文件可以提供下载" + "<meta http-equiv='refresh' content='1;url=%s'", "homePage");
			request.setAttribute("message", message);
			try {
				request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
			return null;
		} else {
			for (ResearchersPath rp : pathList) {
				String path = rp.getPath(); // 这里获得的是带有uuid的名称
				int index = path.indexOf("_");
				String realPath = path.substring(index + 1);
				fileNameMap.put(realPath, path);
			}
			
			request.setAttribute("fileNameMap", fileNameMap);
			return "WEB-INF/jsp/fileList.jsp";
		}
	}

}
