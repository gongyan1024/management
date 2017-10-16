package zl.management.test;

import org.junit.Test;

import zl.management.dao.DAOFactory;
import zl.management.dao.imp.AcademicLectureDaoImp;
import zl.management.domain.AcademicLecture;
import zl.management.domain.User;

public class TestDao {
	private static AcademicLectureDaoImp dao = DAOFactory.getAcademicLectureDao();
	//@Test
	public void testAdd() {
		AcademicLecture al = new AcademicLecture();
		al.setLectureName("学术讲座2");
		dao.add(al);
	}
	
	//@Test
	public void testDelete() {
		dao.delete(1);
	}
	
	@Test
	public void testUpdate() {
		System.out.println(User.class.getName());
	}
}
