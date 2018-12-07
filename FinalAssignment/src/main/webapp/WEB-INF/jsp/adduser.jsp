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
	height: 370px;
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
	<div class="center">
		<form action="useradded.html" method="post">
        <br>
        <label><b>USER ID:</b></label>
        <input type = "text" name = "userId" id = "userId">
        <br>
        <br><br>
        <label><b>PASSWORD:</b></label>
        <input type = "password" name = "password" id = "password">
        <br>
        <br><br>
        <label><b>DOJ:</b></label>
        <input type = "text" name = "doj" id = "doj">
        <br>
        <br><br>
        <label><b>Email Id:</b></label>
        <input type = "text" name = "email" id = "email">
        <br>
        <br><br>
        <label><b>Role:</b></label>
        <input type = "text" name = "role" id = "role">
        <br>
        <br><br>
        <label><b>Project Name:</b></label>
        <input type = "text" name = "projectName" id = "projectName">
        <br>
        <br>
       <input type = "submit" value="Submit">       
        </form>
	</div>
</body>
</html>