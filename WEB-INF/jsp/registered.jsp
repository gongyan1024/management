<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta charset="UTF-8">
        <title>用户注册</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css" />
    <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"4758",secure:"10666"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>

    <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-5" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/registered.jsp">
        <div class="rg-container" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-5" data-genuitec-path="/management/WebRoot/WEB-INF/jsp/registered.jsp">
            <h1>用户登录</h1>
	        <form action="saveUser" method="post" id="rg-form">
	            <table width="60%" border="1">
	                <tr>
	                    <td>用户名</td>
	                    <td>
	                        <input type="text" id="lg-form" name="username" value="">${requestScope.errors.username}
	                    </td>
	                </tr>
	                <tr>
	                    <td>密码</td>
	                    <td>
	                        <input type="password" name="password" value="">${requestScope.errors.password}
	                    </td>
	                </tr>
	                <tr>
	                    <td>确认密码</td>
	                    <td>
	                        <input type="password" name="confirmPwd" value="">${requestScope.errors.confirmPwd}
	                    </td>
	                </tr>
	                <tr>
	                    <td>邮箱</td>
	                    <td>
	                        <input type="text" name="email" value="">${requestScope.errors.email}
	                    </td>
	                </tr>
	                <tr>
	                    <td>姓名</td>
	                    <td>
	                        <input type="text" name="name" value="${formbean.birthday}">${requestScope.errors.name}
	                    </td>
	                </tr>
	                <tr>
	                    <td>
	                        <input type="reset" value="清空">
	                    </td>
	                    <td>
	                        <input type="submit" value="注册" >
	                    </td>
	                </tr>
	            </table>
	        </form>
        </div>
    </body>
</html>