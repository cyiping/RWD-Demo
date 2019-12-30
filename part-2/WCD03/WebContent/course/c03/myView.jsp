<%@page isELIgnored="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>A View Built With A JSP</title>
</head>
<body>
	<h1>Name information:</h1>
	The name of the user is 【  ${model.name} 】. That name contains
	${model.nameLength} characters.
</body>
</html>