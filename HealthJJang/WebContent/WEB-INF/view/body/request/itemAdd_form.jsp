<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/_Health_Zzang/scripts/jquery.js"></script>
<script>
	
$(document).ready(function(){
	$("#formDiv").hide();
	$("#colorFrom").hide();
	$("#error").hide();
	$("#sizeForm").hide();
	/* $("#categoryForm").hide(); */
	$("#productSelect").on("change",function(){
		
		
		if(this.value >= 1){
			$("#formDiv").show();
			if(this.value == 1){ /* frame = 0 이면 운동기구 
											1 이면 운동복
											2 면 영양제
									*/
				$("#category option:eq(1)").prop("selected", true);
				$("#sizeForm").hide();
				$('input[name="frame"]').val(this.value);
				$("#colorFrom").show();
			}else if(this.value == 2){
				$("#category option:eq(2)").prop("selected", true);
				$("#colorFrom").show();
				$('input[name="frame"]').val(this.value);
				
				$("#sizeForm").show();
			}else{
				$("#category option:eq(3)").prop("selected", true);
				$("#colorFrom").hide();
				$('input[name="frame"]').val(this.value);
				$("#sizeForm").hide();
			}
		}else{
			$("#formDiv").hide();
			$("#category option:eq(0)").prop("selected", true);
		}
	});
});

function error(){
	var errorMessage = "";
	/*
	<span id="nameError" style='color: red;font-size: small;'>이름을 입력하세요</span><br>
<span id="fileError" style='color: red;font-size: small;'>파일을 선택하세요</span><br>
<span id="categoryError" style='color: red;font-size: small;'>카테고리를 선택하세요</span><br>
<span id="colorError" style='color: red;font-size: small;'>3개이상 색상을 선택하세요</span><br>
<span id="sizeError" style='color: red;font-size: small;'>1개이상 사이즈를 선택하세요</span><br>
<span id="exError" style='color: red;font-size: small;'>물품 설명을 입력하세요</span><br>
	*/
	if($("#productName").val() == ""){
		errorMessage = errorMessage+"<span id='nameError' style='color: red;font-size: small;'>이름을 입력하세요</span><br>";
	
	}
	if($("#image").val() == ""){
		errorMessage = errorMessage+"<span id='fileError' style='color: red;font-size: small;'>파일을 선택하세요</span><br>";
	
	}
	if($("#category option:selected").val()==0){
		errorMessage = errorMessage+"<span id='categoryError' style='color: red;font-size: small;'>카테고리를 선택하세요</span><br>";

	}
	

	if($("#category option:selected").val() == 1){
		
		if( $("#color:checked").length < 3 ){
			
			errorMessage = errorMessage+"<span id='colorError' style='color: red;font-size: small;'>3개이상 색상을 선택하세요</span><br>";
		
		}
		if($("#size:checked").length < 1){
			errorMessage = errorMessage+"<span id='sizeError' style='color: red;font-size: small;'>1개이상 사이즈를 선택하세요</span><br>";
		
		}
	}
	if($("#productSelect option:selected").val()== 2){
		if( $("#color:checked").length < 3 ){
			errorMessage = errorMessage+"<span id='colorError' style='color: red;font-size: small;'>3개이상 색상을 선택하세요</span><br>";
		
		}
	}
	if($("#comment").val() == ""){
		errorMessage = errorMessage+"<span id='exError' style='color: red;font-size: small;'>물품 설명을 입력하세요</span><br>";
		
	 }
	if($("#amount").val() == 0 || $("#amount").val == ""){
		errorMessage = errorMessage+"<span style='color: red;font-size: small;'>물품 수량을 입력하세요</span><br>";
	}
	if($("#price").val() == 0 || $("#price").val == ""){
		errorMessage = errorMessage+"<span style='color: red;font-size: small;'>물품 가격을 입력하세요</span><br>";
	}
	 if($("#price").val() <5000){
		errorMessage = errorMessage+"<span style='color: red;font-size: small;'>물품 가격을 5000원이상 입력하세요</span><br>";
	} 
	if(errorMessage == ""){
		return true;
	}else{
		$("#error").html(errorMessage);
		$("#error").show();
		return false;
	}
}



</script>
<select id="productSelect">
<option value="0">카테고리를 선택하세요</option>
	<c:forEach items="${requestScope.codeList}" var="code" varStatus="no">
	<option value="${no.count}">${code.explagin}</option>
	</c:forEach>
</select>
<h2>이미지 파일 업로드</h2>
<div id="error">



</div>
<div id="formDiv">
<form method="post" enctype="multipart/form-data" action="/_Health_Zzang/addItem.do" id="form" onsubmit="return error()">
<input type="hidden" value="" name="frame">
물품이름 <input type="text" name="name" id="productName"><br>
물품사진 : <input type="file" name="upImage" id="image"><br>
<div id="categoryForm">
물품코드  <select name="productCategory" id="category">
	<option value="0">카테고리를 선택하세요</option>
	<c:forEach items="${requestScope.codeList}" var="code">
	<option value="${code.code }">${code.explagin}</option>
	</c:forEach>
	  </select>
</div>
<br>
<div id="colorFrom" >
물품색상 <c:forEach items="${requestScope.colorList}" var="color">
		<input type="checkbox" name="color" id="color" value="${color.colorName}" >${color.colorName}
      </c:forEach>
</div>
<div id="sizeForm">
사이즈<br>
<input type="checkbox" name="size" id="size" value="XS">매우작음<br>
<input type="checkbox" name="size" id="size" value="S">작음<br>
<input type="checkbox" name="size" id="size" value="M">보통<br>
<input type="checkbox" name="size" id="size" value="L">큼<br>
<input type="checkbox" name="size" id="size" value="XL">매우큼<br>
</div>	  
<br>물품설명 <br>
<textarea name="comment" id="comment" cols="50" rows="5" placeholder="물품설명란"></textarea>
<br>물품수량<input type="number" name="amount" id="amount" style="text-align: right;" step="10">개
<br>물품가격<input type="number" name="price" id="price" style="text-align: right;" step="1000">원
<br> <input type="submit" value="전송" > <input type="reset" value="초기화">

</form>
</div>