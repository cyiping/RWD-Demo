<%@page contentType="text/html" isErrorPage="true"%>
<%@page import="java.io.PrintWriter"%>
<html>
<head>
<title>error show</title>
</head>
<body>
	<h1>Error Message:</h1><%=exception%>
	<h1>Error Stack:</h1>
	<%
		exception.printStackTrace(new PrintWriter(out));
	%>
</body>
</html>
