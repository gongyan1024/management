package zl.management.dao;

import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.dao.imp.AcademicLecturePathDaoImp;
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.dao.imp.AttendMeetingPathDaoImp;
import zl.management.dao.imp.ResearchersDaoImp;
import zl.management.dao.imp.ResearchersPathDaoImp;
import zl.management.dao.imp.UserDaoImp;

public class DAOFactory {

	public static UserDaoImp getUserDao() {
		return new UserDaoImp();
	}
	
	public static ResearchersDaoImp getResearchersDao() {
			return new ResearchersDaoImp();
	}
	
	public static ResearchersPathDaoImp getResearchersPathDao() {
			return new ResearchersPathDaoImp();
	}
	
	public static AttendMeetingDaoImp getAttendMeetingDao() {
		return new AttendMeetingDaoImp();
	}
	
	public static AttendMeetingPathDaoImp getAttendMeetingPathDao() {
		return new AttendMeetingPathDaoImp();
	}
	
	public static AcademicLectureDaoImp getAcademicLectureDao() {
		return new AcademicLectureDaoImp();
	}
	
	public static AcademicLecturePathDaoImp getAcademicLecturePathDao() {
		return new AcademicLecturePathDaoImp();
	}
}
