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
			新增研究报告<a href="showResearchReport">(返回)</a>
		</h2>
		<form action="confrimAddResearchReport" method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>报告题目</td>
					<td><input type="text" id="lg-form" name="reportTopic"
						value="${requestScope.r.reportTopic}">
				</tr>
				<tr>
					<td>第一作者类型</td>
					<td><input type="text" id="lg-form" name="firstAuthorType"
						value="${requestScope.r.firstAuthorType}">
				</tr>
				<tr>
					<td>第一作者</td>
					<td><input type="text" id="lg-form" name="firstAuthorName"
						value="${requestScope.r.firstAuthorName}">
				</tr>
				<tr>
					<td>所属单位</td>
					<td><input type="text" id="lg-form" name="subordinateUnit"
						value="${requestScope.r.subordinateUnit}">
				</tr>
				<tr>
					<td>单位类型</td>
					<td><input type="text" id="lg-form" name="unitType"
						value="${requestScope.r.unitType}">
				</tr>
				<tr>
					<td>采纳单位</td>
					<td><input type="text" id="lg-form" name="adoptionUnit"
						value="${requestScope.r.adoptionUnit}">
				</tr>
				<tr>
					<td>采纳时间</td>
					<td><input type="text" id="lg-form" name="adoptionTime"
						value="${requestScope.r.adoptionTime}">
				</tr>
				<tr>
					<td>是否被采纳</td>
					<td><input type="text" id="lg-form" name="accepted"
						value="${requestScope.r.accepted}">
				</tr>
				<tr>
					<td>合作单位</td>
					<td><input type="text" id="lg-form" name="cooperativeUnit"
						value="${requestScope.r.cooperativeUnit}">
				</tr>
				<tr>
					<td>转发成果</td>
					<td><input type="text" id="lg-form" name="forwardingResults"
						value="${requestScope.r.forwardingResults}">
				</tr>
				<tr>
					<td>学科门类</td>
					<td><input type="text" id="lg-form" name="disciplineCategory"
						value="${requestScope.r.disciplineCategory}">
				</tr>
				<tr>
					<td>一级学科</td>
					<td><input type="text" id="lg-form" name="firstDiscipline"
						value="${requestScope.r.firstDiscipline}">
				</tr>
				<tr>
					<td>项目来源</td>
					<td><input type="text" id="lg-form" name="projectSource"
						value="${requestScope.r.projectSource}">
				</tr>
				<tr>
					<td>教研室</td>
					<td><input type="text" id="lg-form" name="researchSection"
						value="${requestScope.r.researchSection}">
				</tr>
				<tr>
					<td>所有作者</td>
					<td><input type="text" id="lg-form" name="author"
						value="${requestScope.r.author}">
				</tr>
				<tr>
					<td>第一作者职工号</td>
					<td><input type="text" id="lg-form" name="firstAuthorNumber"
						value="${requestScope.r.firstAuthorNumber}">
				</tr>
				<tr>
					<td>学校署名</td>
					<td><input type="text" id="lg-form" name="schoolSignature"
						value="${requestScope.r.schoolSignature}">
				</tr>
				<tr>
					<td>字数</td>
					<td><input type="text" id="lg-form" name="wordsNumber"
						value="${requestScope.r.wordsNumber}">
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
					<td><input type="reset" value="清空"></td>
					<td><input type="submit" value="确认"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>