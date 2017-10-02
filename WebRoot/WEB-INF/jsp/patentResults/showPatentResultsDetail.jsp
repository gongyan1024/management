<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/css/head.css" />
</head>

<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
	<div class="container">
		<h2 align="center">
			专利成果信息<a href="showPatentResults">(返回)</a>
		</h2>
		<table width="60%" border="1">
			<tr>
				<td>专利名称</td>
				<td><input type="text" id="lg-form" name="patentName"
					value="${requestScope.r.patentName}">
			</tr>
			<tr>
				<td>第一发明人类型</td>
				<td><input type="text" id="lg-form" name="firstInventorType"
					value="${requestScope.r.firstInventorType}">
			</tr>
			<tr>
				<td>第一发明人</td>
				<td><input type="text" id="lg-form" name="firstInventor"
					value="${requestScope.r.firstInventor}">
			</tr>
			<tr>
				<td>所属单位</td>
				<td><input type="text" id="lg-form" name="subordinateUnits"
					value="${requestScope.r.subordinateUnits}">
			</tr>
			<tr>
				<td>教研室</td>
				<td><input type="text" id="lg-form" name="office"
					value="${requestScope.r.office}">
			</tr>
			<tr>
				<td>专利发明人</td>
				<td><input type="text" id="lg-form" name="patentInventor"
					value="${requestScope.r.patentInventor}">
			</tr>
			<tr>
				<td>专利类型</td>
				<td><input type="text" id="lg-form" name="patentType"
					value="${requestScope.r.patentType}">
			</tr>
			<tr>
				<td>专利范围</td>
				<td><input type="text" id="lg-form" name="patentscope"
					value="${requestScope.r.patentscope}">
			</tr>
			<tr>
				<td>专利状态</td>
				<td><input type="text" id="lg-form" name="patentStatus"
					value="${requestScope.r.patentStatus}">
			</tr>
			<tr>
				<td>申请号</td>
				<td><input type="text" id="lg-form" name="applicationNumber"
					value="${requestScope.r.applicationNumber}">
			</tr>
			<tr>
				<td>申请日期</td>
				<td><input type="text" id="lg-form" name="applicationDate"
					value="${requestScope.r.applicationDate}">
			</tr>
			<tr>
				<td>公开号</td>
				<td><input type="text" id="lg-form" name="openNo"
					value="${requestScope.r.openNo}">
			</tr>
			<tr>
				<td>公开日期</td>
				<td><input type="text" id="lg-form" name="openDate"
					value="${requestScope.r.openDate}">
			</tr>
			<tr>
				<td>授权号</td>
				<td><input type="text" id="lg-form" name="licenseNo"
					value="${requestScope.r.licenseNo}">
			</tr>
			<tr>
				<td>授权日期</td>
				<td><input type="text" id="lg-form" name="licenseDate"
					value="${requestScope.r.licenseDate}">
			</tr>
			<tr>
				<td>学校署名</td>
				<td><input type="text" id="lg-form" name="theSchoolName"
					value="${requestScope.r.theSchoolName}">
			</tr>
			<tr>
				<td>审核状态</td>
				<td><input type="text" id="lg-form" name="auditStatus"
					value="${requestScope.r.auditStatus}">
			</tr>
			<tr>
				<td>备注</td>
				<td><input type="text" id="lg-form" name="remark"
					value="${requestScope.r.remark}">
			</tr>
			<tr>
				<td>是否为职务专利</td>
				<td><input type="text" id="lg-form" name="isPositionPatent"
					value="${requestScope.r.isPositionPatent}">
			</tr>
		</table>
	</div>
</body>
</html>