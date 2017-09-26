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
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4758",secure:"10666"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-1" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/homePage.jsp">
	<div class="top" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-1" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/homePage.jsp"></div>
	<div id="header">
		<div class="logo">管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a href="">${user.name }</a></li>
				<li><a href="${pageContext.request.contextPath}/homePage">主页</a></li>
				<li><a href="">修改密码</a></li>
				<li><a href="${pageContext.request.contextPath}/logout">退出</a></li>
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
