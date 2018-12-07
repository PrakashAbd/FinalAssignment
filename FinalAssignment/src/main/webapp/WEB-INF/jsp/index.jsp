<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
.center {
    background-color: blue;
	text-align: left;
	width: 300px;
	height: 150px;
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
    <h1>Login Page</h1>
    <form action="validate.html" method="post">
	<div class = "center">
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
        <button type = "submit" onclick  = "clear()" >
            Clear
        </button>
    </div>
    
    <div id = "message" >
        
    </div>
</body>
<script>
    
</script>
</html>