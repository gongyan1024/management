<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="header">
	<div class="logo">管理系统</div>
	<div class="navigation">
		<ul>
			<li>欢迎您！</li>
			<li><a href="">${user.name }</a></li>
			<li><a href="${pageContext.request.contextPath}/homePage">主页</a></li>
			<li><a
				href="${pageContext.request.contextPath}/modifyPassword?id=${user.id}">修改密码</a></li>
			<li><a href="${pageContext.request.contextPath}/logout">退出</a></li>
		</ul>
	</div>
</div>
