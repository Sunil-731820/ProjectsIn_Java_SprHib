<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>

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

	<form method="get" action="calc.jsp">
		<center>
			Enter the First number :
			<input type="number" name="firstNo"><br><br>
			Enter the Second number :
			<input type="number" name="secondNo"><br><br>
			<input type="submit" value="Calc">
		</center>
	</form>
	
	<%
		if(request.getParameter("firstNo")!=null
		&& request.getParameter("secondNo")!=null){
			int firstNo, secondNo, res;
			firstNo = Integer.parseInt(request.getParameter("firstNo"));
			secondNo = Integer.parseInt(request.getParameter("secondNo"));
			URL url = new URL("http://localhost:8080/RestExample2/webapi/cal/sum/"+firstNo+"/"+secondNo);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept","text/plain");
			
			if(conn.getResponseCode()!=200){
				throw new RuntimeException("HTTP code does not found***" + conn.getResponseCode());	
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String output;
			out.println("suM is ");
			while((output=br.readLine())!=null){
				out.println(output);
			}
			
			out.println("<br><br>");
			URL url1 = new URL("http://localhost:8080/RestExample2/webapi/cal/sub/"+firstNo+"/"+secondNo);
			HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
			conn1.setRequestMethod("GET");
			conn1.setRequestProperty("Accept","text/plain");
			
			if(conn1.getResponseCode()!=200){
				throw new RuntimeException("HTTP code does not found***" + conn1.getResponseCode());	
			}
			BufferedReader br1 = new BufferedReader(new InputStreamReader(conn1.getInputStream()));
			String output1;
			out.println("subTraction  is ");
			while((output1=br1.readLine())!=null){
				out.println(output1);
			}
		}
	%>
</body>
</html>