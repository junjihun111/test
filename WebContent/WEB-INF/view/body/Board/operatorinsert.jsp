<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="/WEB-INF/view/body/boardmenu.jsp"/>
<br>
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


<form action="operatorinsertSuccess.do" name="join_form" method="get">

<select name="header" id="header"><!-- onchange 는 select 의 선택값이 변경될때 마다 발생하는 이벤트 처리자. -->
      <option>공지사항</option>
</select>
   
<input type="text" id="name" name="name" value="공지사항제목">    
<input type="text" id="wrtier" name="writer" value="작성자"><br>


<textarea name="content" cols="100" rows="30"></textarea>
<br><br>
비밀번호 : <input type="password" id="password" name="password" value="비밀번호">
      
      <br><br>
      <!-- <input type="submit"  value="등록"> -->
      
      
      <div id="insertbox">
      	<a href='operatorinsertSuccess.do'><button id="check">등록</button></a> <input type="reset" value="초기화">
      	<br><br>
      	<c:if test="${not empty requestScope.errorinsert }">
      		${requestScope.errorinsert}
      	</c:if>
      </div>
      
</form>

</body>
</html>