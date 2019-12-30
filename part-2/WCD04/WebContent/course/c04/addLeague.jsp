<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<title>Duke's Soccer League: Add a New League</title>
</head>

<body bgcolor='white'>

<!-- ${pageContext.request.contextPath}/AddLeague -->
<!-- <c:url value="/AddLeague"/> -->

	<form action='<c:url value="/AddLeague"/>' method='POST'>
		
		Year: <input type='text' name='year' /> <br /> <br /> 
		Season: 
		<select	name='season'>
			<option value='UNKNOWN'>select...</option>
			<option value='Spring'>Spring</option>
			<option value='Summer'>Summer</option>
			<option value='Fall'>Fall</option>
			<option value='Winter'>Winter</option>
		</select> <br /> <br /> 
		Title: <input type='text' name='title' /> <br /> <br />
		<input type='submit' value='Add League' />
	</form>

</body>
</html>