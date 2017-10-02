package zl.management.controller.PatentResultsController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;
import zl.management.util.UDUtil;

public class DownloadPatentResultsController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		UDUtil.download(request, response);
		return null;
	}
}
