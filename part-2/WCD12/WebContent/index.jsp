<H1>Hi! this is <%=request.getContextPath()%>...</H1>

&nbsp;&nbsp;&nbsp;&nbsp;+ secure<br/>
<a href="${pageContext.request.contextPath}/secure/secure1.jsp" style="text-decoration:none;">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;+ secure1.jsp</a><br/>
<a href="${pageContext.request.contextPath}/secure/secure2.jsp" style="text-decoration:none;">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;+ secure2.jsp</a><br/>
&nbsp;&nbsp;&nbsp;&nbsp;+ mixed<br/>
<a href="${pageContext.request.contextPath}/mixed/notsecure1.jsp" style="text-decoration:none;">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;+ notsecure1.jsp</a><br/>
<a href="${pageContext.request.contextPath}/mixed/secure3.jsp" style="text-decoration:none;">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;+ secure3.jsp</a><br/>
<a href="${pageContext.request.contextPath}/mixed/userProfile.jsp" style="text-decoration:none;">&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;+ userProfile.jsp</a><br/>

<br/>
<br/>		

&nbsp;&nbsp;&nbsp;&nbsp;+ src<br/>		
&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/testRoleSales" style="text-decoration:none;">+ testRoleSales</a><br/>		
&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/testRoleAdmin" style="text-decoration:none;">+ testRoleAdmin</a><br/>
&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/testReferenceRole" style="text-decoration:none;">+ testReferenceRole</a> (if login with role 'admin', request.isUserInRole("myAdmin") will be true!)<br/>

		
		