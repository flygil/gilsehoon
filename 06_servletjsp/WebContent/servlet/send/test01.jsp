<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String msg = (String)request.getAttribute("msg");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendRedirect 테스트</title>
</head>
<body>
	<%= msg %>
</body>
</html>