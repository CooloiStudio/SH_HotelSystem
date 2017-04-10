<%-- 
    Document   : login
    Created on : 2017-4-10, 22:45:14
    Author     : vip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>请登录酒店管理系统</title>
    </head>
    <body>
        <form action="login" method="post">
            <s:textfield name="staff_id" label="账号"/>
            <s:password name="password" label="密码"/>
            <div>
                <input type="submit" value="提交"/>
                <input type="reset" value="重置"/>
            </div>
        </form>
    </body>
</html>
