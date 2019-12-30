<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>EL Logical</title>
</head>

<body>

	<%
		List<String> names = new ArrayList<String>();
		names.add("Jim1");
		names.add("Jim2");
		pageContext.setAttribute("names", names);	//default is PAGE_SCOPE
		
		List<String> jobs = new ArrayList<String>();
		pageContext.setAttribute("jobs", jobs, PageContext.PAGE_SCOPE);
		
		Map<String, Object> map = new HashMap<>();
		pageContext.setAttribute("map", map, PageContext.REQUEST_SCOPE);
		
		// array has default values
		int[] ss = new int[10];
		pageContext.setAttribute("ss", ss, PageContext.SESSION_SCOPE);
		
	%>


	<h2>且:</h2>
	<p>1. \${(5 gt 2) && (5 lt 7)} => ${(5 gt 2) && (5 lt 7)}</p>
	<p>2. \${(5 gt 2) and (5 lt 7)} => ${(5 gt 2) and (5 lt 7)}</p>

	<h2>或:</h2>
	<p>1. \${(5 gt 2) || (5 gt 7)} => ${(5 gt 2) || (5 gt 7)}</p>
	<p>2. \${(5 gt 2) or (5 gt 7)} => ${(5 gt 2) or (5 gt 7)}</p>

	<h2>否:</h2>
	<p>1. \${!(5 lt 2)} => ${!(5 lt 2)}</p>
	<p>2. \${not(5 lt 2)} => ${not(5 lt 2)}</p>

	<h2>測試陣列或List物件是否為空(empty):</h2>
	<p>1. List: \${empty names} => ${empty names}</p>
	<p>1.1. \${names[0]} => ${names[0]}</p>
	<p>2. List: \${empty jobs} => ${empty jobs}</p>
	<p>3. Map: \${empty map} => ${empty map}</p>
	<p>4. Array: \${empty ss} => ${empty ss}</p>
	<p>4.1. \${ss[2]} => ${ss[2]}</p>

</body>
</html>
