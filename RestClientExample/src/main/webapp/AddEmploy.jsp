<%@page import="com.java.client.Gender"%>
<%@page import="com.java.client.Employ"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.sun.jersey.api.client.ClientResponse"%>
<%@page import="com.sun.jersey.api.client.WebResource"%>
<%@page import="com.sun.jersey.api.client.Client"%>
<%@page import="javax.ws.rs.client.Invocation"%>
<%@page import="javax.ws.rs.client.Entity"%>
<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.Response"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
	
		<center>
			Employ Number:
			<input type="number" name="empno"><br><br>
			Employ Name :
			<input type="text" name="name"><br><br>
			Gender :
			<select>
				<option value="MALE">Male</option>
				<option value="FEMALE">Female</option>
			</select><br><br>
		Department :
		<input type="text" name="dept"><br><br>
		Designation :
		<input type="text" name="desig"><br><br>
		Premium :
		<input type="number" name="basic"><br><br>
		<input type="submit" value="add ">
		</center>
	</form>
	
	<%
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(request.getParameter("emono")));
		employ.setName(request.getParameter("name"));
		employ.setGender(Gender.valueOf(request.getParameter("gender")));
		employ.setDept(request.getParameter("dept"));
		employ.setDesig(request.getParameter("desig"));
		employ.setBasic(Integer.parseInt(request.getParameter("basic")));
		Client client = Client.create();
		WebResource webresource = client.
	
	
	
	
	%>
	
	
	
	
	
	

</body>
</html>