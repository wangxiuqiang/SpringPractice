<%--
  Created by IntelliJ IDEA.
  User: wxq
  Date: 17-8-14
  Time: 上午11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Details</title>
</head>
<body>
<h4>The product has been saved.</h4>
<h5>Details:</h5>
ProductName:${product.name}
Description:${product.description}
Price:${product.price}
<ol>
<c:forEach items="${product.images}" var="image">
    <li> ${image.name}
        <image src="<c:url value="/WEB-INF/images/"/>${image.name}"/>
    </li>
</c:forEach>
</ol>
</body>
</html>
