<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>JSP EL Example Home</title>
</head>
<body>
	
	<%
		List<String> names = new ArrayList<String>();
		names.add("Jim1");
		names.add("Jim2");
	//	pageContext.setAttribute("names", names, PageContext.PAGE_SCOPE);
		pageContext.setAttribute("names", names);	//default is PAGE_SCOPE
		pageContext.setAttribute("str", "Hi,Jim", PageContext.REQUEST_SCOPE);		
	%>
	
	<h1>pageContext:</h1>
	1. ${pageContext.request.method}
	<br/>
	2. ${pageContext.request.contextPath}
	<br/>
	3. ${pageContext.out.bufferSize}
	<br/>
	<br/>

	<h1>pageScope:</h1>
	1. ${pageScope.names[0]}
	<br/>
	2. ${names[1]}
	<br/>
	<br/>
	
	<h1>requestScope:</h1>
	1. ${requestScope.emp1}
	<br/>
	<br/>

	<h1>sessionScope:</h1>
	1. ${sessionScope.emp2.address.location}
	<br/>
	2. ${sessionScope["emp2"].address["location"]}
	<br/>
	<br/>

	<h1>Test Map:</h1>
	1. ${myMap}
	<br/>
	2. ${myMap["emp3"].name}
	<br/>
	3. ${myMap.emp3.name}
	<br/>
	4. ${myMap[myStr].name}
	<br/>
	<br/>

	<h1>Test List:</h1>
	1. ${myList}
	<br/>
	2. ${myList["0"].name}
	<br/>
	3. ${myList[0].name}
	<br/>
	4. ${myList[myNum].name}
	<br/>
	
	<h1>Test NotFound:</h1>
	1. ${myListX}
	<br/>
	2. ${myList["5"].name}
	<br/>


</body>
</html>