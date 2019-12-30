<%@page contentType="text/html;charset=UTF-8"%>
<%!private static final String DEFAULT_NAME = "World";%>

<html>

<head>
<title>Hello JavaServer Page</title>
</head>

<%
	String name = request.getParameter("name");
	if ((name == null) || (name.length() == 0)) {
		name = DEFAULT_NAME;
	}
%>

<body bgcolor='white'>

	<b>Hello, <%=name%></b>

</body>

</html>