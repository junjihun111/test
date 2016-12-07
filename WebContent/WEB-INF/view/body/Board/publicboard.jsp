<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<jsp:include page="/WEB-INF/view/body/boardmenu.jsp"/>
<h2>공용게시판</h2> 안씀
<table border=2>
	<thead>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>공지일</td>
				<td>조회수</td>
			</tr>
	</thead>
	<tbody>
	<c:forEach items="${requestScope.BoardList}" var="board" varStatus="cnt">
		<tr>
			<td>${cnt.count} 숫자</td>
			<td><a href="">${board.name} 제목</a></td>
			<td>${board.date} 날짜 </td>
			<td>${board.count} 조회수 </td>
		</tr>
	</c:forEach>
	</tbody>
</table>
	<a href='Board/insert.do'>공지사항 등록</a>&nbsp;&nbsp;
	<a href='delete.do'>공지사항 삭제</a>&nbsp;&nbsp;
	
