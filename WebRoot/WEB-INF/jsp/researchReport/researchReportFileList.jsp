<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<title>下载列表</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<!-- 遍历Map集合 -->
	<div class="container">
	<h2 align="center">佐证文件列表<a href="showResearchReport">(返回)</a></h2>
		<c:forEach var="me" items="${fileNameMap}">
			<c:url value="downloadResearchReport" var="downurl">
				<c:param name="filename" value="${me.value}"></c:param>
			</c:url>
        ${me.key}<a href="${downurl}">下载</a>

			<c:if test="${user.type == 1}">
			<c:url value="deleteResearchReport" var="deleteurl">
				<c:param name="path" value="${me.value}"></c:param>
				<c:param name="id" value="${param.id}"></c:param>
			</c:url>
				<a href="${deleteurl}">删除</a>
			</c:if>
			<br />
		</c:forEach>
	</div>
</body>
</html>