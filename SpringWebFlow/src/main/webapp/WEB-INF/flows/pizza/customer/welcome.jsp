<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 18-1-31
  Time: 下午3:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎</title>
</head>
<body>
     <form:form>
         <input name="phone" type="text" /><br>
         <input type="submit" value="submit" name="_eventId_phoneEntered">
     </form:form>
</body>
</html>
