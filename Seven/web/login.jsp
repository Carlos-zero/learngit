<%--
  Created by IntelliJ IDEA.
  User: 94801
  Date: 2018/12/13
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login</title>
</head>
<body>
    <form action="/Servlet/LoginServlet/" method="post">
        <table align="center" border="0" width="500">
            <tr>
                <td align="right" width="30%">用户名：</td>
                <td><input type="text" name="username" class="box"></td>
            </tr>
            <tr>
                <td align="right" width="30%">密  码：</td>
                <td><input type="text" name="password" class="box"></td>
            </tr>
            <tr>
                <td colspan="2" align="center" height="40">
                    <a href="register.jsp">注册新用户</a>
                    <input type="submit" value="确认登录">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
