<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="pageContext.request.contextPath"></c:set>
<html>
<head>
    <title>Title</title>
</head>
<body>

${dept.name}
${dept.id}

<table>
    <tr>
        <td>
            <a href="${pageContext.request.contextPath}/addStaff_in/${dept.id}">添加</a>
        </td>
    </tr>
</table>

</body>
</html>
