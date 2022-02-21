<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.java.lang.resol.Complaint"%>
<%@page import="com.java.lang.resol.ComplaintDAO"%>
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
	ComplaintDAO dao = new ComplaintDAO();
	Complaint[] arrComplaint = dao.showComplaint();

%>
<table border="10" align="center">
	<tr>
		<th>Complaint Id</th>
		<th>Complaint Type</th>
		<th>Complaint Description</th>
		<th>Complaint Date</th>
		<th>Severity </th>
		<th>Status</th>
	</tr>
	<%
		for(Complaint complaint : arrComplaint){
	%>
		<tr style="background-color: "red">
			<td><%=complaint.getComplaintId() %></td>
			<td><%=complaint.getComplaintType() %></td>
			<td><%=complaint.getCDsecription()%></td>
			<td><%=complaint.getComplaintDate() %></td>
			<td><%=complaint.getSeverity() %></td>
			<td><%=complaint.getStatus() %></td>
			
			<td><a href=Resolve.jsp?ComplaintId=<%=complaint.getComplaintId() %> > Resolve</a> </td>
		
		
		</tr>
	
	<%
	}
	%>
	



</table>
</body>
</html>