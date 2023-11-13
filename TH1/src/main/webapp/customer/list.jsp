<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: manht
  Date: 09/11/2023
  Time: 7:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customers</h1>

<p>
    <a href="customers?action=create">Create new customer</a>
</p>

<table border="1">
    <thead>
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${customers}" var="e">
        <tr>
            <td><a href="customers?action=view&id=${e.id}">${e.name}</a></td>
            <td>${e.email}</td>
            <td>${e.address}</td>
            <td><a href="customers?action=edit&id=${e.id}">edit</a></td>
            <td><a href="customers?action=delete&id=${e.id}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
