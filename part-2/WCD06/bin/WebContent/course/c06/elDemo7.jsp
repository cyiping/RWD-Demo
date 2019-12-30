<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>EL Implicit Objects: Request Parameters</title>
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


	<h3>且:</h3>
	1. ${(5 gt 2) && (5 lt 7) }
	<br>	
	2. ${(5 gt 2) and (5 lt 7) }
	<br>
	<br>

	<h3>或:</h3>
	1. ${(5 gt 2) || (5 gt 7) }
	<br>	
	2. ${(5 gt 2) or (5 gt 7) }
	<br>
	<br>

	<h3>否:</h3>
	1. ${!(5 lt 2)}
	<br>	
	2. ${not(5 lt 2)}
	<br>
	<br>
	<br>

	<h3>測試陣列或List物件是否為空(empty):</h3>
	1. List: ${empty names}, ${names[0]}
	<br>
	2. List: ${empty jobs}
	<br>
	3. map: ${empty map}
	<br>
	4. array: ${empty ss}, ${ss[2]}
	<br>
	<br>


</body>
</html>
