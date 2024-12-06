<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SuccessPage</title>
</head>
<body>

<%-- <h1>Welcome ${userName }</h1>
<h1>Your email is ${email }</h1>
<h1>Your password is ${password }</h1> --%>

<h1>${Header }</h1>
<h5>${Description }</h5>
<h1 style="colour: green">${msg }</h1>
<hr>

<h1>Welcome ${user.userName }</h1>
<h1>Your email is ${user.email }</h1>
<h1>Your password is ${user.password }</h1>

</body>
</html>