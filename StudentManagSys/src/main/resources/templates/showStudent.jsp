<%@page import="com.java.spr.Student"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
	<th>Student Id</th>
	<th>Student First Name</th>
	<th>Student Last Name</th>
	<th>Email id</th>
	
</tr>

<%
		 URL url = new URL("http://localhost:8182/showStudent");
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Accept", "application/json");
	        if (conn.getResponseCode() != 200) {
	            throw new RuntimeException("Failed : HTTP error code : "
	                    + conn.getResponseCode());
	        }
	        BufferedReader br = new BufferedReader(new InputStreamReader(
	            (conn.getInputStream())));
	        String output;
	        String res="";
	        while ((output = br.readLine()) != null) {
	        	res+=output;
	            
	        }
	        ObjectMapper objectMapper = new ObjectMapper();
	        Student[] student = objectMapper.readValue(res, Student[].class);
	        for(Student s : student) {
  %>
  	<tr>
  		<td> <%=s.getId() %> </td>
  		<td><%=s.getFirstname() %></td>
  		<td><%=s.getLastname() %></td>
  		<td><%=s.getEmailid() %></td>
  	</tr>
  <%
	       	
	        }
	  %>
	  </table>

</body>
</html>