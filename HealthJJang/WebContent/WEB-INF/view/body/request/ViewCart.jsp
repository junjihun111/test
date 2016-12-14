
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>
<script>
$(document).ready(function(){
	var password = "${sessionScope.member.memberNo}";
	if(password == ""){
		password = "${sessionScope.password}";
	}
	
	
	$("#deleteBtn").on("click",function(){
		
	});

});

</script>

<c:choose>
<c:when test="${sessionScope.member == null }">
${sessionScope.ordername }님 장바구니 정보입니다.
</c:when>
<c:otherwise>
${sessionScope.member.memberName}님 장바구니 정보입니다.
</c:otherwise>
</c:choose>
<form action="/HealthJJang/deleteCart.do">
<button id="deleteBtn">물품삭제</button>

<table>
<thead>
<tr>
<th>제품 사진</th>
<th>제품 이름</th>
<th>제품 번호</th>
<th>제품 가격</th>
<th>제품 수량</th>
</tr>
</thead>
<tbody>
<c:forEach items="${requestScope.cart }" var="basket">
<tr>
<td><c:forEach items ="${basket.product }" var="item">
<img alt="물품" src="/HealthJJang/ect/${item.imageName}"></td>
<td><a href="/HealthJJang/ViewOne.do?no=${item.productNo}">${item.productName }</a></td>
</c:forEach>

<td>${basket.productNo }</td>
<c:forEach items = "${basket.product }" var="item">
<td>${item.productPrice }</td>
<td>${item.productAmount }</td>
</c:forEach>
<td><input type="checkbox" name="productNo" value="${basket.productNo }"></td>
</tr>

</c:forEach>
<c:choose>
<c:when test="${sessionScope.member == null }">
<input type="hidden" name="password" value="${sessionScope.password }">
</c:when>
<c:otherwise>
<input type="hidden" name="password" value="${sessionScope.member.memberNo }">
</c:otherwise>
</c:choose>
</tbody>
</table>
</form>