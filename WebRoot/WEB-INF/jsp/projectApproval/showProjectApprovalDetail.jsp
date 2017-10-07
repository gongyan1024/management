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
			项目立项信息<a href="showProjectApproval">(返回)</a>
		</h2>
		<table width="60%" border="1">
			<tr>
				<td>项目名称</td>
				<td><input type="text" id="lg-form" name="entryName"
					value="${requestScope.r.entryName}">
			</tr>
			<tr>
				<td>项目编号</td>
				<td><input type="text" id="lg-form" name="projectNumber"
					value="${requestScope.r.projectNumber}">
			</tr>
			<tr>
				<td>负责人</td>
				<td><input type="text" id="lg-form" name="personInCharge"
					value="${requestScope.r.personInCharge}">
			</tr>
			<tr>
				<td>负责人职工号</td>
				<td><input type="text" id="lg-form" name="staffNumber"
					value="${requestScope.r.staffNumber}">
			</tr>
			<tr>
				<td>所属单位</td>
				<td><input type="text" id="lg-form" name="subordinateUnit"
					value="${requestScope.r.subordinateUnit}">
			</tr>
			<tr>
				<td>项目性质</td>
				<td><input type="text" id="lg-form" name="projectNature"
					value="${requestScope.r.projectNature}">
			</tr>
			<tr>
				<td>项目级别</td>
				<td><input type="text" id="lg-form" name="projectLevel"
					value="${requestScope.r.projectLevel}">
			</tr>
			<tr>
				<td>项目成员</td>
				<td><input type="text" id="lg-form" name="projectMembers"
					value="${requestScope.r.projectMembers}">
			</tr>
			<tr>
				<td>项目年度</td>
				<td><input type="text" id="lg-form" name="projectYear"
					value="${requestScope.r.projectYear}">
			</tr>
			<tr>
				<td>项目分类</td>
				<td><input type="text" id="lg-form"
					name="projectClassification"
					value="${requestScope.r.projectClassification}">
			</tr>
			<tr>
				<td>项目子类</td>
				<td><input type="text" id="lg-form" name="projectSubclass"
					value="${requestScope.r.projectSubclass}">
			</tr>
			<tr>
				<td>项目状态</td>
				<td><input type="text" id="lg-form" name="projectStatus"
					value="${requestScope.r.projectStatus}">
			</tr>
			<tr>
				<td>是否变更</td>
				<td><input type="text" id="lg-form" name="isChange"
					value="${requestScope.r.isChange}">
			</tr>
			<tr>
				<td>是否延期</td>
				<td><input type="text" id="lg-form" name="postponed"
					value="${requestScope.r.postponed}">
			</tr>
			<tr>
				<td>批准号</td>
				<td><input type="text" id="lg-form" name="approvalNumber"
					value="${requestScope.r.approvalNumber}">
			</tr>
			<tr>
				<td>项目来源单位</td>
				<td><input type="text" id="lg-form" name="projectSourceUnit"
					value="${requestScope.r.projectSourceUnit}">
			</tr>
			<tr>
				<td>承担单位排名</td>
				<td><input type="text" id="lg-form"
					name="rank"
					value="${requestScope.r.rank}">
			</tr>
			<tr>
				<td>立项日期</td>
				<td><input type="text" id="lg-form" name="projectTime"
					value="${requestScope.r.projectTime}">
			</tr>
			<tr>
				<td>开始时间</td>
				<td><input type="text" id="lg-form" name="startTime"
					value="${requestScope.r.startTime}">
			</tr>
			<tr>
				<td>计划完成日期</td>
				<td><input type="text" id="lg-form"
					name="plannedCompletionDate"
					value="${requestScope.r.plannedCompletionDate}">
			</tr>
			<tr>
				<td>结项日期</td>
				<td><input type="text" id="lg-form" name="dateOfEntry"
					value="${requestScope.r.dateOfEntry}">
			</tr>
			<tr>
				<td>结项等级</td>
				<td><input type="text" id="lg-form" name="gradeOfKnot"
					value="${requestScope.r.gradeOfKnot}">
			</tr>
			<tr>
				<td>实际完成时间</td>
				<td><input type="text" id="lg-form" name="actualCompletionTime"
					value="${requestScope.r.actualCompletionTime}">
			</tr>
			<tr>
				<td>成果形式</td>
				<td><input type="text" id="lg-form" name="formOfAchievement"
					value="${requestScope.r.formOfAchievement}">
			</tr>
			<tr>
				<td>是否为子课题</td>
				<td><input type="text" id="lg-form" name="subTopic"
					value="${requestScope.r.subTopic}">
			</tr>
			<tr>
				<td>合同类型</td>
				<td><input type="text" id="lg-form" name="typeOfContract"
					value="${requestScope.r.typeOfContract}">
			</tr>
			<tr>
				<td>合同经费</td>
				<td><input type="text" id="lg-form" name="contractFunds"
					value="${requestScope.r.contractFunds}">
			</tr>
			<tr>
				<td>经费卡号</td>
				<td><input type="text" id="lg-form" name="outlayCardNumber"
					value="${requestScope.r.outlayCardNumber}">
			</tr>
			<tr>
				<td>配套经费</td>
				<td><input type="text" id="lg-form" name="matchingFunds"
					value="${requestScope.r.matchingFunds}">
			</tr>
			<tr>
				<td>配套卡号</td>
				<td><input type="text" id="lg-form" name="matchingCardNumber"
					value="${requestScope.r.matchingCardNumber}">
			</tr>
			<tr>
				<td>所属档案盒</td>
				<td><input type="text" id="lg-form" name="fileBox"
					value="${requestScope.r.fileBox}">
			</tr>
			<tr>
				<td>学科门类</td>
				<td><input type="text" id="lg-form" name="disciplineCategory"
					value="${requestScope.r.disciplineCategory}">
			</tr>
			<tr>
				<td>学科分类</td>
				<td><input type="text" id="lg-form"
					name="subjectClassification"
					value="${requestScope.r.subjectClassification}">
			</tr>
			<tr>
				<td>项目来源</td>
				<td><input type="text" id="lg-form" name="projectSource"
					value="${requestScope.r.projectSource}">
			</tr>
			<tr>
				<td>研究类别</td>
				<td><input type="text" id="lg-form" name="researchCategory"
					value="${requestScope.r.researchCategory}">
			</tr>
			<tr>
				<td>国民经济行业（大类）</td>
				<td><input type="text" id="lg-form" name="nationalBigEconomy"
					value="${requestScope.r.nationalBigEconomy}">
			</tr>
			<tr>
				<td>国民经济行业(中类)</td>
				<td><input type="text" id="lg-form"
					name="nationalMiddleEconomy"
					value="${requestScope.r.nationalMiddleEconomy}">
			</tr>
			<tr>
				<td>合作形式</td>
				<td><input type="text" id="lg-form" name="formOfCooperation"
					value="${requestScope.r.formOfCooperation}">
			</tr>
			<tr>
				<td>社会经济目标</td>
				<td><input type="text" id="lg-form" name="socioEconomicGoals"
					value="${requestScope.r.socioEconomicGoals}">
			</tr>
			<tr>
				<td>审核状态</td>
				<td><input type="text" id="lg-form" name="auditStatus"
					value="${requestScope.r.auditStatus}">
			</tr>
			<tr>
				<td>备注</td>
				<td><input type="text" id="lg-form" name="remarks"
					value="${requestScope.r.remarks}">
			</tr>
			<tr>
				<td>负责人职称</td>
				<td><input type="text" id="lg-form"
					name="titleOfPersonInCharge"
					value="${requestScope.r.titleOfPersonInCharge}">
			</tr>
			<tr>
				<td>起止时间</td>
				<td><input type="text" id="lg-form" name="startStopTime"
					value="${requestScope.r.startStopTime}">
			</tr>
			<tr>
				<td>到帐经费</td>
				<td><input type="text" id="lg-form" name="arrivalExpenses"
					value="${requestScope.r.arrivalExpenses}">
			</tr>
			<tr>
				<td>支出经费</td>
				<td><input type="text" id="lg-form" name="expenditure"
					value="${requestScope.r.expenditure}">
			</tr>
			<tr>
				<td>已提管理费</td>
				<td><input type="text" id="lg-form" name="managementFees"
					value="${requestScope.r.managementFees}">
			</tr>
		</table>
	</div>
</body>
</html>