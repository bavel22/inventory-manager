<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>

<body>



<form  action= "/login" method="post">
<p><font color="red"> ${errorMessage}</font><p>

Enter your name: <input type= "text" name="name"/>
Enter you password: <input type= "password" name="password"/>
 <input type= "submit" value="login"/>
</form>



</body>
</html>