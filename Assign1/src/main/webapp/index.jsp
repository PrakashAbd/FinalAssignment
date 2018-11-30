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
	<div class = "center">
        <br>
        <label><b>USER ID:</b></label>
        <input type = "text" id = "userid">
        <br>
        <br>
        <label><b>PASSWORD:</b></label>
        <input type = "password" id = "password">
        <br>
        <br>
        <button type = "submit" onclick  = "validate()">
            Submit
        </button>
        <button type = "submit" onclick  = "clear()" >
            Clear
        </button>
    </div>
    <div id = "message" >
        
    </div>
</body>
<script>
    function validate()
    {
    	var jsonData = {};
		jsonData["userId"] = userid.value;
		jsonData["password"] = password.value;
		userid.value = "";
		password.value = "";
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/Assign1/validate.jsp",
			beforeSend : function(request) {
				request.setRequestHeader("Content-Type", "application/json");
				request.setRequestHeader("Accept", "application/json");
			},
			data : JSON.stringify(jsonData)
			
			

		});
    }
    function clear()
    {

    }
</script>
</html>