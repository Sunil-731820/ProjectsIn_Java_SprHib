<%@page import="java.util.Date"%>
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
	Date date = new Date();
%>
<b>
	<%=
	date.getHours()
	%>
</b>
<b>
	<%=
	date.getMinutes()
	%>
</b>
<b>
	<%=
	date.getSeconds()
	%>
</b>
out.println("<br>");
out.println("printing exact time ");
out.rpintln("<br>");
<b>
	<%= date.getHours() %> : <%=date.getMinutes() %> : <%= date.getSeconds() %>
</b>
</body>
</html>