<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type = "text/javascript">   
      
            var img = null;   
            function init(){    
               img = document.getElementById('myimg');  
               img.style.position = 'relative';       
               img.style.left = '50px';     
            }       
            function moveRight(){    
               img.style.left = parseInt(  
               img.style.left) + 100 + 'px';    
            }    
            window.onload = init;    
     
      </script>   
<style>

#group{
display:flex;
width:100%;
}

.github{
width:20%;
border: 10px solid aqua;

}

.instagram{
width:20%;
border: 10px solid aqua;
}

.faceBook{
width:20%;
border: 10px solid aqua;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>More Details follow me</h1>
	<div  id="group">
	<div class="github" align="center">
		<img src="git.gif" alt="images" width="200" height="250">
		<a href="https://github.com/Sunil-731820" >Github</a>
	</div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<div class="instagram">
		<img alt="nothings" src="ins.gif" width="200" height="250">
		<a href="https://www.instagram.com/sunilkumargupta.gupta.796/">Instagram</a>
	</div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
	<div class="faceBook">
		<img alt="fb.gif1" src="fb.gif" width="200" height="250">&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="https://www.facebook.com/sunilkumargupta.gupta.796/">FaceBook</a>
	</div>
</div>

 <form>   
         <img id = "myimg" src = "git.gif" />   
         <center>  
            <p>Click the below button to move the image right</p>   
         <input type = "button" value = "Click Me" onclick = "moveRight();" />  
      </center>   
      </form>  
</body>
</html>