<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Map<String,String> map = new HashMap<>();
map.put("email", "test@a.com");

pageContext.setAttribute("m", map);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- test@a.com --%>
	m.email : ${m.email} <br>
	m.id : ${m.id} <br>
</body>
</html>