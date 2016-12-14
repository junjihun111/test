<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<style>
body{background-color: black}

.idcolor{
	color:white;
}

.pwcolor{
	color:white;
}

</style>
<body>

<script type="text/javascript">
	$(document).ready(function(){
		$("#managerId").on("click",function(){
			$(this).val("");
		});
		
		$("#managerPw").on("click",function(){
			$(this).val("");
		});
	});
</script>


<form action="mainSuccess.do" name="join_form" method="GET">
			<span class="idcolor">관리자 ID=</span><input type="text" name="managerId" id="managerId" value="ID"><br>
			
			<form:errors path="managerInfo.managerId"/>
			
			
			<span class="pwcolor">관리자 PW=</span><input type="text" name="managerPw" id="managerPw" value="PW"><br>
			
			<form:errors path="managerInfo.managerPw"/>
			
			<br>
			<input type="submit" id="id" value="로그인">&nbsp;
			
			<input type="reset" value="초기화">
			
			<c:if test="${not empty requestScope.failMessage }">
				<span class="idcolor">${requestScope.failMessage}<br></span>
			</c:if>
			<c:if test="${not empty requestScope.failMessagepw }">
				<span class="idcolor">${requestScope.failMessagepw}</span>
			</c:if>
</form>
	<div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
	</div>
</body>
</html>
