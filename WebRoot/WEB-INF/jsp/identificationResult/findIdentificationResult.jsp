<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>鉴定成果查找</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">鉴定成果查找<a href="showIdentificationResult">(返回)</a></h2>
		<form action="confirmFindIdentificationResult"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>成果名称</td>
					<td><input type="text" id="lg-form" name="outcomeName"
						value="">
					</td>
				</tr>
				<tr>
					<td>所属单位</td>
					<td><input type="text" id="lg-form" name="subordinateUnit"
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
					<td>第一作者类型</td>
					<td><input type="text" id="lg-form" name="firstAuthorType"
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
					<td>成果作者名称</td>
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