<%@page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>EL Implicit Objects: Request Parameters</title>
</head>

<body>

	<h3>加法:</h3>
	${1 + 5}
	<br>
<%--${"Jim" + 2}--%>	
	<br>
	<br>

	<h3>減法:</h3>
	${1 - 5}
	<br>
	<br>

	<h3>乘法:</h3>
	${1 * 5}
	<br>
	<br>

	<h3>除法:</h3>
	${5 / 3}
	<br>
	${5 div 3}
	<br>
	<br>

	<h3>餘數:</h3>
	${5 % 2}
	<br>
	${5 mod 2}
	<br>
	<br>


</body>
</html>
