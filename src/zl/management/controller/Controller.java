package zl.management.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	//根据不同的uri来处理事务并返回对应的jsp页面
	public String handleRequest(HttpServletRequest request, HttpServletResponse response);	
}
