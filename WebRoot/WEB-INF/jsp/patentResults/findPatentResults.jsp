<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>参加会议查找</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">专利成果查找<a href="showPatentResults">(返回)</a></h2>
		<form action="confirmFindPatentResults"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>专利名称</td>
					<td><input type="text" id="lg-form" name="patentName"
						value="">
					</td>
				</tr>
				<tr>
					<td>第一发明人</td>
					<td><input type="text" id="lg-form" name="firstInventor"
						value="">
					</td>
				</tr>
				<tr>
					<td>专利发明人</td>
					<td><input type="text" id="lg-form" name="patentInventor"
						value="">
					</td>
				</tr>
				<tr>
					<td>申请号</td>
					<td><input type="text" id="lg-form" name="applicationNumber"
						value="">
					</td>
				</tr>
				<tr>
					<td>专利状态</td>
					<td><input type="text" id="lg-form" name="patentStatus"
						value="">
					</td>
				</tr>
				<tr>
					<td>公开号</td>
					<td><input type="text" id="lg-form" name="openNo"
						value="">
					</td>
				</tr>
				<tr>
					<td>授权号</td>
					<td><input type="text" id="lg-form" name="licenseNo"
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