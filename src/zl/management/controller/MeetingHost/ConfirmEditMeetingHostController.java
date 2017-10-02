package zl.management.controller.MeetingHost;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.ControllDeal;
import zl.management.controller.Controller;
import zl.management.dao.DAOFactory;
import zl.management.dao.imp.MeetingHostDaoImp;
import zl.management.domain.MeetingHost;

public class ConfirmEditMeetingHostController implements Controller {
	private static MeetingHostDaoImp dao = DAOFactory.getMeetingHostDao();
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		MeetingHost al = ControllDeal.comfirmEditDomain(request, response, dao, MeetingHost.class);
		dao.update(al);
		ControllDeal.sendMessage(request, response, "编辑成功！1秒后为您自动跳到主页！！", "showMeetingHost");
		return null;
	}

}
