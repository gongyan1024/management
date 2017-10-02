package zl.management.dao.imp;

import zl.management.dao.BaseDao;
import zl.management.dao.UserDao;
import zl.management.domain.User;
import zl.management.exception.PwdWrongException;
import zl.management.exception.UserExistException;
import zl.management.exception.UserNotExistException;
import zl.management.util.Pager;

public class UserDaoImp extends BaseDao<User> implements UserDao  {

	public void add(User user) {
		if(super.load(User.class, user.getId()) != null) {
			throw new UserExistException("用户已经存在");
		}else {
			super.add(user);
		}
	}

	@Override
	public void delete(int id) {
		if(super.load(User.class, id) != null) {
			//TODO 删除关联对象
			super.delete(User.class, id);
		}else {
			throw new UserNotExistException("用户不存在");
		}
	}

	@Override
	public void update(User u) {
		super.update(u);
	}

	@Override
	public User load(int id) {
		return super.load(User.class, id);
	}

	@Override
	public Pager<User> find(String name) {
		//TODO 
		return null;
	}

	@Override
	public User loadByUsername(String username) {
		return super.loadBySqlId(User.class.getName()+".loadByUsername", username);
	}

	@Override
	public User login(String username, String password) {
		User u = loadByUsername(username);
		if (u == null)
			throw new UserNotExistException("不存在该用户");
		if (!password.equals(u.getPassword()))
			throw new PwdWrongException("密码错误");
		return u;
	}
}
