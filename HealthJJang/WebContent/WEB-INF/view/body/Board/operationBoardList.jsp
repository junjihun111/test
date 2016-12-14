<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
/*  #bbs td {
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
} */ 

*,body{
 font-family: "맑은 고딕";
 margin:0px;
 padding:0px;
 font-size:11px;
}
caption{
 background: url(images/title_event.png) no-repeat center center;
 width:700px;
 height:50px;
}
caption span{
 display:none;
}
table{
 border-collapse: collapse;
}
td{
 border-bottom: 1px solid #000;
 text-align:center;
 padding:5px 10px;
}
th{
 height:34px;
 padding:0px 0px;
 font-size:12px;
}
th span{
/*  border-right:1px solid #666; */
 background: url(images/bar7_1.png) no-repeat right 10px;
  display:block;
  padding:0px 0px 2px 0px;
}
tr:FIRST-CHILD{
 
}
tr:last-CHILD{
 border-bottom: 2px solid #000;
}
th:FIRST-CHILD{
 background: url(images/table_header_bg.png) repeat-x;
}
 /* 2열의 th 내용*/ 
th:nth-child(2) {
 background: url(images/table_header_bg.png) center top repeat-x;
} 
th:nth-child(3) {
 background: url(images/table_header_bg.png) center top repeat-x;
} 
th:nth-child(4) {
 background: url(images/table_header_bg.png) center top repeat-x;
} 
th:nth-child(5) {
 background: url(images/table_header_bg.png) right top repeat-x;
} 
.bb{
 border:none;
}
td{
 background: url(images/bar7_1.png) no-repeat right bottom;
}




</style>
</head>
<body>
	공지사항게시판
	
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>

<jsp:include page="/WEB-INF/view/body/boardmenu.jsp"/>
<br>
<table border=2 >
			<tr class="aa">
				<th width=500 height=100><span><h2>번호</h2></span></th>
				<th width=500 height=100><span><h2>제목</h2></span></th>
				<th width=500 height=100><span><h2>공지일</h2></span></th>
				<th width=500 height=100><span><h2>조회수</h2></span></th>
				<th width=500 height=100><span class="bb"><h2>작성자</h2></span></th>
			</tr>
	
	<tbody>
		<c:forEach items="${sessionScope.operationBoardList}" var="board" varStatus="cnt">
		<tr>
			<td><span><h2>${board.board_no}</h2></span> </td>
			<td><span><h2><a href="operationinsertList.do?page=${board.board_no }">${board.board_name}</a></h2></span></td>
			<td><span><h2><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${board.board_date}"/></h2></span></td>
			<td><span><h2>${board.board_count}</h2></span></td>
			<td><span class="bb"><h2>${board.board_writer}</h2></span></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
<br><br>

<c:if test="${not empty sessionScope.managerID}">
	<c:if test="${not empty sessionScope.managerPW}">
			<a href='operatorinsert.do'><button id="insert">글 등록</button></a>&nbsp;&nbsp;
	</c:if>
</c:if>
	
	
</body>


<p>
	<!-- 첫페이지로 이동 -->
	<a href="operationBoardList.do?page=1">
		◁&nbsp;&nbsp;
	</a>
	<!--
		이전 페이지 그룹 처리.
		만약에 이전페이지 그룹이 있으면 링크처리하고 없으면 화살표만 나오도록 처리.
	 -->
 <c:choose>
 	<c:when test="${requestScope.pageBeanoperator.previousPageGroup }">
 		<a href="operationBoardList.do?page=${requestScope.pageBeanoperator.beginPage-1 }">
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
<c:forEach begin="${requestScope.pageBeanoperator.beginPage }" end="${requestScope.pageBeanoperator.endPage }"
			   var="p2">
	<c:choose>
		<c:when test="${p2 != requestScope.pageBeanoperator.page }">
			<a href="operationBoardList.do?page=${p2 }">
				${p2 }
			</a>
			&nbsp;&nbsp;
		</c:when>
		<c:otherwise>
			[${p2}]&nbsp;&nbsp;
		</c:otherwise>
	</c:choose>
</c:forEach>
<!-- 
	다음페이지 그룹으로 이동
	만약에 다음페이지 그룹이 있으면 링크 처리 없으면 화살표만 나오도록 처리
 -->
<c:choose>
	<c:when test="${requestScope.pageBeanoperator.nextPageGroup }">
		<a href="operationBoardList.do?page=${requestScope.pageBeanoperator.endPage+1 }">
			▶&nbsp;&nbsp;		
		</a>
	</c:when>
	<c:otherwise>
		▶&nbsp;&nbsp;
	</c:otherwise>
</c:choose>

<!-- 마지막 페이지로 이동 -->
<a href='operationBoardList.do?page=${requestScope.pageBeanoperator	.totalPage}'>
	▷
</a>	
</p>

</html>