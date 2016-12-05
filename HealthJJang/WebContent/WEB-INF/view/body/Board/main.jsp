<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

<c:if test="${sessionScope.managerID !=null}">
	<c:if test="${sessionScope.managerPW != null}">	
		<form action="mainSuccess.do" name="join_form" method="GET">
			관리자 ID=<input type="text" name="managerid" value="ID">
			관리자 PW=<input type="text" name="managerpw" value="PW">
			<br>
			<input type="submit" value="로그인">
			<input type="reset" value="초기화">
		</form>
 	</c:if>
</c:if> 

<br>

<h2>메인화면</h2>



</body>
</html>

