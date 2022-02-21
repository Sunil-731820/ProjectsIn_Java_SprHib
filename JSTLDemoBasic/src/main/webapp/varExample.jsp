<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="x" value="12"></c:set>
	X value is :
	<c:out value="${x}"></c:out><br>
	<c:set var="name" value="haris Chandana"></c:set>
	Name is :  
	<c:out value="${name}"></c:out>

</body>
</html>