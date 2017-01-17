<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
<%
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
String sDate = sdf.format(new Date());
//문자열에서 날짜객체로 바꾸는거
Date dDate = sdf.parse("2001-10-13");
%>	
 --%>
 <fmt:parseDate var="date" value="1988-10-13" pattern="yyyy-MM-dd"></fmt:parseDate>
 날짜 변환정보 출력 : <c:out value="${date.year + 1900}"/>년
 <br>
 날짜정보에서 문자열 추출 :
 <fmt:formatDate value="${date}" pattern="yyyy-MM-dd"/>
</body>
</html>