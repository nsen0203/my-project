<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>${student }</h1> --%>

<h1>Student name is ${student.name }</h1>
<h1>Student emailId is ${student.email }</h1>
<h1>Student DOB is ${student.dateOfBirth }</h1>
<h1>Student courses is ${student.courses }</h1>
<h1>Student gender is ${student.gender }</h1>
<h1>Student type is ${student.type }</h1>
<hr>
<h1>Address is ${student.address.street }</h1>
<h1>Address is ${student.address.city }</h1>
</body>
</html>