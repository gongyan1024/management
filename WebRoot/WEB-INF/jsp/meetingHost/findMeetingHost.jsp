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
		<h2 align="center">主办会议查找<a href="showMeetingHost">(返回)</a></h2>
		<form action="confirmFindMeetingHost"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>会议名称</td>
					<td><input type="text" id="lg-form" name="meetingName"
						value="">
					</td>
				</tr>
				<tr>
					<td>会议主题</td>
					<td><input type="text" id="lg-form" name="theme"
						value="">
					</td>
				</tr>
				<tr>
					<td>会议地点</td>
					<td><input type="text" id="lg-form" name="meetingPlace"
						value="">
					</td>
				</tr>
				<tr>
					<td>会议联系人</td>
					<td><input type="text" id="lg-form" name="meetingContact"
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