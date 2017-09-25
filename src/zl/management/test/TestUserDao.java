package zl.management.test;

import org.junit.Test;

import zl.management.dao.DAOFactory;
import zl.management.dao.UserDao;
import zl.management.domain.User;

public class TestUserDao {
	private UserDao userDao = DAOFactory.getUserDao();
	
	//@Test
	public void testAdd() {
		User user = new User();
		user.setName("小林子");
		user.setUsername("user6");
		user.setPassword("user6");
		user.setEmail("432432411@qq.com");
		user.setType(0);
		userDao.add(user);
	}
	
	//@Test
	public void testDelete() {
		userDao.delete(7);
	}
	
	//@Test
	public void testUpdate() {
		User u = new User();
		u.setId(8);
		u.setName("小林子");
		u.setUsername("user6");
		u.setPassword("user6");
		u.setEmail("432432411@qq.com");
		u.setType(0);
		userDao.update(u);
	}

	//@Test
	public void testLoad() {
		User u = userDao.load(8);
		System.out.println(u);
	}

	//@Test
	public void testLoadByUserName() {
		User u = userDao.loadByUsername("user1");
		System.out.println(u);
	}
	
	//@Test
	public void testLogin() {
		User u = userDao.login("user1", "user11");
		System.out.println(u);
	}
	
	@Test
	public void test() {
		String pwd = "1111 2222";
		int index = pwd.indexOf(" ");
		System.out.println(pwd.substring(index+1, pwd.length()));
		System.out.println(pwd.substring(0, index));
	}
}
