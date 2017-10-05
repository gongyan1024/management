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
			新增成果获奖<a href="showAchievementAward">(返回)</a>
		</h2>
		<form action="confrimAddAchievementAward" method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>奖励名称</td>
					<td><input type="text" id="lg-form" name="bonusName"
						value="${requestScope.r.bonusName}">
				</tr>
				<tr>
					<td>第一完成人类型</td>
					<td><input type="text" id="lg-form" name="firstFinishType"
						value="${requestScope.r.firstFinishType}">
				</tr>
				<tr>
					<td>第一完成人</td>
					<td><input type="text" id="lg-form" name="firstAdult"
						value="${requestScope.r.firstAdult}">
				</tr>
				<tr>
					<td>成果名称</td>
					<td><input type="text" id="lg-form" name="outcomeName"
						value="${requestScope.r.outcomeName}">
				</tr>
				<tr>
					<td>所属单位</td>
					<td><input type="text" id="lg-form" name="subordinateUnit"
						value="${requestScope.r.subordinateUnit}">
				</tr>
				<tr>
					<td>教研室</td>
					<td><input type="text" id="lg-form"
						name="scientificResearchOffice"
						value="${requestScope.r.scientificResearchOffice}">
				</tr>
				<tr>
					<td>第一作者职工号</td>
					<td><input type="text" id="lg-form" name="firstAuthorNumber"
						value="${requestScope.r.firstAuthorNumber}">
				</tr>
				<tr>
					<td>获奖作者</td>
					<td><input type="text" id="lg-form" name="winningAuthor"
						value="${requestScope.r.winningAuthor}">
				</tr>
				<tr>
					<td>获奖人数</td>
					<td><input type="text" id="lg-form" name="numberOfWinners"
						value="${requestScope.r.numberOfWinners}">
				</tr>
				<tr>
					<td>发证机关</td>
					<td><input type="text" id="lg-form" name="issuingAuthority"
						value="${requestScope.r.issuingAuthority}">
				</tr>
				<tr>
					<td>获奖日期</td>
					<td><input type="text" id="lg-form" name="dateOfAward"
						value="${requestScope.r.dateOfAward}">
				</tr>
				<tr>
					<td>获奖级别</td>
					<td><input type="text" id="lg-form" name="awardLevel"
						value="${requestScope.r.awardLevel}">
				</tr>
				<tr>
					<td>获奖等级</td>
					<td><input type="text" id="lg-form" name="awardGrade"
						value="${requestScope.r.awardGrade}">
				</tr>
				<tr>
					<td>总参加单位数</td>
					<td><input type="text" id="lg-form"
						name="totalNumberOfParticipants"
						value="${requestScope.r.totalNumberOfParticipants}">
				</tr>
				<tr>
					<td>单位排名</td>
					<td><input type="text" id="lg-form" name="unitRanking"
						value="${requestScope.r.unitRanking}">
				</tr>
				<tr>
					<td>奖励批准号</td>
					<td><input type="text" id="lg-form" name="awardApprovalnumber"
						value="${requestScope.r.awardApprovalnumber}">
				</tr>
				<tr>
					<td>学科门类</td>
					<td><input type="text" id="lg-form" name="disciplineCategory"
						value="${requestScope.r.disciplineCategory}">
				</tr>
				<tr>
					<td>一级学科</td>
					<td><input type="text" id="lg-form"
						name="firstClassDiscipline"
						value="${requestScope.r.firstClassDiscipline}">
				</tr>
				<tr>
					<td>项目来源</td>
					<td><input type="text" id="lg-form" name="projectSource"
						value="${requestScope.r.projectSource}">
				</tr>
				<tr>
					<td>成果形式</td>
					<td><input type="text" id="lg-form" name="formOfAchievement"
						value="${requestScope.r.formOfAchievement}">
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
					<td>奖励类别</td>
					<td><input type="text" id="lg-form" name="rewardCategory"
						value="${requestScope.r.rewardCategory}">
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