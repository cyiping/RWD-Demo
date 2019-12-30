<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Accessing Request Parameters</title>
</head>
<body>

	<h1>header:</h1>
	1. ${header["cookie"]}
	<br>
	<br>

	<h1>headerValues:</h1>
	1. ${headerValues["cookie"]}
	<br>
	2. ${headerValues["cookie"][0]}
	<br>
	3. ${headerValues["cookie"][1]}
	<br>
	<br>

	<h1>param:</h1>

	1. ${param}
	<br /> 
	2. ${param.name}
	<br /> 
	3. ${param.languages}
	<br />
	<br />

	<h1>paramValues:</h1>

	1. ${paramValues}
	<br />
	2. ${paramValues.name}
	<br />
	3. ${paramValues.name["0"]}
	<br />
	4. ${paramValues.languages}
	<br />
	5. ${paramValues.languages[0]}
	<br />
	6. ${paramValues.languages["1"]}
	<br />	
	<br />

</body>
</html>
