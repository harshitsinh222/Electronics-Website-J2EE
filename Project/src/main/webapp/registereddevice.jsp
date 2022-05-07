<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registered Devices</h1>
	<p>
		<%
		String table = request.getAttribute("table").toString(); // Read the table value here
		%>
		<%=table%>
	</p>
</body>
</html>