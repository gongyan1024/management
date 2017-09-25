package zl.management.validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import zl.management.dao.DAOFactory;
import zl.management.dao.UserDao;
import zl.management.domain.User;
import zl.management.exception.PwdWrongException;
import zl.management.exception.UserNotExistException;

public class UserValidator {
	private UserDao userDao = DAOFactory.getUserDao();
	
	public UserValidator() {
		
	}

	public List<String> validateLogin(User user) {
		List<String> errors = new ArrayList<String>();
		String username = user.getUsername();
		String password = user.getPassword();
	
		try {
			userDao.login(username, password);
		}catch(UserNotExistException e) {
			errors.add("用户不存在");
		}catch(PwdWrongException e) {
			errors.add("密码错误");
		}
			
		return errors;
	}
	
	public Map<String, String> validateRegistered(User user) {
		Map<String, String> errors = new HashMap<String, String>();
		String username = user.getUsername();
		String password = user.getPassword();
		String email = user.getEmail();
		String name = user.getName();
		int index = password.indexOf(" ");
		
		String comfirmPwd = password.substring(index + 1, password.length());
		password = password.substring(0, index);
		
		if(username == null || username.trim().equals("")) {
			errors.put("username", "用户名不为空");
		}else if (!username.matches("[a-zA-Z0-9]{4,12}")){
			errors.put("username", "用户名必须是4-12位的数字或者字母!!!");
		}else if(userDao.loadByUsername(username) != null) {
			errors.put("username", "该用户名已经被注册了");
		}
		
		if(password == null || password.trim().equals("")) {
			errors.put("password", "密码不为空");
		}else if(!password.matches("[a-zA-Z0-9]{4,12}")) {
			errors.put("password", "密码必须是4-12位的数字或者字母!!!");
		}
		
		if(!comfirmPwd.equals(password)) {
			errors.put("confirmPwd", "两次密码不一致！！");
		}
		
		if(email == null || email.trim().equals("")) {
			errors.put("email", "邮箱不为空");
		}else if (!email.matches("\\w+@\\w+(\\.\\w+)+")){
			errors.put("email", "邮箱格式错误");
		}
				
		if(name == null || name.trim().equals("")) {
			errors.put("name", "名字不为空");
		}
			
		return errors;
	}
}
