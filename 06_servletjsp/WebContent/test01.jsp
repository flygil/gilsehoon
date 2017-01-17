<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	String msg = (String)request.getAttribute("msg");
	String time = (String)request.getAttribute("time");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=msg %><br>
	<%=time %>><br>
</body>
</html>