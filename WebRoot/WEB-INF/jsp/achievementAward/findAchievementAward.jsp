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
		<h2 align="center">学术讲座查找<a href="showAchievementAward">(返回)</a></h2>
		<form action="confirmFindAchievementAward"
			method="post" id="rg-form">
			<table width="60%" border="1">
				<tr>
					<td>讲座名称</td>
					<td><input type="text" id="lg-form" name="bonusName"
						value="">
					</td>
				</tr>
				<tr>
					<td>第一完成人</td>
					<td><input type="text" id="lg-form" name="firstAdult"
						value="">
					</td>
				</tr>
				<tr>
					<td>成果名称</td>
					<td><input type="text" id="lg-form" name="outcomeName"
						value="">
					</td>
				</tr>
				<tr>
					<td>发证机关</td>
					<td><input type="text" id="lg-form" name="issuingAuthority"
						value="">
					</td>
				</tr>
				<tr>
					<td>获奖级别</td>
					<td><input type="text" id="lg-form" name="awardLevel"
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