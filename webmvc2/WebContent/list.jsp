<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- say출력방법 1 ... 불편 -->
<%
String ss = (String)request.getAttribute("say");
out.print(ss + "만세");
%>
<br>

<!-- say출력방법 2 ... EL(Expression Language)-->
${requestScope.say}
<br>

<!-- say출력방법 3 ... request 생략가능 -->
${say} 
</body>
</html>