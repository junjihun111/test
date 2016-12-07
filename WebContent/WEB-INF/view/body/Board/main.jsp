<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>

<c:if test="${sessionScope.managerID !=null}">
	<c:if test="${sessionScope.managerPW != null}">	
		<form action="mainSuccess.do" name="join_form" method="GET">
			관리자 ID=<input type="text" name="managerid" id="managerid" value="ID">
			관리자 PW=<input type="text" name="managerpw" id="managerpw" value="PW">
			<br>
			<input type="submit" value="로그인">
			<input type="reset" value="초기화">
		</form>
 	</c:if>
</c:if> 
<script type="text/javascript">
	$(document).ready(function(){
		$("#managerid").on("click",function(){
			$(this).val("");
		})
		
		$("#managerpw").on("click",function(){
			$(this).val("");
		})
	});
</script>


<br>

<h2>메인화면</h2>



</body>
</html>

