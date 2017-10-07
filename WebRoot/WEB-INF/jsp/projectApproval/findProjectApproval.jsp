<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>项目立项查找</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">项目立项查找<a href="showProjectApproval">(返回)</a></h2>
		<form action="confirmFindProjectApproval"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>项目名称</td>
					<td><input type="text" id="lg-form" name="entryName"
						value="">
					</td>
				</tr>
				<tr>
					<td>项目编号</td>
					<td><input type="text" id="lg-form" name="projectNumber"
						value="">
					</td>
				</tr>
				<tr>
					<td>负责人</td>
					<td><input type="text" id="lg-form" name="personInCharge"
						value="">
					</td>
				</tr>
				<tr>
					<td>项目成员</td>
					<td><input type="text" id="lg-form" name="projectMembers"
						value="">
					</td>
				</tr>
				<tr>
					<td>项目状态</td>
					<td><input type="text" id="lg-form" name="projectStatus"
						value="">
					</td>
				</tr>
				<tr>
					<td>项目年度</td>
					<td><input type="text" id="lg-form" name="projectYear"
						value="">
					</td>
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