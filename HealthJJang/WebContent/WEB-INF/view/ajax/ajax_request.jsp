<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- #jsonBtn 인 버튼 클릭시
Ajax 요청
요청url -/member/findById.do
요청방식 - POST
요청파라미터 - #id 인 input의 value
결과는 JSON 타입으로 받는다.
성공 - 함수등록
에러 - 함수등록. -->

<script type="text/javascript" src="/spring_mvc_04_ajax/scripts/jquery.js"> </script>
<script type="text/javascript">

$(document).ready(function(){
	$("#jsonBtn").on("click",function(){
		$.ajax({
			"url":"/spring_mvc_04_ajax/member/findById.do",
			"data": {"id" :$("#id").val()},
			"type":"POST",//요청방식(HTTP 메소드)
			"dataType":"json",
			"success":function(obj){
				//alert(obj);
				//alert(obj.name);
				//alert(obj);
				var txt="ID : " + obj.id + "<br>이름 :" + obj.name + "<br>나이:	"+obj.age+"<br>생일 :"+obj.birthday;
				$("#result").html(txt);
			},
			"error":function(){
				alert("오류발생");
			},
			"beforeSend":function(){
				if(! $("#id").val())
				{
					alert("조회할 ID 넣어라");
					return false;
				}
			}
			});
		});
	
	$("#listBtn").on("click",function(){
		$.ajax({
			"url":"/spring_mvc_04_ajax/member/getList.do",
			"type":"POST",//요청방식(HTTP 메소드)
			"dataType":"json",
			"success":function(obj){
				var txt=" ";
		
				$.each(obj,function(i){
					txt = txt + "<tr><td>" + obj[i].id + "</td><td>" + obj[i].name + "</td><td>" + obj[i].age + "</td><td>" + obj[i].birthday + "</td></tr>";
					$("#listTbody").html(txt);	
					
					/* i -> 뺀다면 this.id 로 만든다. */
				})
			},
			"error":function(){
				alert("오류발생");
			},
	
			});
		});
	});

</script>

</head>
<body>
<h2>Ajax 요청 페이지</h2>
<input type="text" id="id"><button id="jsonBtn">Ajax요청 Btn</button>
<p>
<div id="result"></div>
<button id="listBtn">목록 조회</button>
<hr>
<table border='1' style="width: 500px;">
	<thead>
		<tr>
			<td>ID</td>
			<td>이름</td>
			<td>나이</td>
			<td>생일</td>
		</tr>
	</thead>
	<tbody id="listTbody">
	</tbody>
</table>

</body>
</html>












