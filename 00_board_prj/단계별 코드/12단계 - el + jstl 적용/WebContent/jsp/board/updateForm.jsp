<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>네트워크 게시판</title>
</head>
<body>
	<h2>네트워크 게시판</h2>
		<hr>
		<form action='update' method='post'>
			<input type='hidden' name='no' value='<c:out value="${param.no}" />' />
			 제목 : <input type='text' name='title' value='<c:out value="${board.title}" />' /><br>
			 글쓴이 : <input type='text' name='writer' readonly value='<c:out value="${board.writer}" />'/><br>
			 내용 : <br>
			 <textarea name='content' rows='5' cols='70'><c:out value="${board.content}" /></textarea><br>
			 <input type='submit' value='수정'/>
		</form>
		<a href='list'>목록</a>
</body>
</html>




