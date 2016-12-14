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
		
		<c:if test="${not empty sessionScope.managerID}">
			<c:if test="${not empty sessionScope.managerPW}">
				<a href="operatorupdate.do"><button id="update">수정</button></a>
				<a href="operatordelete.do"><button id="delete">삭제</button></a>
			</c:if>
		</c:if>
		 	
			
		
		
</body>
</html>