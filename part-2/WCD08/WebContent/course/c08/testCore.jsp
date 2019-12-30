<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html;charset=UTF-8"%>

<html>
<head>
<title>JSTL Core Tags</title>
</head>

<%
	pageContext.setAttribute("jim1", "<strike>Jim1</strike>", PageContext.SESSION_SCOPE);
	pageContext.setAttribute("arr", new int[5], PageContext.SESSION_SCOPE);
	pageContext.setAttribute("x", 11, PageContext.SESSION_SCOPE);
%>

<h3>1. c:out</h3>
escapeXml(false):
<c:out value="${sessionScope.jim1}" escapeXml="false" />
<br />
escapeXml(true):
<c:out value="${sessionScope.jim1}" escapeXml="true" />
<br />
<c:out value="${sessionScope.jim0}" default="no value" />
<br />
<br />

<h3>2. c:set</h3>
<c:set value="this is jim" var="oneString" />
${oneString}
<br />
<br />

<h3>3. c:remove</h3>
Before removed: ${sessionScope.jim1}
<br />
<c:remove var="jim1" scope="session" />
After removed: ${sessionScope.jim1}
<br />
<br />

<h3>4. c:catch</h3>
<c:catch var="exception">
	<%
		int i = 5;
		int j = 0;
		int k = i / j;
	%>
</c:catch>
<c:out value="${exception}" />
<br />
<br />


<h3>5. c:if</h3>
<c:if test="${not empty arr}" var="visits">
	\${arr} is not empty
</c:if>
<br />
\${visits}: ${visits}
<br />
<br />


<h3>6. c:choose, c:when, c:otherwise</h3>
\${x} = ${x}
<br />
<c:choose>
	<c:when test="${x == 11}"> \${x == 11} is true </c:when>
	<c:when test="${x == 12}"> \${x == 12} is true </c:when>
	<c:when test="${x == 13}"> \${x == 13} is true </c:when>
	<c:otherwise> x != 11, 12, 13 </c:otherwise>
</c:choose>
<br />
<br />

<h3>7. c:forTokens</h3>
<c:forTokens items="aa,bb,cc,dd" delims="," var="aValue">
	${aValue}<br />
</c:forTokens>
<br />
<br />

<h3>8. c:import</h3>
<div>
	<c:import url="http://localhost:8080/WCD08/course/c08/importedPage.jsp"/>
</div>

<br />
<br />

<h3>9. c:url</h3>
<c:url value="/course/c04/addLeague.jsp" var="urlPage" />
<a href="${urlPage}">${urlPage}</a>
<br />
<br />

<h3>10. c:redirect</h3>
need to remove the comment:
<%-- 
<c:redirect url="https://www.google.com.tw/"/>
--%>
<br />
<br />

