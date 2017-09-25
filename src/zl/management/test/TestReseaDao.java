package zl.management.test;

import org.junit.Test;

import zl.management.dao.DAOFactory;
import zl.management.dao.ResearchersDao;
import zl.management.domain.Researchers;

public class TestReseaDao {
	private static ResearchersDao dao = DAOFactory.getResearchersDao();

	@Test
	public void testAdd() {
		Researchers r = new Researchers();
		r.setAcademicPartTime("322");
		r.setAcademicSpecialty("2422");
		r.setAddress("222");
		r.setBirth("222");
		r.setCountry("111");
		r.setEmail("111");
		r.setFinalDegree("111");
		r.setFinalEducation("111");
		r.setHomePhone("111");
		r.setIdCard("111");
		
		dao.add(r);
	}
	
	//@Test
	public void testDelete() {
		dao.delete(2);
	}
	
	//@Test
	public void testUpdate() {
		Researchers r = new Researchers();
		r.setId(3);
		r.setAcademicPartTime("322");
		r.setAcademicSpecialty("222");
		r.setAddress("222");
		r.setBirth("222");
		r.setCountry("111");
		r.setEmail("111");
		r.setFinalDegree("111");
		r.setFinalEducation("111");
		r.setHomePhone("111");
		r.setIdCard("1231231231");
		
		dao.update(r);
	}
}
