<% 
	//request.setAttribute("cust", new course.c07.CustomerBean());
%>

<jsp:useBean id="cust" scope="request" class="course.c07.CustomerBean">
	<%
		cust.setName(request.getParameter("name"));
		cust.setEmail(request.getParameter("email"));
		cust.setPhone(request.getParameter("phone"));
	%>
</jsp:useBean>

cust.name: ${cust.name}
<br />
<br />