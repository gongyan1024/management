<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta charset="UTF-8">
        <title>用户注册</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css" />
    </head>

    <body>
        <div class="rg-container">
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