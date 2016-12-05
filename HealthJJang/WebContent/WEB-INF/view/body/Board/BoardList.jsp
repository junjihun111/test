<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 #bbs td {
    padding-top: 3px;
    padding-bottom: 3px;
    border-bottom: 1px solid silver;
}

#bbs td a {
    color: #555;
    text-decoration: none;
}

#bbs td a:hover {
    color:#555;
    text-decoration: underline;
} 

</style>
</head>
<body>
<jsp:include page="/WEB-INF/view/body/boardmenu.jsp"/>
<br>
<table border=2 id="bbs">
	<thead>
			<tr>
				<td width=500 height=50>번호</td>
				<td width=500 height=50>제목</td>
				<td width=500 height=50>공지일</td>
				<td width=500 height=50>조회수</td>
			</tr>
	</thead>
	<tbody>
		<c:forEach items="${sessionScope.BoardList}" var="board" varStatus="cnt">
		<tr>
			<td>${board.board_no} </td>
			<td><a href="insertList.do?page=${board.board_no }">${board.board_name}
			</a></td>
			<td>${board.board_date}</td>
			<td>${board.board_count}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
	<a href='insert.do'>글 등록</a>&nbsp;&nbsp;
	<!-- 관리자 전용메뉴 <a href='Board/delete.do'>글 삭제</a>&nbsp;&nbsp; -->
</body>


<p>
	<!-- 첫페이지로 이동 -->
	<a href="BoardList.do?page=1">
		◁&nbsp;&nbsp;
	</a>
	<!--
		이전 페이지 그룹 처리.
		만약에 이전페이지 그룹이 있으면 링크처리하고 없으면 화살표만 나오도록 처리.
	 -->
 <c:choose>
 	<c:when test="${requestScope.pageBean.previousPageGroup }">
 		<a href="BoardList.do?page=${requestScope.pageBean.beginPage-1 }">
 			◀
 		</a>	
 		&nbsp;&nbsp;
 	</c:when>
 	<c:otherwise>
		◀&nbsp;&nbsp;
 	</c:otherwise>
 </c:choose>
<!-- 
	현재 page가 속한 page 그룹내의 페이지들 링크.
	현재 pageGroup의 시작page ~ 끝 page
 -->
 <!-- 만약에 p가 현재페이지면 링크처리를 하지 않고 p가 현재페이지가 아니라면 링크처리. -->
<c:forEach begin="${requestScope.pageBean.beginPage }" end="${requestScope.pageBean.endPage }"
			   var="p">
	<c:choose>
		<c:when test="${p != requestScope.pageBean.page }">
			<a href="BoardList.do?page=${p }">
				${p }
			</a>
			&nbsp;&nbsp;
		</c:when>
		<c:otherwise>
			[${p}]&nbsp;&nbsp;
		</c:otherwise>
	</c:choose>
</c:forEach>
<!-- 
	다음페이지 그룹으로 이동
	만약에 다음페이지 그룹이 있으면 링크 처리 없으면 화살표만 나오도록 처리
 -->
<c:choose>
	<c:when test="${requestScope.pageBean.nextPageGroup }">
		<a href="BoardList.do?page=${requestScope.pageBean.endPage+1 }">
			▶&nbsp;&nbsp;		
		</a>
	</c:when>
	<c:otherwise>
		▶&nbsp;&nbsp;
	</c:otherwise>
</c:choose>

<!-- 마지막 페이지로 이동 -->
<a href='BoardList.do?page=${requestScope.pageBean.totalPage}'>
	▷
</a>	
</p>

</html>