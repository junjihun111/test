<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<body>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>

<table border=1>

<tr>
<td>

		<form action="mainSuccess.do" name="join_form" method="GET">
			관리자 ID=<input type="text" name="managerId" id="managerId" value="ID"><br>
			<c:if test="${not empty requestScope.failMessage }">
				${requestScope.failMessage}<br>
			</c:if>
			<form:errors path="managerInfo.managerId"/>
			
			
			관리자 PW=<input type="text" name="managerPw" id="managerPw" value="PW"><br>
			<c:if test="${not empty requestScope.failMessagepw }">
				${requestScope.failMessagepw}
			</c:if>
			<form:errors path="managerInfo.managerPw"/>
			
			<br>
			<input type="submit" id="id" value="로그인">&nbsp;
			
			<input type="reset" value="초기화">
		</form>

</td>
</tr>
</table>
 
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




<br>

<h2>메인화면</h2>



</body>
</html>

