<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="Login.jsp">
		<center>
			UserName :
			<input type="tex" name="userName"><br><br>
			PassWord :
			<input type="text" name="passWord"><br><br>
			<input type="submit" value="login">
		</center>
	</form>
	
	<%
	if(request.getParameter("userName")!=null &&
	request.getParameter("passWord")!=null){
		String userName , passWord ;
		userName = request.getParameter("userName");
		passWord = request.getParameter("pass");
	}
	
	%>
</body>
</html>