package zl.management.test;

import java.util.List;

import org.junit.Test;

import zl.management.dao.DAOFactory;
import zl.management.dao.filePathDao.ResearchersPathDao;
import zl.management.domain.filePath.ResearchersPath;

public class TestReaPathDao {
	private ResearchersPathDao dao = DAOFactory.getResearchersPathDao();
	//@Test
	public void testAdd() {
		ResearchersPath rp = new ResearchersPath();
		rp.setreaId(1);
		rp.setPath("c://a.avi");
		dao.add(rp);
	}
	
	//@Test
	public void testDelete() {
		dao.delete(1);
	}
	
	//@Test
	public  void testList() {
		List<ResearchersPath> list = dao.list(1);
		System.out.println(list.size());
	}

}
