<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>

<%
	List<BoardVO> boardList = (List) session.getAttribute("boardList");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
						"html://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>�� ���</title>
</head>
<body>
<center>
<h1>�� ���</h1>
<h3>�׽�Ʈ�� ȯ���մϴ�...<a href="logout.do">Log-Out</a></h3>

<!-- �˻� ���� -->
<form action="getBoardList.jsp" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
<tr>
	<td align="right">
		<select name = "searchCondition">
			<option value="TITLE"> ����
			<option value="CONTENT"> ����
		</select>
		<input name="searchKeyword" type="text"/>
		<input type="submit" value="�˻�"/>
	</td>
</tr>
</table>
</form>
<!-- �˻� ���� -->

<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<th bgcolor="orange" width="100">��ȣ</th>
		<th bgcolor="orange" width="200">����</th>
		<th bgcolor="orange" width="150">�ۼ���</th>
		<th bgcolor="orange" width="150">�����</th>
		<th bgcolor="orange" width="100">��ȸ��</th>
	</tr>

<% for(BoardVO board : boardList ) { %>
	<tr>
		<th><%= board.getSeq() %></th>
		<th align="left"><a href="getBoard.do?seq=<%= board.getSeq()%>"><%= board.getTitle() %></a></th>
		<th><%= board.getWriter() %></th>
		<th><%= board.getRegDate() %></th>
		<th><%= board.getCnt() %></th>
	</tr>
<% } %>
</table>
<br>
<a href="insertBoard.jsp">���� ���</a>
</center>
</body>
</html>