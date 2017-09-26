<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/loginstyle.css" />
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4758",secure:"10666"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
<body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-2" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/login.jsp">
    <div class="lg-container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-2" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/login.jsp">
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
