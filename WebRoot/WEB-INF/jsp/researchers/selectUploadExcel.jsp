<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>批量导出</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/jquery.multiselect2side.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/select.css" />
<style type="text/css">
.demo {
	width: 600px;
	margin: 40px auto;
	color: #424242;
	background: #fff
}
</style>
<script type="text/javascript"
    src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript"
    src="${pageContext.request.contextPath}/js/jquery.multiselect2side.js"></script>
<script type="text/javascript">
	$(function() {
		$("#liOption").multiselect2side({
			selectedPosition : 'right',
			moveOptions : false,
			labelsx : '待选区',
			labeldx : '已选区'
		});
	});
</script>
</head>

<body>
	<div id="header">
		<div id="logo">
			<h1>
				<a href="http://www.helloweba.com" title="返回helloweba首页">helloweba</a>
			</h1>
		</div>
	</div>

	<div id="main">
		<h2 class="top_title">
			<a href="http://www.helloweba.com/view-blog-50.html">操作多选列表框</a>
		</h2>
		<div class="demo">
			<form id="sel_form" action="posts.php" method="post">
				<div id="sel">
					<select name="liOption[]" id='liOption' multiple='multiple'
						size='8'>
						<option value="PHP">PHP</option>
						<option value="MYSQL">MYSQL</option>
						<option value="ASP.NET">ASP.NET</option>
						<option value="XHTML">XHTML</option>
						<option value="CSS">CSS</option>
						<option value="JQUERY">JQUERY</option>
					</select>
				</div>
				<input type="submit" class="btn" value="提 交" />
			</form>
		</div>
	</div>
</body>
</html>
