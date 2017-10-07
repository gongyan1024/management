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
			新增鉴定成果<a href="showIdentificationResult">(返回)</a>
		</h2>
		<form action="confrimAddIdentificationResult" method="post"
			id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>成果名称</td>
					<td><input type="text" id="lg-form" name="outcomeName"
						value="${requestScope.r.outcomeName}">
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
					<td>教研室</td>
					<td><input type="text" id="lg-form" name="researchSection"
						value="${requestScope.r.researchSection}">
				</tr>
				<tr>
					<td>第一作者职工号</td>
					<td><input type="text" id="lg-form" name="firstAuthorNumber"
						value="${requestScope.r.firstAuthorNumber}">
				</tr>
				<tr>
					<td>成果作者</td>
					<td><input type="text" id="lg-form" name="author"
						value="${requestScope.r.author}">
				</tr>
				<tr>
					<td>鉴定部门</td>
					<td><input type="text" id="lg-form"
						name="identificationDepartment"
						value="${requestScope.r.identificationDepartment}">
				</tr>
				<tr>
					<td>鉴定日期</td>
					<td><input type="text" id="lg-form" name="identificationDate"
						value="${requestScope.r.identificationDate}">
				</tr>
				<tr>
					<td>鉴定结论</td>
					<td><input type="text" id="lg-form" name="expertConclusion"
						value="${requestScope.r.expertConclusion}">
				</tr>
				<tr>
					<td>鉴定号</td>
					<td><input type="text" id="lg-form"
						name="identificationNumber"
						value="${requestScope.r.identificationNumber}">
				</tr>
				<tr>
					<td>完成形式</td>
					<td><input type="text" id="lg-form" name="completionForm"
						value="${requestScope.r.completionForm}">
				</tr>
				<tr>
					<td>备注</td>
					<td><input type="text" id="lg-form" name="remarks"
						value="${requestScope.r.remarks}">
				</tr>
				<tr>
					<td>学科门类</td>
					<td><input type="text" id="lg-form" name="firstDiscipline"
						value="${requestScope.r.firstDiscipline}">
				</tr>
				<tr>
					<td>一级学科</td>
					<td><input type="text" id="lg-form" name="disciplineCategory"
						value="${requestScope.r.disciplineCategory}">
				</tr>
				<tr>
					<td>项目来源</td>
					<td><input type="text" id="lg-form" name="projectSource"
						value="${requestScope.r.projectSource}">
				</tr>
				<tr>
					<td>学校署名</td>
					<td><input type="text" id="lg-form" name="schoolSignature"
						value="${requestScope.r.schoolSignature}">
				</tr>
				<tr>
					<td>审核状态</td>
					<td><input type="text" id="lg-form" name="auditStatus"
						value="${requestScope.r.auditStatus}">
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