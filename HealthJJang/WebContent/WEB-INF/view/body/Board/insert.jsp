<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/body/boardmenu.jsp"/>
<br>

<form action="insertSuccess.do" name="join_form" method="get">

<select name="header"><!-- onchange 는 select 의 선택값이 변경될때 마다 발생하는 이벤트 처리자. -->
		<option>말머리</option>
		<c:forEach items="${sessionScope.select}" var="name">
				<option>${name.CODEOPTION}</option>
		</c:forEach>
</select>
	
<input type="text" name="name" value="공지사항제목"><br>

<textarea name="content" cols="100" rows="30"></textarea>
<br>
<input type="password" name="password" value="비밀번호">
		
		<br><br>
		<input type="submit" value="등록">
		<input type="reset" value="초기화">
</form>

</body>
</html>