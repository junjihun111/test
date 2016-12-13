<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>

<script type="text/javascript">
   $(document).ready(function(){
       $("#header").on("change", function(){
         var idx = this.selectedIndex;
         if(idx==0)
         {
            alert("말머리를 선택해주세요.");
         } 
      });
   
      $("#name").on("click",function(){
         $(this).val("");
         if($("#name").val(""))
         {
             alert("제목을 입력해주세요");
         }
      });
      
      $("#password").on("click",function(){
         $(this).val("");
         if($("#password").val(""))
         {
             alert("비밀번호를 입력해주세요");  
         }
      });
   });
   

  
   
   
</script>


<jsp:include page="/WEB-INF/view/body/boardmenu.jsp"/>
   <form action="updateSuccess.do" name="join_form" method="get">

<select id="header" name="header"><!-- onchange 는 select 의 선택값이 변경될때 마다 발생하는 이벤트 처리자. -->
      <option>${sessionScope.list.board_header}</option>
      <c:forEach items="${sessionScope.select}" var="name">
            <option>${name.CODEOPTION}</option>
      </c:forEach>
</select>
   
<input type="text" id="name" name="name" value="${sessionScope.list.board_name }">
<input type="text" id="wrtier" name="writer" value="${sessionScope.list.board_writer }"><br>


<textarea name="content" cols="100" rows="30">${sessionScope.list.board_content}</textarea>
<br>
<input type="password" id="password" name="password" value="${sessionScope.list.board_password}">
      
      <br><br>
      
     
 	  
 	  <div id="insertbox">
      	<input type="submit" value="수정">  <input type="reset" value="초기화">
      	<br><br>
      	<c:if test="${not empty requestScope.errorupdate }">
      		${requestScope.errorupdate}
      	</c:if>
      </div>   
      
      
      
</form>

</body>
</html>