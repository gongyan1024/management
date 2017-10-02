<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>科研人士查找</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">科研人士查找<a href="showResearchs">(返回)</a></h2>
		<form action="confrimFindResearcher"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>人员名称</td>
					<td><input type="text" id="lg-form" name="name"
						value="">
					</td>
				</tr>
				<tr>
					<td>性别</td>
					<td><input type="text" id="lg-form" name="sex"
						value="">
					</td>
				</tr>
				<tr>
					<td>身份证信息</td>
					<td><input type="text" id="lg-form" name="idCard"
						value="">
					</td>
				</tr>
				<tr>
					<td>住宅电话</td>
					<td><input type="text" id="lg-form" name="homePhone"
						value="">
					</td>
				</tr>
				<tr>
					<td>手机</td>
					<td><input type="text" id="lg-form" name="phone"
						value="">
					</td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" id="lg-form" name="email"
						value="">
					</td>
				</tr>
				<tr>
					<td>办公电话</td>
					<td><input type="text" id="lg-form" name="officePhone"
						value="">
				</tr>
				<tr>
					<td><input type="reset" value="清空"></td>
					<td><input type="submit" value="确认"></td>
				</tr>
			</table>
		</form>
		<div>
		</div>
	</div>
</body>
</html>