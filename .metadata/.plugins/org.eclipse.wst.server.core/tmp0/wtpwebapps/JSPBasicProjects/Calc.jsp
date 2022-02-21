<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Simple Calculation </title>
</head>
<body>
<form method="get" action="Calc.jsp">
<center>
	Enter the First Number :
	<input type="number" name="firstNumber"><br><br>
	Enter the Second Number :
	<input type="number" name="secondNumber"><br><br>
	<input type="submit" value="sum">
</center>
</form>
<%
if(request.getParameter("firstNumber")!=null && 
request.getParameter("secondNumber")!=null){
	int firstNumber ,secondNumber,res;
	firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
	secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
	res = firstNumber + secondNumber;
	out.println("the sum of two number is " + res);
}
out.println("<br>");
if(request.getParameter("firstNumber")!=null &&
request.getParameter("secondNumber")!=null){
	int firstNo ,secondNo,res1;
	firstNo = Integer.parseInt(request.getParameter("firstNumber"));
	secondNo = Integer.parseInt(request.getParameter("secondNumber"));
	res1 = firstNo - secondNo;
	out.println("the subtraction of the Two number is "+ res1);
}

%>

</body>
</html>