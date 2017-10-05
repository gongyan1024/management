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
			著作成果信息<a href="showAchievements">(返回)</a>
		</h2>
		<table width="60%" border="1">
			<tr>
				<td>著作名称</td>
				<td><input type="text" id="lg-form" name="bookName"
					value="${requestScope.r.bookName}">
			</tr>
			<tr>
				<td>第一作者类型</td>
				<td><input type="text" id="lg-form" name="firstAuthorType"
					value="${requestScope.r.firstAuthorType}">
			</tr>
			<tr>
				<td>第一作者</td>
				<td><input type="text" id="lg-form" name="firstAuthor"
					value="${requestScope.r.firstAuthor}">
			</tr>
			<tr>
				<td>所属单位</td>
				<td><input type="text" id="lg-form" name="subordinateUnit"
					value="${requestScope.r.subordinateUnit}">
			</tr>
			<tr>
				<td>教研室</td>
				<td><input type="text" id="lg-form" name="office"
					value="${requestScope.r.office}">
			</tr>
			<tr>
				<td>参编作者</td>
				<td><input type="text" id="lg-form" name="participatedAuthor"
					value="${requestScope.r.participatedAuthor}">
			</tr>
			<tr>
				<td>第一作者职工号</td>
				<td><input type="text" id="lg-form" name="firstAuthorNumber"
					value="${requestScope.r.firstAuthorNumber}"><a
					href="showResearcherDetail?staffNum=${requestScope.r.firstAuthorNumber}">(详情)</a>
			</tr>
			<tr>
				<td>出版单位</td>
				<td><input type="text" id="lg-form" name="thePublisher"
					value="${requestScope.r.thePublisher}">
			</tr>
			<tr>
				<td>出版单位类型</td>
				<td><input type="text" id="lg-form" name="publicationUnitType"
					value="${requestScope.r.publicationUnitType}">
			</tr>
			<tr>
				<td>出版时间</td>
				<td><input type="text" id="lg-form" name="publicationDate"
					value="${requestScope.r.publicationDate}">
			</tr>
			<tr>
				<td>出版地</td>
				<td><input type="text" id="lg-form" name="publishedIn"
					value="${requestScope.r.publishedIn}">
			</tr>
			<tr>
				<td>著作类别</td>
				<td><input type="text" id="lg-form" name="booksCategories"
					value="${requestScope.r.booksCategories}">
			</tr>
			<tr>
				<td>学科门类</td>
				<td><input type="text" id="lg-form" name="disciplines"
					value="${requestScope.r.disciplines}">
			</tr>
			<tr>
				<td>一级学科</td>
				<td><input type="text" id="lg-form" name="levelOneSubject"
					value="${requestScope.r.levelOneSubject}">
			</tr>
			<tr>
				<td>项目来源</td>
				<td><input type="text" id="lg-form" name="projectSource"
					value="${requestScope.r.projectSource}">
			</tr>
			<tr>
				<td>总字数</td>
				<td><input type="text" id="lg-form" name="wordsNumber"
					value="${requestScope.r.wordsNumber}">
			</tr>
			<tr>
				<td>是否译成外文</td>
				<td><input type="text" id="lg-form" name="foreignLanguage"
					value="${requestScope.r.foreignLanguage}">
			</tr>
			<tr>
				<td>学校署名</td>
				<td><input type="text" id="lg-form" name="schoolName"
					value="${requestScope.r.schoolName}">
			</tr>
			<tr>
				<td>语种</td>
				<td><input type="text" id="lg-form" name="languages"
					value="${requestScope.r.languages}">
			</tr>
			<tr>
				<td>ISBN号</td>
				<td><input type="text" id="lg-form" name="isbn"
					value="${requestScope.r.isbn}">
			</tr>
			<tr>
				<td>简介</td>
				<td><input type="text" id="lg-form" name="profile"
					value="${requestScope.r.profile}">
			</tr>
			<tr>
				<td>审核状态</td>
				<td><input type="text" id="lg-form" name="auditStatus"
					value="${requestScope.r.auditStatus}">
			</tr>
		</table>
	</div>
</body>
</html>