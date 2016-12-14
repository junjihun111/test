
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>
<script>
$(document).ready(function(){
	$("#deleteBtn").on("click",function(){	$("#list").append("<input type='hidden' name='deleteBtn' value='deleteaa'>");
	
	});
	
	
});
</script>
<style>
table {
    width: 100%;
    height:100%;
    border-collapse: collapse;
  }
  th, td {
    border: 1px solid #bcbcbc;
    text-align: center;
    padding: 5px;
  }
</style>
<table>
	<thead>
		<tr >
			<th >제품사진</th>
			<th>제품이름</th>
			<th>주문자이름</th>
			<th>연락처</th>
			<th>주소</th>
			<th>우편번호</th>
			<th>가격</th>
			<th>수량</th>
			<th>주문상태</th>
			<c:if test="${requestScope.amount != null }">
			<th>제품 총개수</th>
			</c:if>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><img alt="물품 ${requestScope.orderation.productName}"
		src="/HealthJJang/ect/${requestScope.orderation.imageName}"></td>
			<td>${requestScope.orderation.productName}</td>
			<td>${requestScope.orderation.buyerName }</td>
			<td>${requestScope.orderation.phone1} - ${requestScope.orderation.phone2} - ${requestScope.orderation.phone3}</td>
			<td>${requestScope.orderation.orderationAddress}</td>
			<td>${requestScope.orderation.postalNumber }</td>
			<td>${requestScope.orderation.orderationPrice }</td>
			<td>${requestScope.orderation. productAmount}</td>
			<td>${requestScope.orderation.code }</td>
			<c:if test="${requestScope.amount != null }">
			<td>${requestScope.amount }</td>
			</c:if>
		</tr>

	</tbody>
</table ><br>
<form action="/HealthJJang/updateOrderation.do" id="list">
<input type="hidden" name="orderationNo" value="${requestScope.orderation.orderationNo}">
<input type="submit" value="수정">
&nbsp;&nbsp;&nbsp;<button id="deleteBtn">삭제</button>
</form>