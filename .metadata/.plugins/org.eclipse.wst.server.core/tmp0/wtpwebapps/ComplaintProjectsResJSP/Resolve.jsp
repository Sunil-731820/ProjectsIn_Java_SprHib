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
	 String ComplaintId = request.getParameter("ComplaintId");
	 Complaint complaint = dao.searchComplaint(ComplaintId);
%>
<form method="get" action="ResolveComplaint.jsp">
	<table border="10" align="center">
	<tr>
		<tr>
			<th>ComplaintId</th>
			<td>
				<input type="text" name="ComplaintId" value=<%=complaint.getComplaintId() %>>
			</td>
		</tr>
		
		<tr>
			<th>ComplaintType</th>
			<td>
				<input type="text" name="ComplaintType" value=<%=complaint.getComplaintType() %>>
			</td>
		</tr>
		
		<tr>
			<th>ComplaintDescription </th>
			<td>
				<input type="text" name="ComplaintDescription" value=<%=complaint.getCDsecription() %>>
			</td>
		</tr>
		
		<tr>
			<th>ComplaintDate</th>
			<td>
				<input type="date" name="ComplaintDate" value=<%=complaint.getComplaintDate() %>>
			</td>
		</tr>
		
		<tr>
			<th>Severity </th>
			<td>
				<input type="text" name="Severity" value=<%=complaint.getSeverity() %>>
			</td>
		</tr>
		
		<tr>
			<th>Status</th>
			<td>
				<input type="text" name="Status" value=<%=complaint.getStatus() %>>
			</td>
		</tr>
	</tr>
		<tr>
			<th>
				<input type="submit" name="Resolve">
			</th>
		</tr>
	
	</table>
</form>

</body>
</html>