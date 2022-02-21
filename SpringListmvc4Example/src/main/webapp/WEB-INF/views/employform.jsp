<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" action="save">
	<table>
		<tr>
			<th>Employ Number</th>
				<td>
					<form:input path="empno"></form:input>
				</td>
		</tr>
		
		<tr>
			<th> Employ Name </th>
				<td>
					<form:input path="name"></form:input>
				</td>
		</tr>
		
		<tr>
			<th>Gender </th>
				<td>
					<form:select path="gender">
					<form:option value="MALE"></form:option>
					<form:option value="FEMALE"></form:option>
					</form:select>
				</td>
		</tr>
		
		<tr>
			<th>Department</th>
				<td>
					<form:input path="dept"/>
				</td>
		</tr>
		
		<tr>
			<th>Designation </th>
				<td>
					<form:input path="desig"/>
				</td>
		</tr>
		
		<tr>
			<th>Basic </th>
				<td>
					<form:input path="basic"/>
				</td>
		</tr>
	</table>
	<input type="submit" value="save">

</form:form>

</body>
</html>