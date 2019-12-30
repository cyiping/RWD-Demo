<html>
<body>
	<table border='1'>
		<tr>
			<th>number</th>
			<th>squared</th>
		</tr>
		<%
			for (int i = 0; i < 10; i++) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=(i * i)%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>