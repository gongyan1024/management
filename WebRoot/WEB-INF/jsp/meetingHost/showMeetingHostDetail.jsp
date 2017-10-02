<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">
			参加会议信息<a href="showMeetingHost">(返回)</a>
		</h2>
		<table width="60%" border="1">
			<tr>
				<td>会议名称</td>
				<td><input type="text" id="lg-form" name="meetingName"
					value="${requestScope.r.meetingName}">
			</tr>
			<tr>
				<td>会议主题</td>
				<td><input type="text" id="lg-form" name="theme"
					value="${requestScope.r.theme}">
			</tr>
			<tr>
				<td>承办部门</td>
				<td><input type="text" id="lg-form" name="undertakeDepartment"
					value="${requestScope.r.undertakeDepartment}">
			</tr>
			<tr>
				<td>教研室</td>
				<td><input type="text" id="lg-form" name="office"
					value="${requestScope.r.office}">
			</tr>
			<tr>
				<td>学科门类</td>
				<td><input type="text" id="lg-form" name="disciplines"
					value="${requestScope.r.disciplines}">
			</tr>
			<tr>
				<td>一级学科</td>
				<td><input type="text" id="lg-form" name="level1Subject"
					value="${requestScope.r.level1Subject}">
			</tr>
			<tr>
				<td>会议地点</td>
				<td><input type="text" id="lg-form" name="meetingPlace"
					value="${requestScope.r.meetingPlace}">
			</tr>
			<tr>
				<td>会议类型</td>
				<td><input type="text" id="lg-form" name="meetingType"
					value="${requestScope.r.meetingType}">
			</tr>
			<tr>
				<td>开始日期</td>
				<td><input type="text" id="lg-form" name="startDate"
					value="${requestScope.r.startDate}">
			</tr>
			<tr>
				<td>结束日期</td>
				<td><input type="text" id="lg-form" name="endDate"
					value="${requestScope.r.endDate}">
			</tr>
			<tr>
				<td>论文数量</td>
				<td><input type="text" id="lg-form" name="publications"
					value="${requestScope.r.publications}">
			</tr>
			<tr>
				<td>国外代表数量</td>
				<td><input type="text" id="lg-form"
					name="numberOfForeignRepresentatives"
					value="${requestScope.r.numberOfForeignRepresentatives}">
			</tr>
			<tr>
				<td>代表人数</td>
				<td><input type="text" id="lg-form" name="delegates"
					value="${requestScope.r.delegates}">
			</tr>
			<tr>
				<td>会议联系人</td>
				<td><input type="text" id="lg-form" name="meetingContact"
					value="${requestScope.r.meetingContact}">
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" id="lg-form" name="telephone"
					value="${requestScope.r.telephone}">
			</tr>
			<tr>
				<td>电邮</td>
				<td><input type="text" id="lg-form" name="email"
					value="${requestScope.r.email}">
			</tr>
			<tr>
				<td>是否形成综合报告或建议</td>
				<td><input type="text" id="lg-form"
					name="formAComprehensiveReport"
					value="${requestScope.r.formAComprehensiveReport}">
			</tr>
			<tr>
				<td>会议经费(万元)</td>
				<td><input type="text" id="lg-form" name="meetingFor"
					value="${requestScope.r.meetingFor}">
			</tr>
			<tr>
				<td>经费来源</td>
				<td><input type="text" id="lg-form" name="sourcesOfFunds"
					value="${requestScope.r.sourcesOfFunds}">
			</tr>
			<tr>
				<td>会议简介</td>
				<td><input type="text" id="lg-form" name="sessionDescription"
					value="${requestScope.r.sessionDescription}">
			</tr>
		</table>
	</div>
</body>
</html>