<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<% 
		String msg = session.getAttribute("msg").toString();
	%>
</head>
<body>
	<div>
		<% out.print("<p>EL mensaje era: " + msg + "</p>"); %>
	</div>
	<div>
		<p>El mensaje era: <%= msg %></p>
	</div>
	<div>
		<p id="test"></p>
	</div>
</body>
<script type="text/javascript">
	var eje = document.getElementById("test");
	eje.innerHTML = 'EL mensaje era: <%= msg %>';
</script>
</html>