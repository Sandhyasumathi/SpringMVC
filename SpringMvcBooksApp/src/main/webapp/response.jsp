<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Greeting App</title>
</head>
<body bgcolor="Silver">
<h1 align="center">${responsemsg}</h1>
<h1 align="center"><c:forEach var="books" items="${booksName}">${books}</c:forEach></h1>

</body>
</html>