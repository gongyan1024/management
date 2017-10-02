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
							action="${pageContext.request.contextPath}/readExcelMeetingHost"
							enctype="multipart/form-data" method="post" class="function">
							上传excel:<input type="file" name="user" id="lg-form"> <input
								type="submit" value="导入" id="lg-form">
						</form>
					</c:if>

					<form
						action="${pageContext.request.contextPath}/exportMeetingHost"
						method="post" class="function">
						<input type="submit" value="导出" id="lg-form">
					</form>
					<form
						action="${pageContext.request.contextPath}/findMeetingHost"
						method="post" class="function">
						<input type="submit" value="查询" id="lg-form">
					</form>
					<form
						action="${pageContext.request.contextPath}/addMeetingHost"
						method="post" class="function">
						<input type="submit" value="新增" id="lg-form">
					</form>
				</div>
				<div>
					<table>
					<h3 align="center">主办会议相关操作</h3>
						<thead>
							<tr>
								<td>会议名称</td>
								<td>承办部门</td>
								<td>会议地点</td>
								<td>会议类型</td>
								<td>开始日期</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${entryList}" var="entry">
								<tr align="center">
									<td><a href="showMeetingHostDetail?id=${entry.id}">${entry.meetingName}</a></td>
									<td>${entry.undertakeDepartment}</td>
									<td>${entry.meetingPlace}</td>
									<td>${entry.meetingType}</td>
									<td>${entry.startDate}</td>
									<td><a href="editMeetingHost?id=${entry.id}">编辑</a> <a
										href="showDownloadMeetingHost?id=${entry.id}">下载</a> <c:if
											test="${user.type == 1}">
											<a href="dropMeetingHost?id=${entry.id}">删除</a>
										</c:if></td>
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