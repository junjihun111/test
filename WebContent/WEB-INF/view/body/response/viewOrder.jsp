
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
<c:when test="${sessionScope.member == null }">
${sessionScope.name} 님의 주문 목록입니다.
<table>
<thead>
<tr>
<td>주문번호 </td>
<td>제품이름</td>
<td>수량</td>
<td>주문상태</td>
</tr>
</thead>
<tbody>
<c:forEach items="${requestScope.order}" var="item">
<tr><td>${item.orderationNo}</td>

<c:forEach items="${item.orderation}" var = "inItem">
<td>${inItem.productName }</td>
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
</c:otherwise>
</c:choose>