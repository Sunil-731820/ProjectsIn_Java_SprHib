<%@page import="com.java.lang.resol.ResolveDAO"%>
<%@page import="java.util.Date"%>
<%@page import="com.java.lang.resol.Resolve"%>
<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	String cdate = request.getParameter("ComplaintDate");
	java.util.Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse(cdate);
	Date cd = new Date(d1.getTime());

%>

<form method="get" action ="ResolveComplaint.jsp">
	<table border="10" align="center">
		<tr>
			<th>Resolve Solutions</th>
		</tr>
		
		<tr>
			<th>Complaint Id</th>
				<td>
					<input type="text" name="ComplaintId" value=<%=ComplaintId%>>
				</td>
		</tr>
	
		<tr>
			<th>ComplaintDate</th>
			<td>
				<input type="date" name="Complaintdate" value=<%=cd%>>
			</td>
		</tr>
		
		<tr>
			<th>ResolveDate</th>
			<td>
				<input type="date" name="rdate">
			</td>
		</tr>
		 <tr>
		 	<th>Resolve By</th>
		 	<td>
		 		<input type="text" name="resolveBy">
		 	</td>
		 </tr>
		 
		 <tr>
		 	<th>Comments</th>
		 	<td>
		 		<input type="text" name="comments">
		 	</td>
		 </tr>
		 
		 <tr>
		 	<th>
		 	<input type="submit" name="Resolved Issues">
		 	</th>
		 </tr>
	
	</table>
</form>


<%
	if(request.getParameter("ComplaintId")!=null &&
	request.getParameter("Complaintdate")!=null &&
	request.getParameter("rdate")!=null){
	Resolve resolve = new Resolve();
	resolve.setComplaintId(ComplaintId);
	resolve.setComplaintDate(cd);
	String rdate = request.getParameter("rdate");
	Date rd1 = new SimpleDateFormat("yyyy-MM-dd").parse(rdate);
	resolve.setResolveDate(request.getParameter("resolveDate"));
	resolve.setResolveBy(request.getParameter("resolveBy"));
	resolve.setComments(request.getParameter("comments"));
	ResolveDAO dao = new ResolveDAO();

		
	}

%>

</body>
</html>