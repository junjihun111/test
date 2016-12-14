<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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
				작성일시 : <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${sessionScope.list.board_date}"/> 조회수 : ${sessionScope.list.board_count}
			</td>
		</tr>
		<tr>
			<td width=500 height=400>
				${sessionScope.list.board_content}
			</td>
		</tr>
	</table>
		<br><br>
	
		<a href='operatorupdate.do'><input type="submit" value="수정"></a>
		<a href='operatordelete.do'><input type="submit" value="삭제"></a>
		

</body>
</html>