<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/WEB-INF/view/body/boardmenu.jsp"/>
	<form action="updateSuccess.do" name="join_form" method="get">

<select name="header"><!-- onchange �� select �� ���ð��� ����ɶ� ���� �߻��ϴ� �̺�Ʈ ó����. -->
		<option>${sessionScope.list.board_header}</option>
		<c:forEach items="${sessionScope.select}" var="name">
				<option>${name.CODEOPTION}</option>
		</c:forEach>
</select>
	
<input type="text" name="name" value="${sessionScope.list.board_name }"><br>

<textarea name="content" cols="100" rows="30">${sessionScope.list.board_content}</textarea>
<br>
<input type="password" name="password" value="${sessionScope.list.board_password}">
		
		<br><br>
		<input type="submit" value="����">
		<input type="reset" value="�ʱ�ȭ">
</form>

</body>
</html>