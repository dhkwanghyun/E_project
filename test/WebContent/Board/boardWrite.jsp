<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" action="boardWrite.board">
<table>
	<tr>
		<td>사진선택</td>
		<td><input type="file" name="filename1" size=40></td>
	</tr>
	<tr>
		<td>제목</td>
		<td><input name="title"></td>		
	</tr>
	<tr>
		<td>내용</td>
		<td><input name="content"></td>
	</tr>
	<tr>
		<td>태그</td>
		<td><input name="tags"></td>
	</tr>
</table>

<input type="submit" value="업로드"><br><br>
</form>

</body>
</html>