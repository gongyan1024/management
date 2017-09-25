/**   
 * Copyright © 2017 公司名. All rights reserved.
 * 
 * @Title: HomePageControll.java 
 * @Prject: management
 * @Package: zl.management.controller 
 * @Description: TODO
 * @author: zhenlin   
 * @date: 2017年9月19日 下午7:18:03 
 * @version: V1.0   
 */
package zl.management.controller.UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zl.management.controller.Controller;

public class HomePageControll implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		Object o = request.getSession().getAttribute("user");
		if(o == null) {
			return "/WEB-INF/jsp/login.jsp";
		}else {
			return "/WEB-INF/jsp/homePage.jsp";
		}
	}
}
