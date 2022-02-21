<%@page import="com.java.client.Agent"%>
<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
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
			<th>Agent Id </th>
			<th>Agent Name </th>
			<th>Agent City </th>
			<th>Gender</th>
			<th>MaritalStatus</th>
			<th>Premium</th>
		</tr>
		
		<%
		URL url = new URL("http://localhost:8080/AgentWebService/webapi/agentService/");
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
		
		ObjectMapper objectmapper = new ObjectMapper();
		Agent[] agentArray = objectmapper.readValue(res,Agent[].class);
		for(Agent agent : agentArray){
		%>
		
		<tr>
			<td><%=agent.getAgentId() %></td>
			<td><%=agent.getName() %></td>
			<td><%=agent.getCity() %></td>
			<td><%=agent.getGender() %></td>
			<td><%=agent.getMaritalStatus() %></td>
			<td><%=agent.getPremium() %></td>
		</tr>
	<% 
		}
		%>
		
		
		
	



</table>

</body>
</html>