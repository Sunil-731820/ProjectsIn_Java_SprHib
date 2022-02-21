<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="10" align="center">
		<tr>
			<th>Emp Number</th>
			<th>Emp Name </th>
			<th>Gender</th>
			<th>Department</th>
			<th>Designation</th>
			<th>basic </th>
		</tr>
		
		<c:forEach var="emp" items="${list}">
		<tr>
			<td>${emp.empno}</td>
			<td>${emp.name}</td>
			<td>${emp.gender}</td>
			<td>${emp.dept}</td>
			<td>${emp.desig}</td>
			<td>${emp.basic}</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	<hr>
	<a href="employform">Add EmploY Here </a>

</body>
</html>