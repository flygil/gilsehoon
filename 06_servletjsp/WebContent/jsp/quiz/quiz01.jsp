<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Date d = new Date();
	String toDay =  new SimpleDateFormat("yyyy-MM-dd").format(d);
	String getTime = new SimpleDateFormat("HH:mm:ss").format(d);
	%>
	오늘은 <%=toDay%> 입니다. <br>
	현재시간은 <%=getTime%> 입니다. <br>
</body>
</html>