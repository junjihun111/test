
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>
<script>
$(document).ready(function(){
	var error = "${requestScope.errorMessage}";
	

	if(error != ""){
		$("#list").html("<span style='color: blue;font-size: large;'>등록된 물품이없습니다 물품을 추가하세요.</span>");
	}
	$(".button").on("click",function(){
		var code = $(this).attr("value");
		$("#list").append("<input type='hidden' name='code' value="+code+">");
	});
	
});

</script>
<form name="myForm" id="list" action="/HealthJJang/updateCode.do" >
<button class="button"  value="H">배송시작</button>
<button class="button"  value="I" >배송중</button>
<button class="button" value="J" >배송완료</button>
 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 <button class="button" value="VG">배송전 조회</button>
 <button class="button" value="VH">배송시작 조회</button>
 <button class="button" value="VI">배송중 조회</button>
 <button class="button" value="D">배송완료 삭제</button>
 

 

<table>
<thead>
<tr>
<td>주문자 이름</td>
<td>주문번호</td>
<td>제품사진</td>
<td>제품이름</td>
<td>수량</td>
<td>주문상태</td>
</tr>
</thead>
<tbody>
<c:forEach items="${requestScope.order}" var="item">
<tr>
<td>${item.ordererName}</td>
<td>${item.orderationNo}</td>

<c:forEach items="${item.orderation}" var = "inItem">
	<td><img alt="물품 ${inItem.productName}"
		src="/HealthJJang/ect/${inItem.imageName}"></td>
<td><a href="/HealthJJang/ViewOneOrderAdmin.do?no=${item.orderationNo}&name=${inItem.productName }">${inItem.productName }</a></td>
</c:forEach>
<td>${item.ordererCount }</td>
<c:forEach items="${item.orderation}" var = "inItem">
<c:choose>
<c:when test="${inItem.code =='G' }"><td>배송전</td></c:when>
<c:when test="${inItem.code =='H' }"><td>배송시작</td></c:when>
<c:when test="${inItem.code =='I' }"><td>배송중</td></c:when>
<c:when test="${inItem.code =='J' }"><td>배송완료</td></c:when>
</c:choose>
</c:forEach>
<td>
<input type="checkbox" id="orderationNo" name="orderationNo" value="${item.orderationNo}">
</td>
</tr>
</c:forEach>

</tbody>
</table>

</form>