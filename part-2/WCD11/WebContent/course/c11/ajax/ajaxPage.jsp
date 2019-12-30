<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<title>Ajax Demo Page</title>
</head>
<body>

	<h1>
		This is an ajax demo at
		<script type="text/javascript">
			document.write(new Date(new Date().getTime()).toLocaleString());
		</script>
	</h1>

	<div id="showArea"></div>

	<script type="text/javascript">
		showAreaTag = document.getElementById("showArea");

		function doUpdate() {
			//alert("hi");
			var req;
			if (window.XMLHttpRequest) {
				req = new XMLHttpRequest();
			} else if (window.ActiveXObject) {
				req = new ActiveXObject("Microsoft.XMLHTTP");
			} else {
				alert("AJAX not supported");
			}
			req.onreadystatechange = function() {
				if (req.readyState == 4 && req.status == 200) {
					//alert(req.responseText);
					showAreaTag.innerHTML = req.responseText;
					//alert(showAreaTag.innerHTML);
				}
			}
			req.open("GET", "<c:url value='/AjaxServlet'/>",
					true);
			req.send(null);
		}

		window.onload = function() {
			timeoutId = setInterval(function() {
				doUpdate()
			}, 1000);
		}
	</script>
</body>
</html>