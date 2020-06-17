<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%-- 这里要用下面这个头，因为访问控制器要用到EL表达式--%>
<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>测试使用post方式传递参数</h1>

    <form action="${pageContext.request.contextPath}/param/test" method="post">
        用户名: <input type="text" name="name">
        性别: <input type="text" name="sex">
        年龄: <input type="text" name="age">
        生日: <input type="text" name="bir">
        <input type="submit" value="提交">
    </form>

    <br>

    <form action="${pageContext.request.contextPath}/student/findAll" method="post">
        <input type="submit" value="提交">
    </form>


</body>
</html>
