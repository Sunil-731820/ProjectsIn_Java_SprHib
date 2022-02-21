<%@page import="com.java.client.Employ"%>

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
<table border="10" align="center">
	<tr>
		<th>Employ Number</th>
		<th>Employ Name </th>
		<th>Gender</th>
		<th>Department</th>
		<th>Designation </th>
		<th>Basic</th>
	</tr>
	
	<%
	URL url = new URL("http://localhost:8080/EmployeeService/webapi/employService/");
	HttpURLConnection con =(HttpURLConnection) url.openConnection();
	con.setRequestMethod("GET");
	con.setRequestProperty("Accept", "application/json");
	
	if (con.getResponseCode() != 200) {
    	throw new RuntimeException("Failed : HTTP error code : "
            + con.getResponseCode());
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	String output;
	String res= "";
	while((output=br.readLine())!=null){
		res = res+output;
	}
	
	objectmapper objectmapper = new ObjectMapper();
	Employ[] employArray = objectmapper.readValue(res, Employ[].class);
	for(Employ employ : employArray){
		%>
		
		<tr>
			<td><%=employ.getEmpno() %></td>
			<td><%=employ.getName() %></td>
			<td><%=employ.getGender() %></td>
			<td><%=employ.getDept() %></td>
			<td><%=employ.getDesig() %></td>
			<td><%=employ.getBasic() %></td>	
		</tr>
   <%	
	}
	 %>
	
	

</table>

</body>
</html>