<%@page import="com.java.jsp.StudentDAO"%>
<%@page import="com.java.jsp.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		StudentDAO dao = new StudentDAO();
		Student[] arrStudent = dao.showStudent11();
%>
	<table border="3" align="center">
	<tr>
		<th>Student First Name </th>
		<th>Student Last Name </th>
		<th>Student Age</th>
		<th>Student Location</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
<%
	for(Student student : arrStudent){
%>
	<tr>
		<td><%=student.getFirstName() %></td>
		<td><%=student.getLastName() %></td>
		<td><%=student.getAge()%></td>
		<td><%=student.getLocation() %></td>
		<td><a href=UpdateStudent.jsp?firstName=<%=student.getFirstName() %>>Update</a></td>
		<td><a href=DeleteStudent.jsp?firstName=<%=student.getFirstName()%>>Delete</a></td>
	
	
	</tr>
<% 
} 
%>
	</table>
	<br><br>
	<hr>
	<a href="AddStudent.jsp"> Add Student </a>
</body>
</html>