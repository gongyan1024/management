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
			新增学术讲座<a href="showAcademicLecture">(返回)</a>
		</h2>
		<form action="confrimAddAcademicLecture" method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>讲座名称</td>
					<td><input type="text" id="lg-form" name="lectureName"
						value="${requestScope.r.lectureName}">
				</tr>
				<tr>
					<td>所属单位</td>
					<td><input type="text" id="lg-form" name="subordinateUnit"
						value="${requestScope.r.subordinateUnit}">
				</tr>
				<tr>
					<td>教研室</td>
					<td><input type="text" id="lg-form"
						name="teachingAndResearchSection"
						value="${requestScope.r.teachingAndResearchSection}">
				</tr>
				<tr>
					<td>讲座类型</td>
					<td><input type="text" id="lg-form" name="lectureType"
						value="${requestScope.r.lectureType}">
				</tr>
				<tr>
					<td>讲座日期</td>
					<td><input type="text" id="lg-form" name="lectureDate"
						value="${requestScope.r.lectureDate}">
				</tr>
				<tr>
					<td>讲座级别</td>
					<td><input type="text" id="lg-form" name="lectureLevel"
						value="${requestScope.r.lectureLevel}">
				</tr>
				<tr>
					<td>讲座归属</td>
					<td><input type="text" id="lg-form" name="lectureAssignment"
						value="${requestScope.r.lectureAssignment}">
				</tr>
				<tr>
					<td>主讲人</td>
					<td><input type="text" id="lg-form" name="speaker"
						value="${requestScope.r.speaker}">
				</tr>
				<tr>
					<td>主讲人单位</td>
					<td><input type="text" id="lg-form" name="speakerUnit"
						value="${requestScope.r.speakerUnit}">
				</tr>
				<tr>
					<td>主讲人职务</td>
					<td><input type="text" id="lg-form" name="keynoteHolder"
						value="${requestScope.r.keynoteHolder}">
				</tr>
				<tr>
					<td>主讲人职称</td>
					<td><input type="text" id="lg-form" name="titleOfSpeaker"
						value="${requestScope.r.titleOfSpeaker}">
				</tr>
				<tr>
					<td>讲座地点</td>
					<td><input type="text" id="lg-form" name="venue"
						value="${requestScope.r.venue}">
				</tr>
				<tr>
					<td>审核状态</td>
					<td><input type="text" id="lg-form" name="auditStatus"
						value="${requestScope.r.auditStatus}">
				</tr>
				<tr>
					<td>参加讲座人数</td>
					<td><input type="text" id="lg-form"
						name="attendanceAtLectures"
						value="${requestScope.r.attendanceAtLectures}">
				</tr>
				<tr>
					<td>相关学科</td>
					<td><input type="text" id="lg-form" name="relatedDisciplines"
						value="${requestScope.r.relatedDisciplines}">
				</tr>
				<tr>
					<td>讲座对象</td>
					<td><input type="text" id="lg-form" name="lectureObjects"
						value="${requestScope.r.lectureObjects}">
				</tr>
				<tr>
					<td>主持人</td>
					<td><input type="text" id="lg-form" name="emcee"
						value="${requestScope.r.emcee}">
				</tr>
				<tr>
					<td>嘉宾</td>
					<td><input type="text" id="lg-form" name="distinguishedGuest"
						value="${requestScope.r.distinguishedGuest}">
				</tr>
				<tr>
					<td>主讲人学术简历</td>
					<td><input type="text" id="lg-form" name="moderatorResume"
						value="${requestScope.r.moderatorResume}">
				</tr>
				<tr>
					<td>观点综述</td>
					<td><input type="text" id="lg-form" name="viewSummary"
						value="${requestScope.r.viewSummary}">
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