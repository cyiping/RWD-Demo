
<%@ page import="java.util.*"%>
<%
	Enumeration<String> keys = session.getAttributeNames();
	System.out.println("-------------");
	while (keys.hasMoreElements()) {
		String key = keys.nextElement();
		System.out.println(session.getAttribute(key));
	}
%>



secure1.jsp
<br />
<hr />
<a href="${pageContext.request.contextPath}/">Back to home</a>