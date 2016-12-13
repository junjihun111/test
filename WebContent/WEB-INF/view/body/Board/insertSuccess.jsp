<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.dagle{
	color:red;
	align:left;
}

</style>


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
			<td width=600 height=50>
				작성일시 : <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${sessionScope.list.board_date}"/>  조회수 : ${sessionScope.list.board_count}
			</td>
		</tr>
		<tr>
			<td width=600 height=400>
				${sessionScope.list.board_content}
			</td>
		</tr>
	</table>	
	
	<br><br>
	
	
	<table>
		<tr>
			<th colspan="2"><h2>댓글란</h2></th>
		</tr>
	

		<tr>
			<td width=100 height=10>순번</td>
			<td width=500 height=10>내용</td>
		</tr>
	
	</table>
	
	<form action="dagleinsert.do">
	
		<table border=2>
		<c:forEach items="${sessionScope.listjoin}" var="board" varStatus="cnt">
			<c:forEach items="${board.daglelist}" var="dagle" varStatus="cnt">
	
			<c:if test="${board.daglelist ==null}">
			<tr>
				<td width=100 height=40 >
					댓글 : ${cnt.count }
				</td>
				
				<td width=500 height=40 colspan="2">
					&nbsp;&nbsp; └ ${dagle.content}<br> &nbsp;&nbsp;
					<c:if test="${not empty sessionScope.managerID}">
						<c:if test="${not empty sessionScope.managerPW}">
							<a href="deletedagle.do?page=${cnt.count}&content=${dagle.content}"><input type="button" name="delete" id="delete" value="삭제"><input type="hidden" name="content"></a>
						</c:if>
					</c:if>
					<a href="updatedagle.do?page=${cnt.count}&board_password=${dagle.board_password}"><input type="button" name="update" id="update" value="수정"><input type="hidden" name="board_password"></a>
				</td>
				
			</tr>
			</c:if>
			</c:forEach>
		</c:forEach>		
		
			<tr>
				<td width=100 height=30 colspan="2">
					댓글 : <input type="text" id="content" name="content" value="댓글"> 
					작성자 : <input type="text" id="writer" name="writer" value="작성자"><br>
				 	비밀번호 : <input type="password" id="board_password" name="board_password" value="비밀번호">
				 <c:choose>
					<c:when test="${not empty sessionScope.errorcontent }">
						<br>${sessionScope.errorcontent}
					</c:when>
					
					<c:when test="${not empty sessionScope.writer }">
						<br>${sessionScope.writer}
					</c:when>
				</c:choose>
					<br><input type="submit" value="등록" >
				</td>	
			</tr>
	
	</table>
	</form>
	
		<br>
	
		 <div id="updatebox">
		 	<button id="update">수정</button>
		 	<%-- <c:if test="${empty sessionScope.error }">
		 		${sessionScope.error}
		 	</c:if> --%>
		 	<button id="delete">삭제</button>
		 	<br>
		 	<c:if test="${not empty requestScope.error}">
		 		${requestScope.error}
		 	</c:if>
		 	
		 </div>
		 
		 
		
		
		<!-- spring-mvc 경로 잘못될 가능성 존재.-->
		<script type="text/javascript">
			$(document).ready(function(){
				
				$("#update").on("click",function(){
					
				var txt ="비밀번호:" + "<form action=updateajax.do name=updateBoxForm method=GET> <input type=password name=updatepassword> <a href=updateajax.do><button id=updateBoxForm>수정</button></a> <input type=reset value=초기화> </form>";
					
					$("#updatebox").html(txt);
					
					
					
				});
				
				$("#delete").on("click",function(){
					var txt ="비밀번호:" + "<form action=delete.do name=deleteForm method=GET> <input type=password name=updatepassword> <a href=delete.do><button id=deleteBoxForm>수정</button></a> <input type=reset value=초기화> </form>";
					$("#updatebox").html(txt);	
				});
				
				
				$("#content").on("click",function(){
					$("#content").val("");
				});
				
				$("#writer").on("click",function(){
					$("#writer").val("");
				});
				
				$("#board_password").on("click",function(){
					$("#board_password").val("");
				});
				
				
				
			});
			
			
			
			
			
		</script>
		
</body>
</html>