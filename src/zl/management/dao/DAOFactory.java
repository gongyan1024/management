package zl.management.dao;

import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.dao.imp.AcademicLecturePathDaoImp;
import zl.management.dao.imp.AchievementAwardDaoImp;
import zl.management.dao.imp.AchievementAwardPathDaoImp;
import zl.management.dao.imp.AchievementsDaoImp;
import zl.management.dao.imp.AchievementsPathDaoImp;
import zl.management.dao.imp.AttendMeetingDaoImp;
import zl.management.dao.imp.AttendMeetingPathDaoImp;
import zl.management.dao.imp.MeetingHostDaoImp;
import zl.management.dao.imp.MeetingHostPathDaoImp;
import zl.management.dao.imp.PatentResultsDaoImp;
import zl.management.dao.imp.PatentResultsPathDaoImp;
import zl.management.dao.imp.ResearchersDaoImp;
import zl.management.dao.imp.ResearchersPathDaoImp;
import zl.management.dao.imp.ThesisDaoImp;
import zl.management.dao.imp.ThesisPathDaoImp;
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
	
	public static MeetingHostDaoImp getMeetingHostDao() {
		return new MeetingHostDaoImp();
	}
	
	public static MeetingHostPathDaoImp getMeetingHostPathDao() {
		return new MeetingHostPathDaoImp();
	}
	
	public static PatentResultsDaoImp getPatentResultsDao() {
		return new PatentResultsDaoImp();
	}
	
	public static PatentResultsPathDaoImp getPatentResultsPathDao() {
		return new PatentResultsPathDaoImp();
	}

	public static AchievementAwardDaoImp getAchievementAwardDao() {
		return new AchievementAwardDaoImp();
	}
	
	public static AchievementAwardPathDaoImp getAchievementAwardPathDao() {
		return new AchievementAwardPathDaoImp();
	}
	
	public static AchievementsDaoImp getAchievementsDao() {
		return new AchievementsDaoImp();
	}
	
	public static AchievementsPathDaoImp getAchievementsPathDao() {
		return new AchievementsPathDaoImp();
	}
	
	public static ThesisDaoImp getThesisDao() {
		return new ThesisDaoImp();
	}
	
	public static ThesisPathDaoImp getThesisPathDao() {
		return new ThesisPathDaoImp();
	}
}
