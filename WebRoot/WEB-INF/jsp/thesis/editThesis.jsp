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
			编辑论文成果<a href="showThesis">(返回)</a>
		</h2>
		<form action="confrimEditThesis?id=${requestScope.r.id }"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>论文级别</td>
					<td><input type="text" id="lg-form" name="thesisLevel"
						value="${requestScope.r.thesisLevel}">
				</tr>
				<tr>
					<td>论文类型</td>
					<td><input type="text" id="lg-form" name="thesisType"
						value="${requestScope.r.thesisType}">
				</tr>
				<tr>
					<td>论文题目</td>
					<td><input type="text" id="lg-form" name="thesisName"
						value="${requestScope.r.thesisName}">
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
					<td><input type="text" id="lg-form" name="affiliatedUnits"
						value="${requestScope.r.affiliatedUnits}">
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
					<td>发表/出版时间</td>
					<td><input type="text" id="lg-form" name="publishTime"
						value="${requestScope.r.publishTime}">
				</tr>
				<tr>
					<td>论文转载</td>
					<td><input type="text" id="lg-form" name="reprint"
						value="${requestScope.r.reprint}">
				</tr>
				<tr>
					<td>论文收录</td>
					<td><input type="text" id="lg-form" name="included"
						value="${requestScope.r.included}">
				</tr>
				<tr>
					<td>发表刊物/论文集</td>
					<td><input type="text" id="lg-form" name="publications"
						value="${requestScope.r.publications}">
				</tr>
				<tr>
					<td>刊物级别</td>
					<td><input type="text" id="lg-form" name="publicationLevel"
						value="${requestScope.r.publicationLevel}">
				</tr>
				<tr>
					<td>编辑部地址</td>
					<td><input type="text" id="lg-form"
						name="editorialOfficeAddress"
						value="${requestScope.r.editorialOfficeAddress}">
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
					<td>发表范围</td>
					<td><input type="text" id="lg-form" name="publicationRange"
						value="${requestScope.r.publicationRange}">
				</tr>
				<tr>
					<td>论文集出版单位</td>
					<td><input type="text" id="lg-form" name="publicationUnit"
						value="${requestScope.r.publicationUnit}">
				</tr>
				<tr>
					<td>卷号</td>
					<td><input type="text" id="lg-form" name="volumeNumber"
						value="${requestScope.r.volumeNumber}">
				</tr>
				<tr>
					<td>期号</td>
					<td><input type="text" id="lg-form" name="issue"
						value="${requestScope.r.issue}">
				</tr>
				<tr>
					<td>页码范围</td>
					<td><input type="text" id="lg-form" name="pageRange"
						value="${requestScope.r.pageRange}">
				</tr>
				<tr>
					<td>个人执笔数</td>
					<td><input type="text" id="lg-form"
						name="individualWritersnumber"
						value="${requestScope.r.individualWritersnumber}">
				</tr>
				<tr>
					<td>学校署名</td>
					<td><input type="text" id="lg-form" name="schoolSignature"
						value="${requestScope.r.schoolSignature}">
				</tr>
				<tr>
					<td>关键字</td>
					<td><input type="text" id="lg-form" name="keyWord"
						value="${requestScope.r.keyWord}">
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
					<td>版面</td>
					<td><input type="text" id="lg-form" name="page"
						value="${requestScope.r.page}">
				</tr>
				<tr>
					<td>是否为译文</td>
					<td><input type="text" id="lg-form" name="translation"
						value="${requestScope.r.translation}">
				</tr>
				<tr>
					<td>ISSN号</td>
					<td><input type="text" id="lg-form" name="issNnumber"
						value="${requestScope.r.issNnumber}">
				</tr>
				<tr>
					<td>CN号</td>
					<td><input type="text" id="lg-form" name="cnNumber"
						value="${requestScope.r.cnNumber}">
				</tr>
				<tr>
					<td><input type="reset" value="清空"></td>
					<td><input type="submit" value="确认"></td>
				</tr>
			</table>
		</form>
		<div>
			<form
				action="${pageContext.request.contextPath}/uploadThesis?id=${requestScope.r.id}"
				enctype="multipart/form-data" method="post">
				上传佐证:<input type="file" name="user" id="lg-form"> <input
					type="submit" value="提交" id="lg-form">
			</form>
		</div>
	</div>
</body>
</html>