User: <%= request.getUserPrincipal() %><br/>
Is Sales? <%=request.isUserInRole("sales")%><br/>
Is Admin? <%=request.isUserInRole("admin")%><br/>
<br />
<hr />
<a href="${pageContext.request.contextPath}/">Back to home</a>

