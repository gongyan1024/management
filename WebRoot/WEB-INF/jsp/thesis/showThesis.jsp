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
						<form action="${pageContext.request.contextPath}/readExcelThesis"
							enctype="multipart/form-data" method="post" class="function">
							上传excel:<input type="file" name="user" id="lg-form"> <input
								type="submit" value="导入" id="lg-form">
						</form>
					</c:if>
					<form
						action="${pageContext.request.contextPath}/exportThesis?type=0"
						method="post" class="function">
						<input type="submit" value="导出(当前查询)" id="lg-form">
					</form>
					<form
						action="${pageContext.request.contextPath}/exportThesis?type=1"
						method="post" class="function">
						<input type="submit" value="导出(全)" id="lg-form">
					</form>
					<form action="${pageContext.request.contextPath}/findThesis"
						method="post" class="function">
						<input type="submit" value="查询" id="lg-form">
					</form>
					<form action="${pageContext.request.contextPath}/addThesis"
						method="post" class="function">
						<input type="submit" value="新增" id="lg-form">
					</form>
				</div>
				<div>
					<div>
						<h3 align="center">论文成果相关操作</h3>
					</div>
					<form
						action="${pageContext.request.contextPath}/dropThesis?pageNumber=${pageNumber}&jump=1"
						method="post">
						<input type="submit" value="删除" id="lg-form"
							style='color: Red; width: 53px; height: auto; position: absolute; left:20.1%; top:10.1%'
							onclick="return confirm('确定删除选择项？')">
						<table>

							<thead>
								<tr>
									<td>操作</td>
									<td>论文题目</td>
									<td>所属单位</td>
									<td>第一作者</td>
									<td>发表/出版时间</td>
									<td>发表刊物/论文集</td>
									<td>刊物级别</td>
									<td>审核级别</td>
									<td>操作</td>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${entryList}" var="entry">
									<tr align="center">
										<td><input type="checkbox" name="check" id="check"
											value="${entry.id}" /></td>
										<td><a href="showThesisDetail?id=${entry.id}">${entry.thesisName}
										</a></td>
										<td>${entry.affiliatedUnits}</td>
										<td>${entry.firstAuthorName}</td>
										<td>${entry.publishTime}</td>
										<td>${entry.publications}</td>
										<td>${entry.publicationLevel}</td>
										<td>${entry.auditStatus}</td>
										<td><a href="editThesis?id=${entry.id}">编辑</a> <a
											href="showDownloadThesis?id=${entry.id}">下载</a>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</form>
					<tfoot>
						<tr>
							<td colspan="5"><form action="showThesis" method="post"
									id="navigatorForm">
									<a href="showThesis?pageNumber=${1}&jump=1">首页</a>
									<c:if test="${pageNumber>1}">
										<a href="showThesis?pageNumber=${pageNumber-1}&jump=1">上一页</a>
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
										<a href="showThesis?pageNumber=${pageNumber+1}&jump=1">下一页</a>
									</c:if>
									<a href="showThesis?pageNumber=${totalPages}&jump=1">末页</a>
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