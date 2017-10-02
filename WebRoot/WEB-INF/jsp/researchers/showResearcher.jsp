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
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div id="content">
		<jsp:include page="/WEB-INF/jsp/left_menu.jsp"></jsp:include>
		<div class="m-right">
			<div align="center" class="main">
				<div id="func">
					<c:if test="${user.type == 1}">
						<form
							action="${pageContext.request.contextPath}/readExcelResearchs"
							enctype="multipart/form-data" method="post" class="function">
							上传excel:<input type="file" name="user" id="lg-form"> <input
								type="submit" value="导入" id="lg-form">
						</form>
					</c:if>

					<form action="${pageContext.request.contextPath}/exportResearchs"
						method="post" class="function">
						<input type="submit" value="导出" id="lg-form">
					</form>
					<form action="${pageContext.request.contextPath}/findResearcher"
						method="post" class="function">
						<input type="submit" value="查询" id="lg-form">
					</form>
					<form action="${pageContext.request.contextPath}/addResearcher"
						method="post" class="function">
						<input type="submit" value="新增" id="lg-form">
					</form>
				</div>
				<div>
					<table>
					<h3 align="center">科研人员相关操作</h3>
						<thead>
							<tr>
								<td>人员名称</td>
								<td>身份证信息</td>
								<td>科研单位</td>
								<td>最后学位</td>
								<td>职称</td>
								<td>研究方向</td>
								<td>行政职务</td>
								<td>手机</td>
								<td>Email</td>
								<td>办公电话</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${entryList}" var="entry">
								<tr align="center">
									<td><a href="showResearcherDetail?id=${entry.id}">${entry.name}</a></td>
									<td>${entry.idCard}</td>
									<td>${entry.researchUnit}</td>
									<td>${entry.finalDegree}</td>
									<td>${entry.title}</td>
									<td>${entry.researchDirection}</td>
									<td>${entry.administrativeDuty}</td>
									<td>${entry.phone}</td>
									<td>${entry.email}</td>
									<td>${entry.officePhone}</td>
									<td><a href="editResearchs?id=${entry.id}">编辑</a></td>
									<td><a href="showDownloadResearchs?id=${entry.id}">下载</a></td>
									<c:if test="${user.type == 1}">
										<td><a href="deleteResearchs?id=${entry.id}">删除</a></td>
									</c:if>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<tfoot>
						<tr>
							<td colspan="5"><jsp:include
									page="/WEB-INF/jsp/paging_footer.jsp"></jsp:include></td>
						</tr>
					</tfoot>
				</div>
			</div>
		</div>
	</div>
	<div class="bottom"></div>
	<script>navList(12);
	</script>
</body>
</html>
