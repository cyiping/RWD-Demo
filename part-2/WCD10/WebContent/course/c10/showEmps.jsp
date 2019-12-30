<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Show Employees</title>
</head>
<body>
<html>
<body>
	<h2>Employee Details ${subject}</h2>
	<table border="1" cellspacing="2" cellpadding="2">
		<tr>
			<th>Seq.</th>
			<th>Employee ID</th>
			<th>Employee LastName</th>
		</tr>
		<c:forEach items="${emps}" var="e" varStatus="counter">
			<tr>
				<td>${counter.count}</td>
				<td>${e.id}</td>
				<td>${e.lastName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
<br />
</html>


</body>