<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%int dan = Integer.parseInt(request.getParameter("dan"));
	int result;
	%>
	
	<h2>단 : <%=dan %></h2>
	
	<%for (int i = 1; i <= 9; i++) {
		result = dan * i;
	%>
		<%=dan %> * <%=i%> = <%=result%><br>
	<% 	
	}
	%>
</body>
</html>