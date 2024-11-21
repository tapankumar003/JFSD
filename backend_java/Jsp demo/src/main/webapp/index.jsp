<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello from Html</h2>
	<%="<h1>Hello from jsp</h1>"%>
	<%
	int x = 5;
	%>
	<input type="text" value="<%=x%>">
	<br>
	<%
	for (int i = 0; i < 6; i++) {
		out.println("i=" + i + "<br>");
	}
	%>
	<form>
		<input type="text" name="fname"> <input type="submit"
			name="click" value="click me">
	</form>

	<%
	if (request.getParameter("click") != null) {
		out.print("Hello " + request.getParameter("fname"));
	}
	%>
	<%@include file="footer.html"%>


</body>
</html>