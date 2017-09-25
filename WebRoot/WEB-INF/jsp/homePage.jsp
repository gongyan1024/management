<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理系统</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/homePagestyle.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/menu.js"></script>
</head>

<body>
	<div class="top"></div>
	<div id="header">
		<div class="logo">管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a href="">${user.name }</a></li>
				<li><a href="">修改密码</a></li>
				<li><a href="">退出</a></li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M1">
						<span></span>人员管理
					</h4>
					<div class="list-item none">
						<a href="showResearchs">科研人员管理</a>
					</div>
				</li>
			</ul>
		</div>
		<div class="m-right">
			<div id="main"></div>
		</div>
	</div>
	<div class="bottom"></div>
	<script>navList(12);</script>

    </script>
</body>
</html>
