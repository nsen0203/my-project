<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h2>Called by Home Controller</h2>

	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	/* List<String> friend = (List<String>) request.getAttribute("f");  */
	%>

	<h1>
		Name is<%=name%></h1>
	<h1>
		Id is<%=id%></h1>

	<%-- <%
		for (String s : friend) {
			out.println(s);
		}
	%> --%>

</body>
</html>