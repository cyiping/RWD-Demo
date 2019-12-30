<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
<title>JSTL Functions Tags</title>
</head>

<%
	pageContext.setAttribute("s1", "this is JSTL functions tags test");
	pageContext.setAttribute("s2", " jim ");
%>

<c:if test="${fn:containsIgnoreCase(s1, 'jstl')}">
	<p>'jstl' found!</p>
</c:if>

<c:if test="${fn:contains(s1, 'test')}">
	<p>'test' found!</p>
</c:if>

<c:if test="${fn:startsWith(s1, 'this')}">
	<p>s1 starts with 'this'</p>
</c:if>

<p>length of s2(${s2}) is: ${fn:length(s2)}</p>

<c:set var="s3" value="${fn:trim(s2)}" />
<p>length of s3(${s3}) is: ${fn:length(s3)}</p>