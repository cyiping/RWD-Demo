<%@ page session="true"%>

User '<%=request.getRemoteUser()%>' has been logged out.

<%session.invalidate();%>
<br/>
<a href='<%=request.getContextPath()%>'>Back to home</a>
