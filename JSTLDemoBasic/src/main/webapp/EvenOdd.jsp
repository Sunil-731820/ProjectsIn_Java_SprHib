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
<form method="get" action="EvenOdd.jsp">
	<center>
	Enter A Number:
	<input type="number" name="No"><br>
	<input type="submit" value="Check"><br>
	</center>
</form>

<c:if test="${param.No!=null}">
	<c:set var = "No"></c:set>
	

</c:if>

</body>
</html>