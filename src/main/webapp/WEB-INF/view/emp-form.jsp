<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>

<h1>Employee</h1>
<br>
<form:form action="/save-employee" modelAttribute="emp">
    <form:hidden path="id" />
    Name: <form:input path="name" /> <br>
    Surname: <form:input path="surname" /> <br>
    Department: <form:input path="department" /> <br>
    Salary: <form:input path="salary" /> <br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
