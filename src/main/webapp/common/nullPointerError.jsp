<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
						"html://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>기본 에러 화면</title>
</head>
<body bgcolor="#ffffff" text="#000000">
<h1>로그인</h1>
<table width="100%" border="1" cellpadding="0" cellspacing="0">
	<tr><td align="center" bgcolor="orange"><b>기본 에러 화면입니다.</b></td></tr>
</table>
<br>
<table width="100%" border="1" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td align="center">
		<br><br><br><br><br><br>
		Message: ${exception.message}
		<br><br><br><br><br><br>
		</td>
	</tr>
</table>
</body>
</html>