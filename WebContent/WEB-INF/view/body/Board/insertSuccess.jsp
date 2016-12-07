<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>
<body>
	<jsp:include page="/WEB-INF/view/body/boardmenu.jsp"/>
	<table border=1>
		<tr height=50>
			<td>
				${sessionScope.list.board_no} . [${sessionScope.list.board_header }] ${sessionScope.list.board_name } 작성자 : ${sessionScope.list.board_writer }
			</td>
		</tr>	
		<tr>
			<td width=500 height=50>
				작성일시 : <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${sessionScope.list.board_date}"/>  조회수 : ${sessionScope.list.board_count}
			</td>
		</tr>
		<tr>
			<td width=500 height=400>
				${sessionScope.list.board_content}
			</td>
		</tr>
	</table>
		<br>
		<!-- <form action='update.do' name="update" method="get">
			<input type="submit" value="수정">
		</form> -->
		
		<!-- <a href='update.do'><button id="update">수정</button></a>  <a href='delete.do'><button id="delete">삭제</button></a> 
		 -->
		 <div id="updatebox">
		 	<button id="update">수정</button>
		 	<%-- <c:if test="${empty sessionScope.error }">
		 		${sessionScope.error}
		 	</c:if> --%>
		 	<br>
		 	<c:if test="${not empty requestScope.error}">
		 		${requestScope.error}
		 	</c:if>
		 	
		 </div>
		 
		 
		<!-- 
		<form action='delete.do' name="delete" method="get">
	 		<input type="submit" value="삭제">
	 	</form> -->
		
		<!-- spring-mvc 경로 잘못될 가능성 존재.-->
		<script type="text/javascript">
			$(document).ready(function(){
				
				$("#update").on("click",function(){
					
					//var txt ="비밀번호:" + "<form action=updateajax.do name=updateBoxForm method=GET> <input type=password name=updatepassword> <input type=submit value=등록> <input type=reset value=초기화> </form>";
				var txt ="비밀번호:" + "<form action=updateajax.do name=updateBoxForm method=GET> <input type=password name=updatepassword> <a href=updateajax.do><button id=updateBoxForm>수정</button></a> <input type=reset value=초기화> </form>";
					
					$("#updatebox").html(txt);
					
					/* if('${sessionScope.error}'!=null)
					{
						var txt2='${sessionScope.error}';
						$("#updatebox").html(txt2);
					} */
					
				});
				
				
	
				/* $("#updateBoxForm").on("click",function(){
					alert("된다.");
					if('${sessionScope.list.board_password}'!=$("#updatepassword").val())
					{
						$("#updatebox").html("비밀번호가 틀렸습니다.");
					}
				}); */
				
			});
			
			
			
			
			
		</script>
		
</body>
</html>