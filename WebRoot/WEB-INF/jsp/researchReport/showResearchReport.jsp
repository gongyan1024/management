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
							action="${pageContext.request.contextPath}/readExcelResearchReport"
							enctype="multipart/form-data" method="post" class="function">
							上传excel:<input type="file" name="user" id="lg-form"> <input
								type="submit" value="导入" id="lg-form">
						</form>
					</c:if>

					<form
						action="${pageContext.request.contextPath}/exportResearchReport"
						method="post" class="function">
						<input type="submit" value="导出" id="lg-form">
					</form>
					<form
						action="${pageContext.request.contextPath}/findResearchReport"
						method="post" class="function">
						<input type="submit" value="查询" id="lg-form">
					</form>
					<form
						action="${pageContext.request.contextPath}/addResearchReport"
						method="post" class="function">
						<input type="submit" value="新增" id="lg-form">
					</form>
				</div>
				<div>
					<table>
						<h3 align="center">研究报告相关操作</h3>
						<thead>
							<tr>
								<td>报告题目</td>
								<td>所属单位</td>
								<td>采纳单位</td>
								<td>所有作者</td>
								<td>采纳时间</td>
								<td>一级学科</td>
								<td>项目来源</td>
								<td>审核状态</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${entryList}" var="entry">
								<tr align="center">
									<td><a href="showResearchReportDetail?id=${entry.id}">${entry.reportTopic}</a></td>
									<td>${entry.subordinateUnit}</td>
									<td>${entry.adoptionUnit}</td>
									<td>${entry.author}</td>
									<td>${entry.adoptionTime}</td>
									<td>${entry.firstDiscipline}</td>
									<td>${entry.projectSource}</td>
									<td>${entry.auditStatus}</td>
									<td><a href="editResearchReport?id=${entry.id}">编辑</a> <a
										href="showDownloadResearchReport?id=${entry.id}">下载</a> <c:if
											test="${user.type == 1}">
											<a href="dropResearchReport?id=${entry.id}">删除</a>
										</c:if></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<tfoot>
						<tr>
							<td colspan="5"><form action="showResearchReport" method="post"
									id="navigatorForm">
									<a href="showResearchReport?pageNumber=${1}">首页</a>
									<c:if test="${pageNumber>1}">
										<a href="showResearchReport?pageNumber=${pageNumber-1}">上一页</a>
									</c:if>
									跳转到第 <select name="pageNumber" onchange="gotoSelectedPage()">
										<c:forEach begin="1" end="${totalPages}" step="1"
											var="pageIndex">
											<c:choose>
												<c:when test="${pageIndex eq pageNumber}">
													<option value="${pageIndex}" selected="selected">${pageIndex}</option>
												</c:when>
												<c:otherwise>
													<option value="${pageIndex}">${pageIndex}</option>
												</c:otherwise>
											</c:choose>
										</c:forEach>
									</select>页
									<c:if test="${pageNumber<totalPages}">
										<a href="showResearchReport?pageNumber=${pageNumber+1}">下一页</a>
									</c:if>
									<a href="showResearchReport?pageNumber=${totalPages}">末页</a>
								</form></td>
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
<script type="text/javascript">
    function gotoSelectedPage() {
        var x = document.getElementById("navigatorForm");
        x.submit();
    }
</script>