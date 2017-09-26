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
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4758",secure:"10666"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-6" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/researcherEdit.jsp">
	<div id="header" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-6" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/researcherEdit.jsp">
		<div class="logo">管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a href="">${user.name }</a></li>
				<li><a href="${pageContext.request.contextPath}/homePage">主页</a></li>
				<li><a href="">修改密码</a></li>
				<li><a href="${pageContext.request.contextPath}/logout">退出</a></li>
			</ul>
		</div>
	</div>
	<div class="container">
		<h1>科研人士编辑</h1>
		<form action="confirmEditResearchs?id=${requestScope.r.id}"
			method="post" id="rg-form">
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
				<tr>
					<td><input type="reset" value="清空"></td>
					<td><input type="submit" value="确认"></td>
				</tr>
			</table>
		</form>
		<div>
			<form
				action="${pageContext.request.contextPath}/uploadResearchs?id=${requestScope.r.id}"
				enctype="multipart/form-data" method="post">
				上传佐证:<input type="file" name="user" id="lg-form"> <input
					type="submit" value="提交" id="lg-form">
			</form>
		</div>
	</div>
</body>
</html>