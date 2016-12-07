<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<style type="text/css">
.section {
	
	
}

#title {
	font-weight: bold;
	padding: 10px;
}

#info {
	font-size: 13px;
	border-bottom: 1px dotted gray;
	padding-top: 15px;
	padding-right: 5px;
	padding-bottom: 10px;
	text-align: right;
}

#content {
	min-height: 300px; /*최소 높이 300px*/
	height: auto; /*자동으로 늘어나기*/
	padding: 10px;
}
</style>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>
<script>
var errorMessage = "";
	var code = "${requestScope.result.item.productCode}";
	var error = "${requestScope.Oerror}";
	/* $(window).load(function(){
	    alert('ojtiger.com');
	}); */
	function errors(){
		
		
		
		if($("#memberCheckYes").is(":checked")){
			if($("#phoneNo").val() == ""){
				errorMessage = errorMessage+"<span style='color: red;font-size: small;'>비밀번호를 입력하세요</span><br>";
			}	
			if($("#No").val() == ""){
				errorMessage = errorMessage+"<span style='color: red;font-size: small;'>회원번호를 입력하세요</span><br>";
			}
			
			if(errorMessage == ""){
				return true;
			}
			
			$("#error").html(errorMessage);
			$("#error").show();
			errorMessage = "";
			return false;	
			
		}
		
		
	}
	
	$(document).ready(function(){
	 	$("#colorForm").hide();
	 	$("#sizeForm").hide();
		$("#memberCheckForm").hide();
		$("#error").hide();

		if(error != ""){
			errorMessage = errorMessage+"<span style='color: red;font-size: small;'>"+error+"</span><br>";
			$("#error").html(errorMessage);
			$("#error").show();
			errorMessage = "";
		}
		
		var price = "${requestScope.result.item.productPrice}";
		
		var no = "${requestScope.result.item.productNo}";
		alert(no);
		
		var hidden = $("#hidden").html();
	
		
		$("#memberCheckYes").on("click",function(){
				$("#memberCheckForm").show();
			
			
			
			
		});
		$("#memberCheckNo").on("click",function(){
			$("#memberCheckForm").hide();
		});
		$("#shoppingbasket").on("click",function(){
			location.href ="/HealthJJang/shoppingCart"
		});
		if(code == "D"){//P_01 = 운동기구 02 운동복 03 영양제
			$("#colorForm").show();
 		}else if(code == "E"){
 			$("#colorForm").show();
 			$("#sizeForm").show();
 		}
		$("#amount").on("keyup",function(){
			var amount = this.value;
			var pAmount = "${requestScope.result.item.productAmount}";
			var price = "${requestScope.result.item.productPrice}";
			var maxSum = pAmount*price;
			
			
			if(this.value==""||this.value=="0"){
				alert("수량을 1개 이상 선택하세요");
				this.value = 1;
				amount = 1;
			}
			
			if(amount*price > maxSum){
				alert("최대 주문가능 수량은"+pAmount+"개 입니다.");
				$("#price").text(price*1+" 원");
				this.value = 1;
			}else{
				$("#price").text(price*amount+" 원");
			
			}
			
			
			
		});
		$("#amount").on("click",function(){
			var amount = this.value;
			var pAmount = "${requestScope.result.item.productAmount}";
			var price = "${requestScope.result.item.productPrice}";
			var maxSum = pAmount*price;
			
			if(this.value==""||this.value=="0"){
				alert("수량을 1개 이상 선택하세요");
				this.value = 1;
				amount = 1;
			}
			
			if(amount*price > maxSum){
				alert("최대 주문가능 수량은"+pAmount+"개 입니다.");
				$("#price").text(price*1+" 원");
				this.value = 1;
			}else{
				$("#price").text(price*amount+" 원");
				
			}
		});
			
		
		
 	});
	window.onload = function(){
	
	    var val = $("#value").text();
		$("#hidden").append("<input type='hidden' name='price' value="+val+">");
		}
	
	
</script>
<section class="section">
	<form name="orderForm" action="/HealthJJang/OrderForm.do?code=${requestScope.result.item.productCode}&&productNo=${requestScope.result.item.productNo}" onsubmit="return errors()">
	<div id="hidden">
	<input type="hidden" name="productNo" value="${requestScope.result.item.productNo}">
	<input type="hidden" name="code" value="${requestScope.result.item.productCode }">
	<input type="hidden" name="productName" value="${requestScope.result.item.productName}">
	</div>

	<img alt="물품 ${requestScope.result.item.productName}"
		src="/HealthJJang/ect/${requestScope.result.item.imageName}">
	${requestScope.result.item.productName}<br>
	<%-- <fmt:parseNumber value="${requestScope.result.item.productPrice*0.8}" integerOnly="true"></fmt:parseNumber> --%>
	<div id="price">
	<section class="section" style="padding: 10px;"><span id="value">${requestScope.result.item.productPrice}</span>원</section>
	<br></div> 회원이십니까? <br> <input
		type="radio" id="memberCheckYes" name="memberCheck" value="yes" >예 &nbsp; <input
		type="radio" id="memberCheckNo" name="memberCheck" value="no">아니요 <br>
		<div id="memberCheckForm">
		 
		회원 카드번호 : <input type="text" name="memberNumber" id="No" >
		회원 핸드폰 뒷자리번호 : <input type="password" name="phoneEnd" id="phoneNo"  onkeypress="if (event.keyCode<48|| event.keyCode>57)  event.returnValue=false;" 
              style='IME-MODE:disabled;'>
		</div>
		물품수량<input type="number" id="amount" name="amount" min="1" value="1" step="1" style="width: 30px;height: 30px;">개
	<div id="colorForm">
		물품색상
		<select>
		<c:forEach items="${requestScope.result.colorList}" var="color">
			<option>${color.colorName}</option>
      </c:forEach>
      </select>
	</div>
	<div id="sizeForm">
		사이즈 <select> 
			<option>XS</option>
			<option>S</option>
			<option>M</option>
			<option>L</option>
			<option>XL</option>
			</select>
	</div>
	<input type="submit" value="구매"> <button id="shoppingbasket">장바구니</button>
</form>
</section>
<div id="error">

</div>
<%-- 	<article id="content">${requestScope.notice.content }</article>
 --%>
<%-- <p>

<a href="${initParam.rootPath }/controller?command=noticeModifyForm&no=${requestScope.notice.no}&page=${param.page}">공지사항수정</a>&nbsp;&nbsp;&nbsp;
<a href="${initParam.rootPath }/controller?command=noticeRemove&no=${requestScope.notice.no}&page=${param.page}">공지사항삭제</a>
</p> --%>
