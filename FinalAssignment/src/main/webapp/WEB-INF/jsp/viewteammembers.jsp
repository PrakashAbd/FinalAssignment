<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
.center {
    background-color: blue;
	text-align: left;
	width: 500px;
	height: 350px;
	display: block;
	color: black;
	padding-left: 10px;
}
label{
    float: left;
    width: 100px;
}


</style>
</head>
<body>
<div class = "center">
        <form action="teammembersviewed.html" method="post">
		
        <br>
        <label><b>USER ID:</b></label>
        <input type = "text" name = "userId" id = "userId">
        <br>
        <br>
        <label><b>PASSWORD:</b></label>
        <input type = "password" name = "password" id = "password">
        <br>
        <br>
       <input type = "submit" value="Submit">
        Submit        
        </form>
      	</div>
</body>
</html>