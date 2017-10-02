package zl.management.test;

import org.junit.Test;

import zl.management.dao.AttendMeetingDao;
import zl.management.dao.DAOFactory;
import zl.management.domain.AttendMeeting;

public class TestDao {
	//private static ResearchersDao dao = DAOFactory.getResearchersDao();
	private static AttendMeetingDao dao = DAOFactory.getAttendMeetingDao();
	//@Test
	public void testAdd() {
		AttendMeeting atm = new AttendMeeting();
		atm.setAttendee("小黑");
		atm.setAuditStatus("信息学院");
		atm.setConferenceName("天下第一黑项目");
		
		dao.add(atm);
	}
	
	//@Test
	public void testDelete() {
		dao.delete(1);
	}
	
	@Test
	public void testUpdate() {
		AttendMeeting atm = new AttendMeeting();
		atm.setId(2);
		atm.setAttendee("大黑");
		atm.setAuditStatus("信息学院");
		atm.setConferenceName("天下第一黑项目");
		
		dao.update(atm);
	}
}
