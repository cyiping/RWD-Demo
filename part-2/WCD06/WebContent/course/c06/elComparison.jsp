<%@page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>EL Comparison</title>
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

	<h2>是否相等:</h2>
	<p>1. \${5 == 2} => ${5 == 2}</p>
	<p>2. \${5 eq 2} => ${5 eq 2}</p>
	<p>3. \${s1 == s2} => ${s1 == s2}</p>
	<p>4. \${s1 eq s2} => ${s1 eq s2}</p>
	<p>5. \${s1 == s3} => ${s1 == s3}</p>

	<h2>是否不相等:</h2>
	<p>1. \${5 != 2} => ${5 != 2}</p>
	<p>2. \${5 ne 2} => ${5 ne 2}</p>

	<h2>是否小於:</h2>
	<p>1. \${5 < 2} => ${5 < 2}</p>
	<p>2. \${5 lt 2} => ${5 lt 2}</p>

	<h2>是否大於:</h2>
	<p>1. \${5 > 2} => ${5 > 2}</p>
	<p>2. \${5 gt 2} => ${5 gt 2}</p>

	<h2>是否小於等於:</h2>
	<p>1. \${5 <= 2} => ${5 <= 2}</p>
	<p>2. \${5 le 2} => ${5 le 2}</p>

	<h2>是否大於等於:</h2>
	<p>1. \${5 >= 2} => ${5 >= 2}</p>
	<p>2. \${5 ge 2} => ${5 ge 2}</p>

</body>
</html>
