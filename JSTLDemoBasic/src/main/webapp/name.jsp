<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Entered FisrtName is :
	<c:out value="${param.firstName}"></c:out><br><br>
	Entered lastName is :
	<c:out value="${param.lastName}"></c:out>
</body>
</html>