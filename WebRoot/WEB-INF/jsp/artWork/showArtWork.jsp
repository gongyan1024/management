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
						<form action="${pageContext.request.contextPath}/readExcelArtWork"
							enctype="multipart/form-data" method="post" class="function">
							上传excel:<input type="file" name="user" id="lg-form"> <input
								type="submit" value="导入" id="lg-form">
						</form>
					</c:if>
					<form
						action="${pageContext.request.contextPath}/exportArtWork?type=0"
						method="post" class="function">
						<input type="submit" value="导出(当前查询)" id="lg-form">
					</form>
					<form
						action="${pageContext.request.contextPath}/exportArtWork?type=1"
						method="post" class="function">
						<input type="submit" value="导出(全)" id="lg-form">
					</form>
					<form action="${pageContext.request.contextPath}/findArtWork"
						method="post" class="function">
						<input type="submit" value="查询" id="lg-form">
					</form>
					<form action="${pageContext.request.contextPath}/addArtWork"
						method="post" class="function">
						<input type="submit" value="新增" id="lg-form">
					</form>
				</div>
				<div>
					<div>
						<h3 align="center">艺术作品相关操作</h3>
					</div>
					<form
						action="${pageContext.request.contextPath}/dropArtWork?pageNumber=${pageNumber}&jump=1"
						method="post">
						<input type="submit" value="删除" id="lg-form"
							style='color: Red; width: 53px; height: auto; position: absolute; left:20.1%; top:10.1%'
							onclick="return confirm('确定删除选择项？')">
						<table>

							<thead>
								<tr>
									<td>操作</td>
									<td>成果名称</td>
									<td>所属单位</td>
									<td>成果类型</td>
									<td>所有作者</td>
									<td>发表时间</td>
									<td>审核状态</td>
									<td>操作</td>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${entryList}" var="entry">
									<tr align="center">
										<td><input type="checkbox" name="check" id="check"
											value="${entry.id}" /></td>
										<td><a href="showArtWorkDetail?id=${entry.id}">${entry.resultsName}
										</a></td>
										<td>${entry.subordinateUnit}</td>
										<td>${entry.resultsType}</td>
										<td>${entry.author}</td>
										<td>${entry.publishedTime}</td>
										<td>${entry.auditStatus}</td>
										<td><a href="editArtWork?id=${entry.id}">编辑</a> <a
											href="showDownloadArtWork?id=${entry.id}">下载</a>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</form>
					<tfoot>
						<tr>
							<td colspan="5"><form action="showArtWork" method="post"
									id="navigatorForm">
									<a href="showArtWork?pageNumber=${1}&jump=1">首页</a>
									<c:if test="${pageNumber>1}">
										<a href="showArtWork?pageNumber=${pageNumber-1}&jump=1">上一页</a>
									</c:if>
									跳转到第 <select name="pageNumber" onchange="gotoSelectedPage()">
										<c:forEach begin="1" end="${totalPages}" step="1"
											var="pageIndex">
											<c:choose>
												<c:when test="${pageIndex eq pageNumber}">
													<option value="${pageIndex}" selected="selected">${pageIndex}</option>
												</c:when>
												<c:otherwise>
													<option value="${pageIndex}&jump=1">${pageIndex}</option>
												</c:otherwise>
											</c:choose>
										</c:forEach>
									</select>页
									<c:if test="${pageNumber<totalPages}">
										<a href="showArtWork?pageNumber=${pageNumber+1}&jump=1">下一页</a>
									</c:if>
									<a href="showArtWork?pageNumber=${totalPages}&jump=1">末页</a>
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