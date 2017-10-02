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
		<h2 align="center">新增参加会议<a href="showAttendMeeting">(返回)</a></h2>
		<form action="confrimAddAttendMeeting"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>参会人</td>
					<td><input type="text" id="lg-form" name="attendee"
						value="${requestScope.r.attendee}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>所属单位</td>
					<td><input type="text" id="lg-form" name="subordinateUnit"
						value="${requestScope.r.subordinateUnit}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>教研室</td>
					<td><input type="text" id="lg-form" name="teachingResearchSection"
						value="${requestScope.r.teachingResearchSection}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>会议名称</td>
					<td><input type="text" id="lg-form" name="conferenceName"
						value="${requestScope.r.conferenceName}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>主办单位</td>
					<td><input type="text" id="lg-form" name="sponsor"
						value="${requestScope.r.sponsor}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>会议类型</td>
					<td><input type="text" id="lg-form" name="meetingType"
						value="${requestScope.r.meetingType}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>学科门类</td>
					<td><input type="text" id="lg-form" name="disciplineCategory"
						value="${requestScope.r.disciplineCategory}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>参会地址</td>
					<td><input type="text" id="lg-form" name="participantAddress"
						value="${requestScope.r.participantAddress}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>参会日期</td>
					<td><input type="text" id="lg-form" name="participantDate"
						value="${requestScope.r.participantDate}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>是否提交论文</td>
					<td><input type="text" id="lg-form" name="submitThesis"
						value="${requestScope.r.submitThesis}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>论文题目</td>
					<td><input type="text" id="lg-form" name="thesisTitle"
						value="${requestScope.r.thesisTitle}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>是否特邀报告</td>
					<td><input type="text" id="lg-form" name="invitedReport"
						value="${requestScope.r.invitedReport}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>报告题目</td>
					<td><input type="text" id="lg-form" name="reportTopic"
						value="${requestScope.r.reportTopic}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td>审核状态</td>
					<td><input type="text" id="lg-form" name="auditStatus"
						value="${requestScope.r.auditStatus}">${requestScope.errors.username}
					</td>
				</tr>
				<tr>
					<td><input type="reset" value="清空"></td>
					<td><input type="submit" value="确认"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>