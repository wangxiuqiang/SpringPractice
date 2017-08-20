<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="ctx" value="pageContext.request.contextPath"></c:set>
${dept.name}
${dept.id}
<hr/>
${ctx}
<br />
<c:out value="${dept.id}"/>
<table>
    <tr>
        <td>
            <a href="${ctx}/manager/1/1">添加</a>
        </td>
    </tr>
</table>

</body>
</html>
