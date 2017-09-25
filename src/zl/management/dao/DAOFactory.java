package zl.management.dao;

import zl.management.dao.filePathDao.ResearchersPathDao;
import zl.management.dao.filePathDao.ResearchersPathDaoImp;

public class DAOFactory {

	public static UserDao getUserDao() {
		return new UserDaoImp();
	}
	
	public static ResearchersDao getResearchersDao() {
			return new ResearchersDaoImp();
	}
	
	public static ResearchersPathDao getResearchersPathDao() {
			return new ResearchersPathDaoImp();
	}
}
