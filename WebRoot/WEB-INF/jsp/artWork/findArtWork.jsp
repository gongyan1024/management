<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>艺术作品查找</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">艺术作品查找<a href="showArtWork">(返回)</a></h2>
		<form action="confirmFindArtWork"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>成果名称</td>
					<td><input type="text" id="lg-form" name="resultsName"
						value="">
					</td>
				</tr>
				<tr>
					<td>第一作者名称</td>
					<td><input type="text" id="lg-form" name="firstAuthorName"
						value="">
					</td>
				</tr>
				<tr>
					<td>第一作者职工号</td>
					<td><input type="text" id="lg-form" name="firstAuthorNumber"
						value="">
					</td>
				</tr>
				<tr>
					<td>教研室</td>
					<td><input type="text" id="lg-form" name="researchSection"
						value="">
					</td>
				</tr>
				<tr>
					<td>参与作者</td>
					<td><input type="text" id="lg-form" name="author"
						value="">
					</td>
				</tr>
				<tr>
					<td>审核状态</td>
					<td><input type="text" id="lg-form" name="auditStatus"
						value="">
					</td>
				</tr>
				<tr>
					<td>成果类型</td>
					<td><input type="text" id="lg-form" name="resultsType"
						value="">
					</td>
				</tr>
				<tr>
					<td><input type="reset" value="清空"></td>
					<td><input type="submit" value="确认"></td>
				</tr>
			</table>
		</form>
		<div>
		</div>
	</div>
</body>
</html>