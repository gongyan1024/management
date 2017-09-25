/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: ResearcherValidator.java 
 * @Prject: management
 * @Package: zl.management.validator 
 * @Description: TODO
 * @author: zhenlin   
 * @date: 2017年9月21日 上午10:54:19 
 * @version: V1.0   
 */
package zl.management.validator;

import java.util.HashMap;
import java.util.Map;

import zl.management.dao.DAOFactory;
import zl.management.dao.UserDao;
import zl.management.domain.User;

public class ResearcherValidator {
	private UserDao userDao = DAOFactory.getUserDao();

	public Map<String, String> validateRegistered(User user) {
		Map<String, String> errors = new HashMap<String, String>();

		return errors;
	}
}
