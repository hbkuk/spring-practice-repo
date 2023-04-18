<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
						"html://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
</head>
<body>
<center>
<h1>글 목록</h1>
<h3>테스트님 환영합니다...<a href="logout.do">Log-Out</a></h3>

<!-- 검색 시작 -->
<form action="getBoardList.jsp" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
<tr>
	<td align="right">
		<select name = "searchCondition">
			<option value="TITLE"> 제목
			<option value="CONTENT"> 내용
		</select>
		<input name="searchKeyword" type="text"/>
		<input type="submit" value="검색"/>
	</td>
</tr>
</table>
</form>
<!-- 검색 종료 -->

<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<th bgcolor="orange" width="100">번호</th>
		<th bgcolor="orange" width="200">제목</th>
		<th bgcolor="orange" width="150">작성자</th>
		<th bgcolor="orange" width="150">등록일</th>
		<th bgcolor="orange" width="100">조회수</th>
	</tr>

<c:forEach items="${boardList}" var="board">
<tr>
	<th>${board.seq }</th>
	<th align="left"><a href="getBoard.do?seq=${board.seq }">${board.title }</a></th>
	<th>${board.writer }</th>
	<th>${board.regDate }</th>
	<th>${board.cnt }</th>
</tr>
</c:forEach>
</table>
<br>
<a href="insertBoard.jsp">새글 등록</a>
</center>
</body>
</html>