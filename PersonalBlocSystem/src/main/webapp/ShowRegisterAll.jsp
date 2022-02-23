<%@page import="com.java.hib.Register"%>
<%@page import="java.util.List"%>
<%@page import="com.java.hib.RegisterDAO"%>
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
			<th>First Name</th>
			<th>Last  Name</th>
			<th>Email Id</th>
			<th>Password</th>
		</tr>
		<%
			RegisterDAO dao = new RegisterDAO();
		List<Register> registerList = dao.showregister();
		for(Register register: registerList){
		%>
			
			<tr>
				<td><%=register.getFirstName()%></td>
				<td><%=register.getLastName()%></td>
				<td><%=register.getEmailId()%></td>
				<td><%=register.getPassword()%></td>				
			</tr>
		<%		
		}
		 %>
	</table>

</body>
</html>