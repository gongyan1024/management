package zl.management.test;

import java.util.List;

import org.junit.Test;

import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersPathDao;
import zl.management.domain.filePath.ResearchersPath;

public class TestReaPathDao {
	private ResearchersPathDao dao = DAOFactory.getResearchersPathDao();
	//@Test
	public void testAdd() {

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
