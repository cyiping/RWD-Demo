<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>

<html>
<head>
<title>JSTL XML Tags</title>
</head>
<body>
	<h3>Books Info:</h3>
	<c:import var="bookInfo" url="/course/c08/xmlSample.xml" />

	<x:parse xml="${bookInfo}" var="output" />

	<b>The title of the 1st book is</b>:
	<x:out select="$output/books/book[1]/name" />
	<br>

	<b>The price of the 2nd book</b>:
	<x:out select="$output/books/book[2]/price" />

</body>
</html>