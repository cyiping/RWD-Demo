<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>JSP EL Example Home</title>
</head>
<body>

	<h1>Test Map:</h1>
	1. ${myMap}
	<br>
	<br>
	2. ${myMap["emp3"].name}
	<br>
	<br>
	3. ${myMap.emp3.name}
	<br>
	<br>
	4. ${myMap[myStr].name}
	<br>
	<br>
	<br>	

	<h1>Test List:</h1>
	1. ${myList}
	<br>
	<br>
	2. ${myList["0"].name}
	<br>
	<br>
	3. ${myList[0].name}
	<br>
	<br>
	4. ${myList[myNum].name}
	<br>
<%--. ${myMap.0.name}--%>
	<br>
	<br>
	<br>


	<h1>Test Array:</h1>
	1. ${myArray}
	<br>
	<br>
	2. ${myArray["0"].name}
	<br>
	<br>
	3. ${myArray[0].name}
	<br>
	<br>
	

	<h1>Test Set:</h1>
	1. ${mySet}

<%--2. ${mySet[0].name} --%>

<%--3. ${myList["emp6"].name} --%>
	<br>
	<br>
	<br>
	
	
	<h1>Test NotFound:</h1>
	1. ${myListX}
	<br>
	<br>
	2. ${myList["5"].name}
	<br>
	<br>
	3. ${requestScope.empX.address.location}
	<br>
	<br>
	4. ${myMap.empX.name}
	<br>
	<br>
	5. ${myArray[1].name}
	<br>
	<br>
	6. ${myArray[X].name}
	<br>
	<br>
	
<%-- failed list: 

${myList["0"].nameX}

${myArray["X"].name}

--%>
	

</body>
</html>