<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理系统</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/homePagestyle.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/menu.js"></script>
</head>

<body>
	<div class="top"></div>
	<div id="header">
		<div class="logo">管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a href="">${user.name }</a></li>
				<li><a href="">修改密码</a></li>
				<li><a href="">退出</a></li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M1">
						<span></span>人员管理
					</h4>
					<div class="list-item none">
						<a href="showResearchs">科研人员管理</a>
					</div>
				</li>
			</ul>
		</div>
		
		<div class="m-right">
			<div align="center" class="main">
				<a href="${pageContext.request.contextPath}/homePage">主页</a> <a
					href="">查询</a> <a href="">导入</a> <a
					href="${pageContext.request.contextPath}/exportResearchs">导出</a>

				<table>
					<thead>
						<tr>
							<td>人员名称</td>
							<td>性别</td>
							<td>身份证信息</td>
							<td>出生日期</td>
							<td>科研单位</td>
							<td>最后学位</td>
							<td>最后学历</td>
							<td>职称</td>
							<td>研究方向</td>
							<td>行政职务</td>
							<td>国籍</td>
							<td>民族</td>
							<td>家庭住址</td>
							<td>邮政编码</td>
							<td>住宅电话</td>
							<td>手机</td>
							<td>Email</td>
							<td>办公电话</td>
							<td>学术兼职</td>
							<td>学术特长</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${entryList}" var="entry">
							<tr align="center">
								<td><a href="showResearcherDetail?id=${entry.id}">${entry.name}</a></td>
								<td>${entry.sex}</td>
								<td>${entry.idCard}</td>
								<td>${entry.birth}</td>
								<td>${entry.researchUnit}</td>
								<td>${entry.finalDegree}</td>
								<td>${entry.finalEducation}</td>
								<td>${entry.title}</td>
								<td>${entry.researchDirection}</td>
								<td>${entry.administrativeDuty}</td>
								<td>${entry.country}</td>
								<td>${entry.nation}</td>
								<td>${entry.address}</td>
								<td>${entry.postCode}</td>
								<td>${entry.homePhone}</td>
								<td>${entry.phone}</td>
								<td>${entry.email}</td>
								<td>${entry.officePhone}</td>
								<td>${entry.academicPartTime}</td>
								<td>${entry.academicSpecialty}</td>
								<td>${entry.sex}</td>
								<td><a href="editResearchs?id=${entry.id}">编辑</a></td>
								<td><a href="showDownloadResearchs?id=${entry.id}">下载</a></td>
								<c:if test="${user.type == 1}">
									<td><a href="">Delete</a></td>
								</c:if>
							</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr align="center">
							<td colspan="5"><jsp:include
									page="/WEB-INF/jsp/paging_footer.jsp"></jsp:include></td>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
	</div>
	<div class="bottom"></div>
	<script>navList(12);</script>
	</script>
</body>
</html>
