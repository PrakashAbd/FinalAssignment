<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation Page</title>
<style>
.center {
    background-color: black;
	text-align: left;
	width: 300px;
	height: 400px;
	display: block;
	color: white;
	padding-left: 10px;
}
.center2 {
    background-color: black;
	text-align: left;
	width: 300px;
	height: 300px;
	display: block;
	color: white;
	padding-left: 10px;
}
label{
    float: left;
    width: 100px;
}
</style>
</head>
<body>
<form method = "post">
	<div class= "center">
		<h3>Hi!  ${message} !</h3>
		<br>
		<a href  = "adduser.html">
		1. Add User </a> <br><br>
		<a href  = "addproject.html">
		2. Add Projects </a> <br><br>
		<a href  = "viewproject.html">
		3. View all Projects </a><br> <br>
		<a href  = "viewuser.html">
		4. View all Users </a> <br><br>
		<a href  = "viewempid.html">
		5. View By Emp Id </a> <br><br>
	</div>
	<div class= "center2">
		<h3>Hi!  ${message} !</h3>
		<br>
		<a href  = "changepassword.html">
		1. Change Password</a> <br><br>
		<a href  = "viewproject.html">
		2. View all Projects </a> <br><br>
		<a href  = "viewteammemnbers.html">
		3. View Team Members </a> <br><br>
	</div>
	</form>
</body>
</html> 