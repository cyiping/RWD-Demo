<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	isErrorPage="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}

div {
	position: relative;
	height: 100%;
	width: 100%;
}

div img {
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	margin: auto;
}
</style>
</head>
<body>
	<div>
		<%
			if (response.getStatus() == 403) {
				request.getSession().invalidate();
		%>
		<img src="<c:url value='/images/Error403.png'/>" />
		<%
			} else if (response.getStatus() == 500) {
		%>
		<font color="red">Error: <%=exception.getMessage()%></font>
		<%
			} else {
		%>
		<font color="red">Error Code : <%=response.getStatus()%></font>
		<%
			}
		%>
		<a href="<c:url value='/'/>">Back to home</a>
	</div>
</body>

</html>



