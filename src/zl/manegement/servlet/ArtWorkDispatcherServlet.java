package zl.manegement.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ArtWorkController.ConfirmAddArtWorkController;
import zl.management.controller.ArtWorkController.ConfirmEditArtWorkController;
import zl.management.controller.ArtWorkController.ConfirmFindArtWorkController;
import zl.management.controller.ArtWorkController.DeleteArtWorkController;
import zl.management.controller.ArtWorkController.DownloadArtWorkController;
import zl.management.controller.ArtWorkController.DropArtWorkController;
import zl.management.controller.ArtWorkController.EditArtWorkController;
import zl.management.controller.ArtWorkController.ExportArtWorkController;
import zl.management.controller.ArtWorkController.ReadArtWorkExcelController;
import zl.management.controller.ArtWorkController.ShowArtWorkController;
import zl.management.controller.ArtWorkController.ShowArtWorkDetailController;
import zl.management.controller.ArtWorkController.ShowArtWorkDownloadController;
import zl.management.controller.ArtWorkController.UploadArtWorkController;

@WebServlet(name = "ArtWorkDispatcherServlet", urlPatterns = { "/showArtWork", "/exportArtWork",
		"/addArtWork", "/editArtWork", "/uploadArtWork", "/showDownloadArtWork",
		"/downloadArtWork", "/showArtWorkDetail", "/readExcelArtWork", "/deleteArtWork",
		"/findArtWork", "/confrimEditArtWork", "/confrimAddArtWork",
		"/confirmFindArtWork", "/dropArtWork" })

public class ArtWorkDispatcherServlet extends HttpServlet {

	private static final long serialVersionUID = -2420102292193160794L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}

	private void process(HttpServletRequest req, HttpServletResponse resp) {
		String uri = req.getRequestURI();

		int lastIndex = uri.lastIndexOf("/");
		String action = uri.substring(lastIndex + 1);
		String dispatchUrl = null;

		if ("showArtWork".equals(action)) {
			dispatchUrl = new ShowArtWorkController().handleRequest(req, resp);
		} else if ("exportArtWork".equals(action)) {
			dispatchUrl = new ExportArtWorkController().handleRequest(req, resp);
		} else if ("addArtWork".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/artWork/addArtWork.jsp";
		} else if ("confrimAddArtWork".equals(action)) {
			dispatchUrl = new ConfirmAddArtWorkController().handleRequest(req, resp);
		} else if ("editArtWork".equals(action)) {
			dispatchUrl = new EditArtWorkController().handleRequest(req, resp);
		} else if ("confrimEditArtWork".equals(action)) {
			dispatchUrl = new ConfirmEditArtWorkController().handleRequest(req, resp);
		} else if ("uploadArtWork".equals(action)) {
			dispatchUrl = new UploadArtWorkController().handleRequest(req, resp);
		} else if ("showDownloadArtWork".equals(action)) {
			dispatchUrl = new ShowArtWorkDownloadController().handleRequest(req, resp);
		} else if ("downloadArtWork".equals(action)) {
			dispatchUrl = new DownloadArtWorkController().handleRequest(req, resp);
		} else if ("showArtWorkDetail".equals(action)) {
			dispatchUrl = new ShowArtWorkDetailController().handleRequest(req, resp);
		} else if ("readExcelArtWork".equals(action)) {
			dispatchUrl = new ReadArtWorkExcelController().handleRequest(req, resp);
		} else if ("deleteArtWork".equals(action)) {
			dispatchUrl = new DeleteArtWorkController().handleRequest(req, resp);
		} else if ("findArtWork".equals(action)) {
			dispatchUrl = "WEB-INF/jsp/artWork/findArtWork.jsp";
		} else if ("confirmFindArtWork".equals(action)) {
			dispatchUrl = new ConfirmFindArtWorkController().handleRequest(req, resp);
		} else if ("dropArtWork".equals(action)) {
			dispatchUrl = new DropArtWorkController().handleRequest(req, resp);
		}

		if (null != dispatchUrl) {
			RequestDispatcher rd = req.getRequestDispatcher(dispatchUrl);
			try {
				rd.forward(req, resp);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
