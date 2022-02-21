<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="com.java.client.Agent"%>
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
	<form method="get" action="AgentSearch.jsp">
		<table>
		Enter The Agent Id:
		<input type="number" name="agentId"><br><br>
		
		<input type="submit" value="search ">
		</table>
	</form>
	<%
		if (request.getParameter("agentId")!=null) {
			int agentId = Integer.parseInt(request.getParameter("agentId"));
	%>
	
	<%
	 URL url = new URL("http://localhost:8080/AgentWebService/webapi/agentService/"+agentId);
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
    Agent agent = new ObjectMapper().readValue(res,Agent.class);
    out.println("Agent ID is :   "+ agent.getAgentId() + "<br/>");
    out.println("Agent Name is :   " + agent.getName()+ "<br/>");
    out.println("Agent city is :   " + agent.getCity()+ "<br/>");
    out.println("Gender is :   " + agent.getGender()+ "<br/>");
    out.println("marital Status is :   " + agent.getMaritalStatus()+ "<br/>");
    out.println("Premium is :   " + agent.getPremium()+ "<br/>");
		}
	%>

</body>
</html>