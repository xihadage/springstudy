<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="helloworld">Hello World</a>

  <br/>
  <a href="requestMappingTest/testRequestMapping">@RequestMapping修饰类和方法</a>

  <br/>
  <form action="requestMappingTest/testMethod" method="POST">
    <input type="submit" value="测试@RequestMappin的post请求方式">
  </form>

  <br/>
  <a href="requestMappingTest/testParamsAndHeaders?username=lgs&age=11">testParamsAndHeaders</a>

  <br/>
  <a href="requestMappingTest/testAntPath/ggggggg/abc">testAntPath</a>

  <br/>
  <a href="pathVariableTest/testPathVariable/10">testPathVariable</a>

  <br/>
  <a href="requestParamTest/testRequestParam?username=lgs&age=11">testRequestParam</a>

  <!--Rest风格 begin  -->
  <br/>
  <a href="restTest/testRest/1">Test Rest Get</a>

  <br/>
  <form action="restTest/testRest" method="post">
    <input type="submit" value="TestRest POST"/>
  </form>

  <br/>
  <form action="restTest/testRest/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="TestRest DELETE"/>
  </form>

  <br/>
  <form action="restTest/testRest/1" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="TestRest PUT"/>
  </form>
  <!--Rest风格 end  -->

  <br/><br/>
  <p><b>使用 Serlvet 原生的 API 作为目标方法的参数 begin</b></p>
  <a href="servletAPITest/testServletAPI">testServletAPI</a>
  <p><b>使用 Serlvet 原生的 API 作为目标方法的参数</b></p>

  <!--POJO测试 begin  -->
  <br>
  <form action="pojoTest/testPojo" method="post">
    username: <input type="text" name="username"/>
    <br>
    password: <input type="password" name="password"/>
    <br>
    email: <input type="text" name="email"/>
    <br>
    age: <input type="text" name="age"/>
    <br>
    city: <input type="text" name="address.city"/>
    <br>
    province: <input type="text" name="address.province"/>
    <br>
    <input type="submit" value="Submit"/>
  </form>
  <!--POJO测试 end  -->

  <p>目标方法的返回值是 ModelAndView 类型 begin</p>
  <a href="handleModelDataTest/testModelAndView">Test ModelAndView</a>
  <p>目标方法的返回值是 ModelAndView 类型 end</p>

  <p>目标方法可以添加 Map类型  begin</p>
  <a href="handleModelDataTest/testMap">Test Map</a>
  <p>目标方法可以添加 Map类型 end</p>

  <p>@SessionAttributes目标方法把返回值放到session会话  begin</p>
  <a href="handleModelDataTest/testSessionAttributes">Test SessionAttributes</a>
  <p>@SessionAttributes目标方法把返回值放到session会话 end</p>


  </body>
</html>
