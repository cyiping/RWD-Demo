<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>JSP EL Example Home</title>
</head>
<body>
	
	<h1>cookie:</h1>
	1. ${cookie}
	<br>
	2. ${cookie["User.Cookie"].value}
	<br>
	<br>

	<h1>ServletContext Param:</h1>
	1. ${initParam}
	<br>
	2. ${initParam.ServletContextParam}
	<br>
	<br>

</body>
</html>