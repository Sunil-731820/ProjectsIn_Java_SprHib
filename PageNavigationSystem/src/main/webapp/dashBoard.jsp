<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>

body 
{
  font-family: "Lato", sans-serif;
}

.sidenav {
  width: 130px;
  position: fixed;
  z-index: 1;
  top: 20px;
  left: 10px;
  background: #eee;
  overflow-x: hidden;
  padding: 8px 0;
}

.sidenav a {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 25px;
  color: #2196F3;
  display: block;
}

.sidenav a:hover {
  color: #064579;
}

.main {
  margin-left: 140px; /* Same width as the sidebar + left position in px */
  font-size: 28px; /* Increased text to enable scrolling */
  padding: 0px 10px;
}



.sidebar{
	width:750px;
	height:30px;
	border:1px solid;
}

</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Welcome to My DashBoard</h1>
	<img alt="images" src="gui1.gif">
</center>
<header>
	<div class="sidebar">
  <a class="active" href="ShowAllEmployee2.xhtml">ShowEmploy</a>&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="#news">News</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="#contact">Contact</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="about.jsp">About</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</div>
</header>
	
</body>
</html>

