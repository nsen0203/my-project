<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h1>This is help page</h1>
	<h2>Called by Help Controller</h2>

	<%
		/* String x = (String) request.getAttribute("name");
		Integer y = (Integer) request.getAttribute("roll"); */
	%>
	<h1>
		Name is
		<%-- <%=x%> --%>
		${name }
	</h1>

	<h1>
		Roll No. is
		<%-- <%=y%> --%>
		${roll }
	</h1>

	<%-- <%
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	
	<h1>Date and Time is <%=time %></h1> --%>

	<hr>

	<c:forEach var="x" items="${list }">
		<%-- <h1>${x }</h1> --%>
		
		<h1><c:out value="${x }"></c:out></h1>
		
	</c:forEach>

</body>
</html>