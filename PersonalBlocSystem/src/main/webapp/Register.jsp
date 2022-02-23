<%@page import="com.java.hib.RegisterDAO"%>
<%@page import="com.java.hib.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="40" align="center">
<form method="get" action="Register.jsp">
<center>
	<div>
		<h1>Register</h1>
	</div>
	<div>
	Enter First Name:
	<input type="text" name="firstName">&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
	</div>	
	<div>
	Enter Last Name:
	<input type="text name="lastName">&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
	</div>
	<div>
	Enter Email Id:
	<input type="text" name="emailId">&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
	</div>	
	<div>
	Enter passWord:
	<input type="password" name="password">&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
	</div><br><br>
	<input type="submit" value="Register">&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
	</div>
</center>
</form>
</table>

<%
		if(request.getParameter("firstName")!=null && request.getParameter("emailId")!=null){
			Register register = new Register();
			register.setFirstName(request.getParameter("firstName"));
			register.setLastName(request.getParameter("lastName"));
			register.setEmailId(request.getParameter("emailId"));
			register.setPassword(request.getParameter("password"));
			RegisterDAO dao = new RegisterDAO();
			out.println(dao.addRegister(register));
		}

%>
</body>
</html>