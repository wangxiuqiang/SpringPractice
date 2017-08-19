<%@ page import="com.domain.admin" %><%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-8-19
  Time: 上午10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>登录失败</title>
</head>
<body>
 <%!  String str; %>
  <%
      admin admin = (admin)request.getAttribute("admin");
     if (admin.getName() == ""){
          str = "用户名不能为空";
     }
     else if(admin.getPassword() == ""){
          str = "密码不能为空";
     }
     else if(admin.getPassword() == "" && admin.getName() == ""){
          str = "请输入用户名和密码";
     }
     else{
          str = "用户名和密码不匹配";
     }
  %>

<%=str%>
点击<a href="${pageContext.request.contextPath}/adminJoin_in">返回</a>登录页面
</body>
</html>
