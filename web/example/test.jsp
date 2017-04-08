<%-- 
    Document   : test
    Created on : 2017-3-7, 14:37:18
    Author     : vip
--%>

<%--<%@page import="com.orm.Task_execute"%>
<%@page import="com.orm.Task_configure"%>
<%@page import="com.orm.Task"%>
<%@page import="com.orm.Staff"%>--%>
<%@page import="com.orm.Manager"%>
<%--<%@page import="com.orm.Department"%>--%>
<%@page import="java.util.List"%>
<%--<%@page import="com.orm.Attendance"%>--%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
//        List<Attendance> listA = (List<Attendance>)session.getAttribute("listA");
//        List<Department> listD = (List<Department>)session.getAttribute("listD");
//        List<Manager> listM = (List<Manager>)session.getAttribute("listM");
//        List<Staff> listS = (List<Staff>)session.getAttribute("listS");
//        List<Task> listT = (List<Task>)session.getAttribute("listT");
//        List<Task_configure> listTC = (List<Task_configure>)session.getAttribute("listTC");
//        List<Task_execute> listTE = (List<Task_execute>)session.getAttribute("listTE");
    %>
    <%
//        if(listS.size()!=0){
//            Staff staff = listS.get(0);
//            Attendance attendance = listA.get(0);
//        }else{
//            Staff staff = new Staff();
//            Attendance attendance = new Attendance(123,"1991-11-11");
//        }
//        Department department = listD.get(0);
//        Manager manager = listM.get(0);
//        Staff staff = listS.get(0);
//        Task task = listT.get(0);
//        Task_configure task_configure = listTC.get(0);
//        Task_execute task_execute = listTE.get(0);
    %>
    <body>
        <h1>Hello World!</h1>
        <%
//            List<Post> list = (List<Post>)session.getAttribute("postlist");
            List<Manager> listM = (List<Manager>)session.getAttribute("listM");
            if(listM.size() == 0||listM == null){
                Manager manager = listM.get(0);
        %>
                <div><%=1%></div>
        <%
//                Attendance attendance = listA.get(0);
            }else{
        %>
            <div>ListIsNull</div>
        <%
    //            Attendance attendance = new Attendance(123,"1991-11-11");
            }
    //        Department department = listD.get(0);
    //        Manager manager = listM.get(0);
    //        Staff staff = listS.get(0);
    //        Task task = listT.get(0);
    //        Task_configure task_configure = listTC.get(0);
    //        Task_execute task_execute = listTE.get(0);
        %>
        <!--<div></div>-->
    </body>
</html>
