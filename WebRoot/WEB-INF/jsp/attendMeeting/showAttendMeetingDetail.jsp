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
		<h2 align="center">参加会议信息<a href="showAttendMeeting">(返回)</a></h2>
		<table width="60%" border="1">
			<tr>
				<td>参会人</td>
				<td><input type="text" id="lg-form" name="attendee"
					value="${requestScope.r.attendee}">
				</td>
			</tr>
			<tr>
				<td>所属单位</td>
				<td><input type="text" id="lg-form" name="subordinateUnit"
					value="${requestScope.r.subordinateUnit}">
				</td>
			</tr>
			<tr>
				<td>教研室</td>
				<td><input type="text" id="lg-form"
					name="teachingResearchSection"
					value="${requestScope.r.teachingResearchSection}">
				</td>
			</tr>
			<tr>
				<td>会议名称</td>
				<td><input type="text" id="lg-form" name="conferenceName"
					value="${requestScope.r.conferenceName}">
				</td>
			</tr>
			<tr>
				<td>主办单位</td>
				<td><input type="text" id="lg-form" name="sponsor"
					value="${requestScope.r.sponsor}">
				</td>
			</tr>
			<tr>
				<td>会议类型</td>
				<td><input type="text" id="lg-form" name="meetingType"
					value="${requestScope.r.meetingType}">
				</td>
			</tr>
			<tr>
				<td>学科门类</td>
				<td><input type="text" id="lg-form" name="disciplineCategory"
					value="${requestScope.r.disciplineCategory}">
				</td>
			</tr>
			<tr>
				<td>参会地址</td>
				<td><input type="text" id="lg-form" name="participantAddress"
					value="${requestScope.r.participantAddress}">
				</td>
			</tr>
			<tr>
				<td>参会日期</td>
				<td><input type="text" id="lg-form" name="participantDate"
					value="${requestScope.r.participantDate}">
				</td>
			</tr>
			<tr>
				<td>是否提交论文</td>
				<td><input type="text" id="lg-form" name="submitThesis"
					value="${requestScope.r.submitThesis}">
				</td>
			</tr>
			<tr>
				<td>论文题目</td>
				<td><input type="text" id="lg-form" name="thesisTitle"
					value="${requestScope.r.thesisTitle}">
				</td>
			</tr>
			<tr>
				<td>是否特邀报告</td>
				<td><input type="text" id="lg-form" name="invitedReport"
					value="${requestScope.r.invitedReport}">
				</td>
			</tr>
			<tr>
				<td>报告题目</td>
				<td><input type="text" id="lg-form" name="reportTopic"
					value="${requestScope.r.reportTopic}">
				</td>
			</tr>
			<tr>
				<td>审核状态</td>
				<td><input type="text" id="lg-form" name="auditStatus"
					value="${requestScope.r.auditStatus}">
				</td>
			</tr>
			</table>
			</div>
</body>
</html>