<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript"
    src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    
<form action="showResearchs" method="post" id="navigatorForm">
	<a href="showResearchs?pageNumber=${1}">首页</a>
	<c:if test="${pageNumber>1}">
		<a href="showResearchs?pageNumber=${pageNumber-1}">上一页</a>
	</c:if>
	跳转到第 <select name="pageNumber" onchange="gotoSelectedPage()">
		<c:forEach begin="1" end="${totalPages}" step="1" var="pageIndex">
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
		<a href="showResearchs?pageNumber=${pageNumber+1}">下一页</a>
	</c:if>
	<a href="showResearchs?pageNumber=${totalPages}">末页</a>
</form>
<script type="text/javascript">
	function gotoSelectedPage() {
		var x = document.getElementById("navigatorForm");
		x.submit();
	}
</script>

