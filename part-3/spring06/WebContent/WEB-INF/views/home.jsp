<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Bulletin</title>
    <link rel="stylesheet" 
          type="text/css" 
	href="<c:url value="/resources/style.css" />">
</head>
<body>
choose language:<br>
	<a href="<s:url value="/?lang=en" />">ENGLISH</a><br>
	<a href="<s:url value="/?lang=zh_TW" />">TRADITIONAL CHINESE</a><br>

	<h1>
		<s:message code="user.welcome" text="Welcome" />
	</h1>

	<s:url value="/user/register" var="registerUrl" />

	<a href="<s:url value="/placards" />">Messages</a> |
	<a href="${registerUrl}">Register</a>

</body>
</html>
