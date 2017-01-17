<%@page import="java.util.Date"%>
<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	String msg = (String)request.getAttribute("msg");
	Date time = (Date)request.getAttribute("time");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward 테스트</title>
</head>
<body>
	<%=msg %><br>
	<%=time %><br>
</body>
</html>