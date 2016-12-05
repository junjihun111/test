<%@ page contentType="text/html;charset=UTF-8" %>
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
				${sessionScope.list.board_no} . [${sessionScope.list.board_header }] ${sessionScope.list.board_name }  
			</td>
		</tr>	
		<tr>
			<td width=500 height=50>
				작성일시 : ${sessionScope.list.board_date} 조회수 : ${sessionScope.list.board_count} 비밀번호 : ${sessionScope.list.board_password}
			</td>
		</tr>
		<tr>
			<td width=500 height=400>
				${sessionScope.list.board_content}
			</td>
		</tr>
	</table>
		<br><br>
	
		<a href='Board/update.do'><input type="submit" value="수정"></a>
		<a href='Board/BoardList.do'><input type="submit" value="삭제"></a>
		

</body>
</html>