
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="/HealthJJang/scripts/jquery.js"></script>
<script>

function logout(){
	location.href = "/HealthJJang/logout.do";
}
</script>


<c:choose>
<c:when test="${requestScope.order == null}">
<span style="color:blue;font-size:large;">등록된 제품이없습니다.</span>
</c:when>
<c:otherwise>
<c:choose>
<c:when test="${sessionScope.member == null}">
${sessionScope.ordername} 님의 주문 목록입니다.
<table>
<thead>
<tr>
<td>주문번호  </td>
<td>제품사진</td>
<td>제품이름</td>
<td>수량</td>
<td>주문상태</td>
</tr>
</thead>
<tbody>
<c:forEach items="${requestScope.order}" var="item">
<tr><td>${item.orderationNo}</td>

<c:forEach items="${item.orderation}" var = "inItem">
	<td><img alt="물품 ${inItem.productName}"
		src="/HealthJJang/ect/${inItem.imageName}"></td>
<td><a href="/HealthJJang/ViewOneOrder.do?no=${item.orderationNo}">${inItem.productName }</a></td>
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
</tr>

</c:forEach>
</tbody>
</table>
</c:when>
<c:otherwise>
${sessionScope.member.memberName } 님의 주문 목록입니다.
<table>
<thead>
<tr>
<td>주문번호  </td>
<td>제품사진</td>
<td>제품이름</td>
<td>수량</td>
<td>주문상태</td>
</tr>
</thead>
<tbody>
<c:forEach items="${requestScope.order}" var="item">
<tr><td>${item.orderationNo}</td>

<c:forEach items="${item.orderation}" var = "inItem">
	<td><img alt="물품 ${inItem.productName}"
		src="/HealthJJang/ect/${inItem.imageName}"></td>
<td><a href="/HealthJJang/ViewOneOrder.do?no=${item.orderationNo}">${inItem.productName }</a></td>
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
</tr>

</c:forEach>
</tbody>
</table>
</c:otherwise>
</c:choose>

</c:otherwise>
</c:choose>
<button onclick="logout()" >로그아웃</button>

