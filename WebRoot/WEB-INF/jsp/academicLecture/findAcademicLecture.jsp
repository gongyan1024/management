<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>参加会议查找</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">学术讲座查找<a href="showAcademicLecture">(返回)</a></h2>
		<form action="confirmFindAcademicLecture"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>讲座名称</td>
					<td><input type="text" id="lg-form" name="lectureName"
						value="">
					</td>
				</tr>
				<tr>
					<td>所属单位</td>
					<td><input type="text" id="lg-form" name="subordinateUnit"
						value="">
					</td>
				</tr>
				<tr>
					<td>主讲人</td>
					<td><input type="text" id="lg-form" name="speaker"
						value="">
					</td>
				</tr>
				<tr>
					<td>讲座级别</td>
					<td><input type="text" id="lg-form" name="lectureLevel"
						value="">
					</td>
				</tr>
				<tr>
					<td>讲座类型</td>
					<td><input type="text" id="lg-form" name="lectureType"
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