
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>
<script>
$(document).ready(function(){
	$("#MemberForm").hide();
	$("#Form").hide();
	$("#yes").on("click",function(){
		$("#Form").hide();
		$("#MemberForm").show();
	});
	$("#not").on("click",function(){
		$("#MemberForm").hide();
		$("#Form").show();
	});
});
function error(){ //member 요소
  var memberNo = $("#memberNo").val();
	var phoneEnd = $("#phoneEnd").val();
	
	var errorMessage = "";
	if(memberNo ==""){
		errorMessage = errorMessage + "<span style='color:red;font-size:small'>회원번호를 입력하세요</span><br>";
	}
	if(phoneEnd == ""){
		errorMessage = errorMessage + "<span style='color:red;font-size:small'>핸드폰번호를 입력하세요</span>";
	}
	if(errorMessage == ""){
		return true;
	}else{
		$("#errordiv").html(errorMessage);
		$("#errordiv").show();
		return false;
	}
}
function error2(){ //비회원 요소
	var password = $("#password").val();
	var orderName = $("#orderName").val();
	var errorMessage = "";
	if(password == ""){
		errorMessage = errorMessage+"<span style='color:red;font-size:small'>비밀번호를입력하세요.</span><br>";
	}
	if(orderName ==""){
		errorMessage = errorMessage+"<span style='color:red;font-size:small'>이름을입력하세요.</span>";
	}
	if(errorMessage == ""){
		
		return true;
	}else{
		$("#errordiv").html(errorMessage);
		$("#errordiv").show();
		return false;
	}
	
}
</script>
<h2>비밀번호를 입력하세요</h2>
<strong>회원이십니까?</strong>
<div id="errordiv"></div>
<input type="radio" name="memberCheck" id="yes" >예
<input type="radio" name="memberCheck" id="not"> 아니요

<form id="MemberForm" action="/HealthJJang/memberCheck.do" onsubmit="return error();"> 
비밀번호를 입력하세요<br>회원 번호 : <input type='text' id="memberNo" name='memberNo'><br>핸드폰 뒷자리 : <input type='password' id="phoneEnd" name='memberPhoneEnd'><br><input type='submit' value='전송'>
</form>
<form id="Form" action="/HealthJJang/memberCheck.do" onsubmit="return error2();">
비밀번호를 입력하세요 : <input type='password' id='password' name='password'><br>이름 : <input type='text' id="orderName" name="orderName"><input type='submit' value='전송'>
</form>
<c:if test="${requestScope.errorMessage != null }">
<span style="font-size:small;color:red;">${requestScope.errorMessage}</span>
</c:if>