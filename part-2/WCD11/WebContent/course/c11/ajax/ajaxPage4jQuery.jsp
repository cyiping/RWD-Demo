<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta charset="utf-8">
	<title>AJAX Example</title>
	<script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
</head>
<body>

	<h1>
		This is an ajax demo at
		<script>
			document.write(new Date(new Date().getTime()).toLocaleString());
		</script>
	</h1>

	<div id="showArea"></div>

	<script type="text/javascript">
		$(document).ready(function() {
			timeoutId = setInterval(function() {
				$.ajax({
					type : "GET",
					url : "<c:url value='/AjaxServlet'/>",
					cache : false,
					success : function(data) {
						$("#showArea").text(data);
					}
				});
			}, 1000);
		});
	</script>
</body>
</html>