<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
** 자료 입력 **<br>
<!-- <form action="sangpum" method="post"> -->
<form action="../sangpum" method="post">
품명 : <input type="text" name="sang"><br>
수량 : <input type="text" name="su"><br>
단가 : <input type="text" name="dan"><br>
<input type="submit" value="전송(post)">
</form>
</body>
</html>