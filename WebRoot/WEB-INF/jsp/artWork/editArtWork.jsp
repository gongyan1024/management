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
			编辑艺术作品<a href="showArtWork">(返回)</a>
		</h2>
		<form action="confrimEditArtWork?id=${requestScope.r.id }"
			method="post" id="rg-form">
			<table width="60%" border="1">

				<tr>
					<td>成果名称</td>
					<td><input type="text" id="lg-form" name="resultsName"
						value="${requestScope.r.resultsName}">
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
					<td>发表时间</td>
					<td><input type="text" id="lg-form" name="publishedTime"
						value="${requestScope.r.publishedTime}">
				</tr>
				<tr>
					<td>第一作者职工号</td>
					<td><input type="text" id="lg-form" name="firstAuthorNumber"
						value="${requestScope.r.firstAuthorNumber}">
				</tr>
				<tr>
					<td>成果类型</td>
					<td><input type="text" id="lg-form" name="resultsType"
						value="${requestScope.r.resultsType}">
				</tr>
				<tr>
					<td>成果认定级别</td>
					<td><input type="text" id="lg-form" name="achievementLevel"
						value="${requestScope.r.achievementLevel}">
				</tr>
				<tr>
					<td>发表刊物/论文集</td>
					<td><input type="text" id="lg-form" name="publications"
						value="${requestScope.r.publications}">
				</tr>
				<tr>
					<td>出版时间</td>
					<td><input type="text" id="lg-form" name="publicationDate"
						value="${requestScope.r.publicationDate}">
				</tr>
				<tr>
					<td>刊物级别</td>
					<td><input type="text" id="lg-form" name="publicationLevel"
						value="${requestScope.r.publicationLevel}">
				</tr>
				<tr>
					<td>所有作者</td>
					<td><input type="text" id="lg-form" name="author"
						value="${requestScope.r.author}">
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
					<td>备注</td>
					<td><input type="text" id="lg-form" name="remark"
						value="${requestScope.r.remark}">
				</tr>


				<tr>
					<td><input type="reset" value="清空"></td>
					<td><input type="submit" value="确认"></td>
				</tr>
			</table>
		</form>
		<div>
			<form
				action="${pageContext.request.contextPath}/uploadArtWork?id=${requestScope.r.id}"
				enctype="multipart/form-data" method="post">
				上传佐证:<input type="file" name="user" id="lg-form"> <input
					type="submit" value="提交" id="lg-form">
			</form>
		</div>
	</div>
</body>
</html>