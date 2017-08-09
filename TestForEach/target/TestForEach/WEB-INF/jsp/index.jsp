<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<body>
<h2>Hello World!</h2>
<div >
    <table border="2" bgcolor="aqua" width="500px" >
        <c:forEach items="${list}" var="student">
        <tr >
            <td height="50px">${student.id}</td>
            <td height="50px">${student.name}</td>
        </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
