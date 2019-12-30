<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta charset="utf-8">
	<title>AJAX Example</title>
	<script src="<c:url value='/js/jquery-3.3.1.min.js'/>"></script>
</head>
<body>


	<button id="btn-load">LOAD</button>
	<button id="btn-get">GET</button>
	<button id="btn-get-json">GET JSON</button>
	<button id="btn-post">POST</button>
	<button id="btn-ajax">AJAX</button>
	
	<br><hr>

	
	<img id="loading" style="display:none" src="<c:url value='/images/loading.gif'/>" width="5%"/>
	
	<div id="showArea"></div>

	<script type="text/javascript">

	
		$("#btn-load").click(function() {		
			$("#showArea").load(
				"<c:url value='/AjaxServlet4jQuery'/>", 
				{name : "Jim"},
				function(responseText, textStatus, jqXHR) {
					/*
					alert($(this).html());	// after ajax call
					alert(responseText);
					alert(textStatus);
			  		// jqXHR - XMLHttpRequest Object		  		
			  		alert(jqXHR.status + " / " + jqXHR.statusText + " / " + jqXHR.responseText);
			  		*/
				}
			);
		});
		
		$("#btn-get").click(function() {
			$.get(
				"<c:url value='/AjaxServlet4jQuery'/>", 
				{name : "Jim"}, 
				function(data) {
					$("#showArea").text(data.teacher + ", " + data.courses + ", " + data.price);
				}, 
				"json"
			);
		});
		
		$("#btn-get-json").click(function() {
			$.getJSON(
				"<c:url value='/AjaxServlet4jQuery'/>",
				{name : "Jim"}, 
				function(data) {
					$("#showArea").text(data.teacher + ", " + data.courses + ", " + data.price);
				}
			);	
		});
		
		$("#btn-post").click(function() {
			$.post(
				"<c:url value='/AjaxServlet4jQuery'/>", 
				{name : "Jim"}, 
				function(data) {
					$("#showArea").text(data.teacher + ", " + data.courses + ", " + data.price);
				}, 
				"json"
			);
		});
		
		$("#btn-ajax").click(function() {
			$.ajax({
				type: "POST",
				url: "<c:url value='/AjaxServlet4jQuery'/>",
				data: {name: "Jim"},
				dataType : "json",
				success: function(data) {
					$("#showArea").text(data.teacher + ", " + data.courses + ", " + data.price);
			  	},
				error: function(msg) {
					alert("error: " + msg);
			  	},
			  	complete: function(jqXHR) {
					alert("complete: " + jqXHR.status + " / " + jqXHR.statusText + " / " + jqXHR.responseText);
			  	}
			});
		});

		$(document).ready(function() {
			$(document).ajaxStart(function() {
				$("#loading").show();
			}).ajaxComplete(function() {
				$("#loading").hide();
			});
		});
	</script>
</body>
</html>