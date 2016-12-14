
<%@ page contentType="text/html;charset=UTF-8" %>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>
<script>
$(document).ready(function(){
	var code = "${sessionScope.code}";

	$("#backShoping").on("click",function(){
		
		
		location.href ="/HealthJJang/ViewList.do?code="+code;
	});
	$("#orderation").on("click",function(){
		location.href ="/HealthJJang/ViewOrder.do";
	});
});

</script>
<h2>결제가 완료되었습니다.</h2><br>
<button id="backShoping">쇼핑으로 돌아가기</button>&nbsp;&nbsp;&nbsp;<button id="orderation">주문목록 조회</button>