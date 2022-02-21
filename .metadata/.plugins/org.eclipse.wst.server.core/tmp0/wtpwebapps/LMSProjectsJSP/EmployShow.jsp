<%@page import="com.java.lms.Employee"%>
<%@page import="com.java.lms.EmployeeDAO"%>
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
	EmployeeDAO dao = new EmployeeDAO();
	Employee[] arrEmployee = dao.showEmploy();
%>
<table border="10" align="center">
	<tr>
		<th>Employee Id</th>
		<th>Employee Name </th>
		<th>Email Id </th>
		<th>Mobile </th>
		<th>Date of Joining </th>
		<th>Employee Dept</th>
		<th>Manager Id </th>
		<th>Leave Balance</th>
		<th>show Details</th>
	</tr>
	
	<%
	for(Employee employee : arrEmployee){
		%>
		<tr>
			<td><%=employee.getEmpId() %></td>
			<td><%=employee.getEmpName() %></td>
			<td><%=employee.getEmpEmail() %></td>
			<td><%=employee.getEmpMobile() %></td>
			<td><%=employee.getEmpDoj() %></td>
			<td><%=employee.getEmpDept() %></td>
			<td><%=employee.getMgrId() %></td>
			<td><%=employee.getLeaveAvail() %></td>
		<td><a href=ShowAllinfo.jsp?empno=<%=employee.getEmpId() %>&mgrid=<%=employee.getMgrId() %>>Show All Information</a></td>
		
		
		</tr>
	
	
	<% 	
	}
	%>
	


</table>

</body>
</html>