<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>新增科研人士</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">
			新增科研人士<a href="showResearchs">(返回)</a>
		</h2>
		<form action="confrimAddResearcher" method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>人员名称</td>
					<td><input type="text" id="lg-form" name="name"
						value="${requestScope.r.name}">
				</tr>
				<tr>
					<td>英文名</td>
					<td><input type="text" id="lg-form" name="englishName"
						value="${requestScope.r.englishName}">
				</tr>
				<tr>
					<td>职工号</td>
					<td><input type="text" id="lg-form" name="staffNumber"
						value="${requestScope.r.staffNumber}">
				</tr>
				<tr>
					<td>性别</td>
					<td><input type="text" id="lg-form" name="sex"
						value="${requestScope.r.sex}">
				</tr>
				<tr>
					<td>出生日期</td>
					<td><input type="text" id="lg-form" name="birth"
						value="${requestScope.r.birth}">
				</tr>
				<tr>
					<td>科研单位</td>
					<td><input type="text" id="lg-form" name="researchUnit"
						value="${requestScope.r.researchUnit}">
				</tr>
				<tr>
					<td>科研教研室</td>
					<td><input type="text" id="lg-form" name="researchDepartment"
						value="${requestScope.r.researchDepartment}">
				</tr>
				<tr>
					<td>人事单位</td>
					<td><input type="text" id="lg-form" name="personnelUnits"
						value="${requestScope.r.personnelUnits}">
				</tr>
				<tr>
					<td>最后学位</td>
					<td><input type="text" id="lg-form" name="finalDegree"
						value="${requestScope.r.finalDegree}">
				</tr>
				<tr>
					<td>最后学历</td>
					<td><input type="text" id="lg-form" name="finalEducation"
						value="${requestScope.r.finalEducation}">
				</tr>
				<tr>
					<td>政治面貌</td>
					<td><input type="text" id="lg-form" name="politicalStatus"
						value="${requestScope.r.politicalStatus}">
				</tr>
				<tr>
					<td>职称</td>
					<td><input type="text" id="lg-form" name="title"
						value="${requestScope.r.title}">
				</tr>
				<tr>
					<td>定职日期</td>
					<td><input type="text" id="lg-form" name="fixedDate"
						value="${requestScope.r.fixedDate}">
				</tr>
				<tr>
					<td>荣誉称号</td>
					<td><input type="text" id="lg-form" name="honoraryTitle"
						value="${requestScope.r.honoraryTitle}">
				</tr>
				<tr>
					<td>学科门类</td>
					<td><input type="text" id="lg-form" name="disciplines"
						value="${requestScope.r.disciplines}">
				</tr>
				<tr>
					<td>是否统计</td>
					<td><input type="text" id="lg-form" name="statistics"
						value="${requestScope.r.statistics}">
				</tr>
				<tr>
					<td>一级学科</td>
					<td><input type="text" id="lg-form" name="firstDiscipline"
						value="${requestScope.r.firstDiscipline}">
				</tr>
				<tr>
					<td>二级学科</td>
					<td><input type="text" id="lg-form" name="secDiscipline"
						value="${requestScope.r.secDiscipline}">
				</tr>
				<tr>
					<td>三级学科</td>
					<td><input type="text" id="lg-form" name="thirdDiscipline"
						value="${requestScope.r.thirdDiscipline}">
				</tr>
				<tr>
					<td>相关学科</td>
					<td><input type="text" id="lg-form" name="relatedDisciplines"
						value="${requestScope.r.relatedDisciplines}">
				</tr>
				<tr>
					<td>研究方向</td>
					<td><input type="text" id="lg-form" name="researchDirection"
						value="${requestScope.r.researchDirection}">
				</tr>
				<tr>
					<td>身份证号码</td>
					<td><input type="text" id="lg-form" name="idCard"
						value="${requestScope.r.idCard}">
				</tr>
				<tr>
					<td>教师类别</td>
					<td><input type="text" id="lg-form" name="teacherCategory"
						value="${requestScope.r.teacherCategory}">
				</tr>
				<tr>
					<td>导师类型</td>
					<td><input type="text" id="lg-form" name="tutorCategory"
						value="${requestScope.r.tutorCategory}">
				</tr>
				<tr>
					<td>是否为专家</td>
					<td><input type="text" id="lg-form" name="isExpert"
						value="${requestScope.r.isExpert}">
				</tr>
				<tr>
					<td>聘任日期</td>
					<td><input type="text" id="lg-form" name="appointmentDate"
						value="${requestScope.r.appointmentDate}">
				</tr>
				<tr>
					<td>行政职务</td>
					<td><input type="text" id="lg-form" name="administrativeDuty"
						value="${requestScope.r.administrativeDuty}">
				</tr>
				<tr>
					<td>国籍</td>
					<td><input type="text" id="lg-form" name="country"
						value="${requestScope.r.country}">
				</tr>
				<tr>
					<td>民族</td>
					<td><input type="text" id="lg-form" name="nation"
						value="${requestScope.r.nation}">
				</tr>
				<tr>
					<td>家庭住址</td>
					<td><input type="text" id="lg-form" name="address"
						value="${requestScope.r.address}">
				</tr>
				<tr>
					<td>邮政编码</td>
					<td><input type="text" id="lg-form" name="postCode"
						value="${requestScope.r.postCode}">
				</tr>
				<tr>
					<td>住宅电话</td>
					<td><input type="text" id="lg-form" name="homePhone"
						value="${requestScope.r.homePhone}">
				</tr>
				<tr>
					<td>手机</td>
					<td><input type="text" id="lg-form" name="phone"
						value="${requestScope.r.phone}">
				</tr>
				<tr>
					<td>EMAIL</td>
					<td><input type="text" id="lg-form" name="email"
						value="${requestScope.r.email}">
				</tr>
				<tr>
					<td>办公电话</td>
					<td><input type="text" id="lg-form" name="officePhone"
						value="${requestScope.r.officePhone}">
				</tr>
				<tr>
					<td>办公传真</td>
					<td><input type="text" id="lg-form" name="officeFax"
						value="${requestScope.r.officeFax}">
				</tr>
				<tr>
					<td>个人网址</td>
					<td><input type="text" id="lg-form" name="personWeb"
						value="${requestScope.r.personWeb}">
				</tr>
				<tr>
					<td>在职情况</td>
					<td><input type="text" id="lg-form" name="jobSituation"
						value="${requestScope.r.jobSituation}">
				</tr>
				<tr>
					<td>第一外语</td>
					<td><input type="text" id="lg-form"
						name="firstForeignLanguage"
						value="${requestScope.r.firstForeignLanguage}">
				</tr>
				<tr>
					<td>第二外语</td>
					<td><input type="text" id="lg-form" name="secForeignLanguage"
						value="${requestScope.r.secForeignLanguage}">
				</tr>
				<tr>
					<td>第一外语程度</td>
					<td><input type="text" id="lg-form"
						name="firstForeignLanguageLev"
						value="${requestScope.r.firstForeignLanguageLev}">
				</tr>
				<tr>
					<td>第二外语程度</td>
					<td><input type="text" id="lg-form"
						name="secForeignLanguageLev"
						value="${requestScope.r.secForeignLanguageLev}">
				</tr>
				<tr>
					<td>进修情况</td>
					<td><input type="text" id="lg-form" name="trainingSituation"
						value="${requestScope.r.trainingSituation}">
				</tr>
				<tr>
					<td>学术兼职</td>
					<td><input type="text" id="lg-form" name="academicPartTime"
						value="${requestScope.r.academicPartTime}">
				</tr>
				<tr>
					<td>学术特长</td>
					<td><input type="text" id="lg-form" name="academicSpecialty"
						value="${requestScope.r.academicSpecialty}">
				</tr>
				<tr>
					<td>审核状态</td>
					<td><input type="text" id="lg-form" name="approvalStatus"
						value="${requestScope.r.approvalStatus}">
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