<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ page session="false"%>
<html>
<head>
<title>Bulletin</title>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
	<h1>Register</h1>
	<sf:form method="POST" commandName="user">
		<sf:errors path="*" element="div" cssClass="errors" />
		<br />
		
		<sf:label path="firstName" cssErrorClass="error">First Name</sf:label>:
		<sf:input path="firstName" cssErrorClass="error" />
		<br />

		<sf:label path="lastName" cssErrorClass="error">Last Name</sf:label>:
		<sf:input path="lastName" cssErrorClass="error" />
		<br />

		<sf:label path="email" cssErrorClass="error">Email</sf:label>:
		<sf:input path="email" cssErrorClass="error" />
		<br />

		<sf:label path="username" cssErrorClass="error">Username</sf:label>:
		<sf:input path="username" cssErrorClass="error" />
		<br />

		<sf:label path="password" cssErrorClass="error">Password</sf:label>:
		<sf:password path="password" cssErrorClass="error" />
		<br />

		<input type="submit" value="Register" />
	</sf:form>	
	
<%-- not show validation result:
	<sf:form method="POST" commandName="user">
		First Name: <sf:input path="firstName" />
		<br />
		Last Name: <sf:input path="lastName" />
		<br />
		Email: <sf:input path="email" />
		<br />
		Username: <sf:input path="username" />
		<br />
		Password: <sf:password path="password" />
		<br />
		<input type="submit" value="Register" />
	</sf:form>
--%>

<%--	1st style input validation:

	<sf:form method="POST" commandName="user">
		First Name: <sf:input path="firstName" />
		<sf:errors path="firstName"/><br/>
		Last Name: <sf:input path="lastName" />
		<sf:errors path="lastName"/><br/>
		Email: <sf:input path="email" />
		<sf:errors path="email"/><br/>
		Username: <sf:input path="username" />
		<sf:errors path="username"/><br/>
		Password: <sf:password path="password" />
		<sf:errors path="password"/><br/>
		<input type="submit" value="Register" />
	</sf:form>
		
 --%>
 
<%--	2nd style input validation:

	<sf:form method="POST" commandName="user">
		First Name: <sf:input path="firstName" />
		<sf:errors path="firstName" cssClass="error" /><br/>
		Last Name: <sf:input path="lastName" />
		<sf:errors path="lastName" cssClass="error" /><br/>
		Email: <sf:input path="email" />
		<sf:errors path="email" cssClass="error" /><br/>
		Username: <sf:input path="username" />
		<sf:errors path="username" cssClass="error" /><br/>
		Password: <sf:password path="password" />
		<sf:errors path="password" cssClass="error" /><br/>
		<input type="submit" value="Register" />
	</sf:form>
 --%> 
 
<%--	3rd style input validation:

	<sf:form method="POST" commandName="user">
		<sf:errors path="*" element="div" cssClass="errors" />
		First Name: <sf:input path="firstName" />
		<br />
		Last Name: <sf:input path="lastName" />
		<br />
		Email: <sf:input path="email" />
		<br />
		Username: <sf:input path="username" />
		<br />
		Password: <sf:password path="password" />
		<br />
		<input type="submit" value="Register" />
	</sf:form>
--%> 
 
<%--	4th style input validation:

	<sf:form method="POST" commandName="user">
		<sf:errors path="*" element="div" cssClass="errors" />
		<br />
		
		<sf:label path="firstName" cssErrorClass="error">First Name</sf:label>:
		<sf:input path="firstName" cssErrorClass="error" />
		<br />

		<sf:label path="lastName" cssErrorClass="error">Last Name</sf:label>:
		<sf:input path="lastName" cssErrorClass="error" />
		<br />

		<sf:label path="email" cssErrorClass="error">Email</sf:label>:
		<sf:input path="email" cssErrorClass="error" />
		<br />

		<sf:label path="username" cssErrorClass="error">Username</sf:label>:
		<sf:input path="username" cssErrorClass="error" />
		<br />

		<sf:label path="password" cssErrorClass="error">Password</sf:label>:
		<sf:password path="password" cssErrorClass="error" />
		<br />

		<input type="submit" value="Register" />
	</sf:form>	
 --%>

</body>
</html>
