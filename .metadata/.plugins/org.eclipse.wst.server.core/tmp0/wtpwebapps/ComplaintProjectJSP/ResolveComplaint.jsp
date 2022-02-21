<%@page import="java.sql.Date"%>
<%@page import="infinite11.ComplaintProjectJSP.Complaint"%>
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
	ComplaintDAO dao = new ComplaintDAO();
	String ComplaintId = request.getParameter("ComplaintId");
	Complaint complaint = dao.searchComplaint(ComplaintId);

%>
<form method="get()" action="ResolveComplaint.jsp">
	<center>
		Complaint Id :
		<input type="text" name="ComplaintId"><br><br>
		ComplaintType :
		<input type="text" name="ComplaintType"><br><br>
		Complaint description :
		<input type="text" name="CDescription"><br><br>
		Complaint Date :
		<input type="date" name="ComplaintDate"><br><br>
		Severity :
		<input type="text" name="Severity"><br><br>
		Status :
		<input type="text" name="Status"><br><br>
		<input type="submit" value="Add Complaint">
	
	</center>
</form>
<%
	if(request.getParameter("ComplaintId")!=null){
		Complaint complaintUpdate = new Complaint();
		complaintUpdate.setComplaintId(request.getParameter("ComplaintId"));
		complaintUpdate.setComplaintType(request.getParameter("ComplaintType"));
		complaintUpdate.setCDescription(request.getParameter("CDescription"));
		complaintUpdate.setComplaintDate(Date.valueOf(request.getParameter("ComplaintDate")));
		complaintUpdate.setSeverity(request.getParameter("Severity"));
		complaintUpdate.setStatus(request.getParameter("Status"));
		dao.resolveComplaint(complaint);
		
	}

%>
</body>
</html>