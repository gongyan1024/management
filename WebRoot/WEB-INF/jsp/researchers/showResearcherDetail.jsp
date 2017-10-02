<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<title>科研人士编辑</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">科研人士信息<a href="showResearchs">(返回)</a></h2>
		<table width="60%" border="1">
			<tr>
				<td>人员名称</td>
				<td><input type="text" id="lg-form" name="name"
					value="${requestScope.r.name}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="text" id="lg-form" name="sex"
					value="${requestScope.r.sex}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>身份证信息</td>
				<td><input type="text" id="lg-form" name="idCard"
					value="${requestScope.r.idCard}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>出生日期</td>
				<td><input type="text" id="lg-form" name="birth"
					value="${requestScope.r.birth}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>科研单位</td>
				<td><input type="text" id="lg-form" name="researchUnit"
					value="${requestScope.r.researchUnit}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>最后学位</td>
				<td><input type="text" id="lg-form" name="finalDegree"
					value="${requestScope.r.finalDegree}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>最后学历</td>
				<td><input type="text" id="lg-form" name="finalEducation"
					value="${requestScope.r.finalEducation}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>职称</td>
				<td><input type="text" id="lg-form" name="title"
					value="${requestScope.r.title}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>研究方向</td>
				<td><input type="text" id="lg-form" name="researchDirection"
					value="${requestScope.r.researchDirection}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>行政职务</td>
				<td><input type="text" id="lg-form" name="administrativeDuty"
					value="${requestScope.r.administrativeDuty}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>国籍</td>
				<td><input type="text" id="lg-form" name="country"
					value="${requestScope.r.country}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>民族</td>
				<td><input type="text" id="lg-form" name="nation"
					value="${requestScope.r.nation}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>家庭住址</td>
				<td><input type="text" id="lg-form" name="address"
					value="${requestScope.r.address}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>邮政编码</td>
				<td><input type="text" id="lg-form" name="postCode"
					value="${requestScope.r.postCode}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>住宅电话</td>
				<td><input type="text" id="lg-form" name="homePhone"
					value="${requestScope.r.homePhone}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>手机</td>
				<td><input type="text" id="lg-form" name="phone"
					value="${requestScope.r.phone}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" id="lg-form" name="email"
					value="${requestScope.r.email}">${requestScope.errors.username}
				</td>
			</tr>
			<tr>
				<td>办公电话</td>
				<td><input type="text" id="lg-form" name="officePhone"
					value="${requestScope.r.officePhone}">${requestScope.errors.username}</td>
			</tr>
			<tr>
				<td>学术兼职</td>
				<td><input type="text" id="lg-form" name="academicPartTime"
					value="${requestScope.r.academicPartTime}">${requestScope.errors.username}</td>
			</tr>
			<tr>
				<td>学术特长</td>
				<td><input type="text" id="lg-form" name="academicSpecialty"
					value="${requestScope.r.academicSpecialty}">${requestScope.errors.username}</td>
			</tr>
		</table>
		
</body>
</html>