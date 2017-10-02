<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>修改密码</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>
</head>

<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h1>修改密码</h1>
		<form action="confirmNewPwd?id=${requestScope.id}" method="post"
			class="form">
			<table width="60%" border="1">
				<tr>
					<td>原密码</td>
					<td><input type="text" name="password" value="">${requestScope.errors.password}
					</td>
				</tr>
				<tr>
					<td>新密码</td>
					<td><input type="password" name="newPassword" value="">${requestScope.errors.newPassword}
					</td>
				</tr>
				<tr>
					<td>确认新密码</td>
					<td><input type="password" name="confirmPwd" value="">${requestScope.errors.confirmPwd}
					</td>
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