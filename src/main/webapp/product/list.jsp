<%--
  Created by IntelliJ IDEA.
  User: dangv
  Date: 9/29/2021
  Time: 9:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/product?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
    </tr>
    <c:forEach items='${requestScope["product"]}' var="products">
        <tr>
            <td><a href="/product?action=view&id=${products.getId()}">${products.getName()}</a></td>
            <td>${products.getPrice()}</td>
            <td>${products.getDescription()}</td>
            <td>${products.getProducer()}</td>
            <td><a href="/product?action=edit&id=${products.getId()}">edit</a></td>
            <td><a href="/product?action=delete&id=${products.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
