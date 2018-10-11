<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
    <h4>Sucess Page</h4>
    <p>目标方法的返回值是 ModelAndView 类型 begin</p>
    time: ${requestScope.time }
    <p>目标方法的返回值是 ModelAndView 类型 end</p>

    names: ${requestScope.names }
    <br><br>

    <!--目标方法把返回值放到session会话  begin  -->
    request user: ${requestScope.user }
    <br>
    session user: ${sessionScope.user }
    <br>
    request school: ${requestScope.school }
    <br>
    session school: ${sessionScope.school }
    <br>
    <!-- 目标方法把返回值放到session会话  end -->
    <!--国际化 begin  -->
    <p><b>国际化 begin</b></p>
    <fmt:message key="i18n.username"></fmt:message>
    <br>
    <fmt:message key="i18n.password"></fmt:message>
    <p><b>国际化 end</b></p>
    <!--国际化 end  -->
</body>
</html>
