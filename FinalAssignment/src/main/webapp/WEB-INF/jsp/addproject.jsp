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
	<div class="center">
		<form action="projectadded.html" method="post">
        <br>
        <label><b>User Id:</b></label>
        <input type = "text" name = "projectId" id = "projectId">
        <br>
        <br>
        <br>
        <label><b>Project Name:</b></label>
        <input type = "text" name = "projectName" id = "projectName">
        <br>
        <br><br>
        <label><b>Project Description:</b></label>
        <input type = "text" name = "projectDesc" id = "projectDesc">
        <br>
        <br><br>
        <label><b>Estimated Hours:</b></label>
        <input type = "text" name = "hours" id = "hours">
        <br>
        <br><br>
       <input type = "submit" value="Submit">       
        </form>
	</div>
</body>
</html>