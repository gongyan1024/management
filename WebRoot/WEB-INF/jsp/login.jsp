<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/loginstyle.css" />
</head>
<body>
    <div class="lg-container">
        <h1>用户登录</h1>
            <form action="confirmLogin" id="lg-form" name="lg-form" method="post">
	            <div>
	                <label for="username">用户名: </label>
	                <input type="text" name="username" id="username" placeholder="username"/>
	            </div>
	            
	            <div>
	                <label for="password">密码: </label>
	                <input type="password" name="password" id="password" placeholder="password"/>
	            </div>
	            <div>
	               <a class="zc" href="registered">注册</a>
	            </div>
	            <div class="dl">               
	                <button type="submit" id="login" style="width: 131px; ">登录</button>
	            </div>
            </form>
        <div id="message"></div>
    </div>
</body>
</html>
