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
							action="${pageContext.request.contextPath}/readExcelIdentificationResult"
							enctype="multipart/form-data" method="post" class="function">
							上传excel:<input type="file" name="user" id="lg-form"> <input
								type="submit" value="导入" id="lg-form">
						</form>
					</c:if>

					<form
						action="${pageContext.request.contextPath}/exportIdentificationResult"
						method="post" class="function">
						<input type="submit" value="导出" id="lg-form">
					</form>
					<form
						action="${pageContext.request.contextPath}/findIdentificationResult"
						method="post" class="function">
						<input type="submit" value="查询" id="lg-form">
					</form>
					<form
						action="${pageContext.request.contextPath}/addIdentificationResult"
						method="post" class="function">
						<input type="submit" value="新增" id="lg-form">
					</form>
				</div>
				<div>
					<table>
						<h3 align="center">鉴定成果相关操作</h3>
						<thead>
							<tr>
								<td>成果名称</td>
								<td>所属单位</td>
								<td>第一作者</td>
								<td>鉴定日期</td>
								<td>鉴定结果</td>
								<td>鉴定部门</td>
								<td>审核级别</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${entryList}" var="entry">
								<tr align="center">
									<td><a href="showIdentificationResultDetail?id=${entry.id}">${entry.outcomeName}</a></td>
									<td>${entry.subordinateUnit}</td>
									<td>${entry.firstAuthorName}</td>
									<td>${entry.identificationDate}</td>
									<td>${entry.expertConclusion}</td>
									<td>${entry.identificationDepartment}</td>
									<td>${entry.auditStatus}</td>
									<td><a href="editIdentificationResult?id=${entry.id}">编辑</a> <a
										href="showDownloadIdentificationResult?id=${entry.id}">下载</a> <c:if
											test="${user.type == 1}">
											<a href="dropIdentificationResult?id=${entry.id}">删除</a>
										</c:if></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<tfoot>
						<tr>
							<td colspan="5"><form action="showIdentificationResult" method="post"
									id="navigatorForm">
									<a href="showIdentificationResult?pageNumber=${1}">首页</a>
									<c:if test="${pageNumber>1}">
										<a href="showIdentificationResult?pageNumber=${pageNumber-1}">上一页</a>
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
										<a href="showIdentificationResult?pageNumber=${pageNumber+1}">下一页</a>
									</c:if>
									<a href="showIdentificationResult?pageNumber=${totalPages}">末页</a>
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