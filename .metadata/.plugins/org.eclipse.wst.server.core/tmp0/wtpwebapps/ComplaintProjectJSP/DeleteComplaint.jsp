<%@page import="infinite11.ComplaintProjectJSP.ComplaintDAO"%>
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
	String ComplaintId = request.getParameter("ComplaintId");
	ComplaintDAO dao = new ComplaintDAO();
	dao.deleteComplaint(ComplaintId);

%>
</body>
</html>