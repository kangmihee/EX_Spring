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
background-image : url('4.jpg');
background-position : centerl;
background-size: auto;
}
img { 
  width: 80%;
  height: auto;
}
.center {
  position: absolute;
  top: 70%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.im
</style>

<body>

<div class="center">
<a href="../list">
<img src="8.png" alt="Cinque Terre">
</a>
</div>

</body>
</html>


<!-- 순서 : index.jsp, list.jsp, web.xml, root-context에서 db를 찾음, servlet-contetect에서 스캔,
          listController에서 boardDao호출, BoardDao에서 매핑, DataMapper에서 메소드 찾아서 리턴,
          listControllerdptj 에서 다시 받음 , 다시 list.jsp로 데이터 키 받음  -->