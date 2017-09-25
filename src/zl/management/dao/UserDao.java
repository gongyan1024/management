package zl.management.dao;

import zl.management.domain.User;
import zl.management.util.Pager;

public interface UserDao {
	public void add(User user);	//增
	public void delete(int id);	//删
	public void update(User u); //改
	public User load(int id);	//查,通过ID
	public Pager<User> find(String name);	//查,通过名字
	public User loadByUsername(String username); //查,通过用户名
	public User login(String username, String password);	//登录
}
