<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
     <form enctype="multipart/form-data" method="post" action="${pageContext.request.contextPath}/file">
         <c:if test="">

         </c:if>
         <input type="file" name="fileName">
         <hr>
         <input type="submit" value="submit"/>
     </form>
</body>
</html>
