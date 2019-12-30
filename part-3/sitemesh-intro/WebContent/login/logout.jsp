<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>logout</title>
</head>
<body>
	<h1>
		User '<%=request.getUserPrincipal().getName()%>' has been logged out.
	</h1>
	<%request.getSession().invalidate();%>
	<p>
		<a href="<c:url value='/'/>">Back to home</a>
	</p>
</body>
</html>