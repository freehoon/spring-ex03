<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: freehoon
  Date: 2021/08/12
  Time: 7:15 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    form page
    <form:form modelAttribute="searchVO">
        <form:input path="searchKey"/>
    </form:form>

    <form:form modelAttribute="boardVO">
        <form:input path="content"/>
    </form:form>

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
    $(document).ready(function(){
        alert("");
    });
</script>
</html>
