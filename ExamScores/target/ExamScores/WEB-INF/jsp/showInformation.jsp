<%--
 显示信息，    用来将1老师或者0学生的信息全部显示   ,也可以搜素学号进行显示
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示信息</title>
    <style type=" text/css" >
        @import  url("<c:url value="/css/update_Delete.css"/>");
    </style>
</head>
<body>
<div class="header"></div>
<div class="daohang">
    <table border="0.8px" >
        <tr>
            <td width="120px"><a href="${pageContext.request.contextPath}/query_Information/0">学生信息查询</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/add_information/0">学生信息添加</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/update_delete/1">学生信息修改</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/query_Information/1">教师信息查询</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/add_information/1">教师信息添加</a></td>
            <td width="120px"><a href="${pageContext.request.contextPath}/update_delete/2">教师信息修改</a></td>
        </tr>
    </table>
</div>

<c:if test="${flag== 1}" >
<div class="middle">

    <table border="2px">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>密码</th>
        </tr>
        <c:forEach items="${teachers}" var="teacher">

            <tr >
                <td width="170px"><%--<c:out value="${teacher.id}"/> 两种方法都行--%>
                        ${teacher.id}
                </td>
                <td width="170px">
                    <c:out value="${teacher.name}"/>
                </td>
                <td width="160px">
                    <c:out value="${teacher.password}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</c:if>
<!--显示学生信息     -->
<c:if test="${flag== 20 }" >
<div class="middle">

    <table border="3px">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>密码</th>
            <th>班级</th>
            <th>班级编号</th>
        </tr>
        <c:forEach items="${students}" var="student">

            <tr >
                <td width="100px"><%--<c:out value="${teacher.id}"/> 两种方法都行--%>
                        ${student.id}
                </td>
                <td width="100px">
                    <c:out value="${student.name}"/>
                </td>
                <td width="100px">
                    <c:out value="${student.password}"/>
                </td>
                <td width="100px">
                    <c:out value="${student.className}"/>
                </td>
                <td width="100px">
                    <c:out value="${student.classId}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</c:if>
<%--从老师页面查询得时候输出的格式--%>
<c:if test="${flag== 0 }" >
<div class="middle">

    <table border="3px">
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>成绩</th>
            <th>班级</th>
            <th>状况</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr >
                <td width="100px"><%--<c:out value="${teacher.id}"/> 两种方法都行--%>
                        ${student.id}
                </td>
                <td width="100px">
                    <c:out value="${student.name}"/>
                </td>
                <td width="100px">
                    <c:out value="${student.score}"/>
                </td>
                <td width="100px">
                    <c:out value="${student.className}"/>
                </td>
                <td width="100px">
                    <c:out value="${student.classId}"/>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</c:if>
<div class="footer"></div>
</html>
