<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="com.java.client.Student"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.HttpURLConnection"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SearchStudent.jsp" method="get">
	<center>
		Enter the Student Id here :
		<input type="number" name="Id"><br><br>
		<input type="submit" value="Search">
	</center>
</form>

<%
if (request.getParameter("Id")!=null) {
	int a = Integer.parseInt(request.getParameter("Id"));
	 URL url = new URL("http://localhost:8182/student/"+a);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(
            (conn.getInputStream())));
        String output;
        String res="";
        while ((output = br.readLine()) != null) {
        	res+=output;
        }
      Student student = new ObjectMapper().readValue(res, Student.class);
   		 out.println("Student Id  :" + student.getId()+ "<br/>");
   		 out.println("Student first Name : " + student.getFirstname()+ "<br/>");
   		 out.println("Student last Name :  " + student.getLastname()+ "<br/>");
   		 out.println("Student Email Id :  " + student.getEmailid()+ "<br/>");

}

%>

</body>
</html>