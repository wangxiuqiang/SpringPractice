<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wangxiuqiang
  Date: 17-11-15
  Time: 下午4:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>date数据的测试</title>
</head>
<body>
<c:if test="${error != null}">
    ${error}
    <br>
</c:if>
  <form method="post" action="${pageContext.request.contextPath}/success">
      <input type="test" name="date" />
      <input type="submit" name="submit" value="提交" />
  </form>
</body>
</html>
