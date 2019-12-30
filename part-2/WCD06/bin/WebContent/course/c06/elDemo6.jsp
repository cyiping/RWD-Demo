<%@page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>EL Implicit Objects: Request Parameters</title>
</head>

<body>

<% 
	String s1 = "jim";
	pageContext.setAttribute("s1", s1);
	
	String s2 = new String("jim");
	pageContext.setAttribute("s2", s2);
	
	String s3 = "jim3";
	pageContext.setAttribute("s3", s3);
%>


	<h3>是否相等:</h3>
	1. ${5 == 2}
	<br>
	2. ${5 eq 2}
	<br>
	3. s1 == s2 : ${s1 == s2}
	<br>
	4. s1 eq s2: ${s1 eq s2}
	<br>
	5. s1 == s3: ${s1 == s3}
	<br>
	<br>

	<h3>是否不相等:</h3>
	1. ${5 != 2}
	<br>
	2. ${5 ne 2}
	<br>
	<br>

	<h3>是否小於:</h3>
	1. ${5 < 2}
	<br>
	2. ${5 lt 2}
	<br>

	<br>

	<h3>是否大於:</h3>
	1. ${5 > 2}
	<br>
	2. ${5 gt 2}
	<br>

	<br>

	<h3>是否小於等於:</h3>
	1. ${5 <= 2}
	<br>
	2. ${5 le 2}
	<br>

	<br>

	<h3>是否大於等於:</h3>
	1. ${5 >= 2}
	<br>
	2. ${5 ge 2}
	<br>

	<br>



</body>
</html>
