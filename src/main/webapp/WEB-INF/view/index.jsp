<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<h1>All employees</h1>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="emp" items="${emps}">

        <c:url var="updateButton" value="/update-employee" >
            <c:param name="empId" value="${emp.id}" />
        </c:url>
        <c:url var="deleteButton" value="/delete-employee" >
            <c:param name="empId" value="${emp.id}" />
        </c:url>
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td><input type="button" value="Update" onclick="window.location.href='${updateButton}'"></td>
            <td><input type="button" value="Delete" onclick="window.location.href='${deleteButton}'"></td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add" onclick="window.location.href='/add-new-employee'" />
</body>
</html>