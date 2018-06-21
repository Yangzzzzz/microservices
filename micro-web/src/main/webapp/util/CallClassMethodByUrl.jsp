<%@ page import="java.lang.reflect.Method" %><%--
  Created by IntelliJ IDEA.
  User: yangzhi
  Date: 2018/5/24
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //根据请求url中的参数获取对应class并调用对应方法
    String className = request.getParameter("className");
    String methodName = request.getParameter("methodName");

    Class clazz = Class.forName(className);

    Method method = clazz.getDeclaredMethod(methodName);
    method.setAccessible(true);

    method.invoke(clazz.newInstance());

%>
