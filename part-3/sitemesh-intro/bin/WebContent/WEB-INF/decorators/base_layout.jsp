<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="dec"	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link rel="stylesheet" href="<c:url value='/styles/style.1.css'/>" />
<title><dec:title default="Web Page" /></title>
<dec:head />
</head>
<body>
	<div id="bodyWrapper">
	
		<div id="header">Sitemesh Demo</div>
	
		<div id="navigation">
			<table width="100%">
				<tr>
					<td>
						<a href="<c:url value='/index.jsp'/>">HOME</a>
						<a href="<c:url value='/about.jsp'/>">ABOUT</a>
					</td>
					<td style="float: right;">
						<a href="#"><%=request.getUserPrincipal().getName()%></a>
						<a href="<c:url value='/login/logout.jsp'/>">log out</a>
					</td>
				</tr>
			</table>
		</div>
		
		<div id="pageBody">
		
			<div id="sidebar">
				<ol>
					<li><a href="<c:url value='/HelloServlet'/>">Servlet</a></li>			
					<li><a href="<c:url value='/MyController?name='/><%=request.getUserPrincipal().getName()%>">MVC</a></li>
					<li><a href="<c:url value='/pages/node3/hello.jsp?name='/><%=request.getUserPrincipal().getName()%>">JSP</a></li>
				</ol>
			</div>
			
			<div id="content">
				<dec:body />
			</div>
			
		</div>
		
		<div id="footer">Copyright 2017 XXX - All Rights Reserved</div>
	</div>
</body>
</html>
