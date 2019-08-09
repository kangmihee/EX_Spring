<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body{ 
background-image : url('resources/1.jpg');
background-position : centerl;
background-size: auto;
}

table {
  border-collapse: collapse;
  width: 80%;
  background-color:#f5f5f5;
  opacity: 0.7;
  position : absolute;
  left:50%;
  top:20%;
  transform:translate(-50%, 0%);
  
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

tr:hover {background-color:#f5f5f5;}

h1 {
  color: white;
  position : absolute;
  left:50%;
  transform:translate(-50%, 0%);
}
.text_insert{
  color: white;
  position : absolute;
  left:10%;
  top:15%;
  transform:translate(-0%, 0%);
}
</style>
<body>
<h1 >** 영화 라이온킹 리뷰  **</h1>
	<div class="center">
	<a href="insert" class="text_insert">글 쓰기</a>
		<table border="1">
			<tr>
				<th>번호</th>
				<th>글 제목</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
			<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<c:forEach var="b" items="${list}">
				<tr>
					<td>${b.num}</td>
					<td><a href="detail?num=${b.num}">${b.title}</a></td>
					<td>${b.author}</td>
					<td>${b.readcnt}</td>
				</tr>
			</c:forEach>
			<!-- 검색 -->
			<tr>
				<td colspan="4">
					<form action="search" method="post">
						<select name="searchName">
							<option value="author">작성자</option>
							<option value="title">제목</option>
						</select> 
							<input type="text" name="searchValue"> 
							<input type="submit" value="검색">
					</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>