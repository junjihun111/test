<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>

<style type="text/css">

a.jcm-top:hover{
background-color:#000
}

#align{
width: 100%;
text-align: center;
}

#content{
margin:0 auto;
width: 1750px;
text-align: left;
}

img
{
border: 1px solid;
width: 700px;
height: 700px;
} 


aside{
text-align: center;
}

a#MOVE_TOP_BTN {
    position: fixed;
    right: 2%;
    bottom: 50px;
    display: none;
    z-index: 999;
}

/* 맨위로가기 버튼 */
a.jcm-top {
    position: fixed;
    right: 15px;
    bottom: 15px;
    border-radius: 5px;
    color: #ffffff;
    text-align: center;
    width: 45px;
    height: 45px;
    font-size: 40px;
    /*background-color: rgba(50,50,50,0.5);*/
    background-color:#323232; opacity:0.5; filter:alpha(opacity=50); /*ie8 호환을 위한코드 위와 동일한 것임 호환필요없으면 한줄로 rgba적으면됨*/
    z-index: 999;
    display: none;
}a.jcm-top:hover{background-color:#000}

</style>

<script type="text/javascript">




</script>







<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>


</head>

<body>

 


<div id="align">
<div id="content">

<hr>

<div class="titleWrap">
	<h1>꼬부기운동법</h1>
</div>
<jsp:useBean id="toDay" class="java.util.Date" /> 
<fmt:formatDate value="${toDay}" pattern="yyyy-MM-dd" />
<hr>


<div style="text-align: center">
	<img alt="꼬부기" src="IMAGE/꼬북이.jpg"> <br>
	
<h2><font color="red">	대이벤트??            </font></h2>

<h2>언제나 한 발 먼저 앞서나가는 히트짐은<br></h2>

남들보다 여유롭게, 빨리 여름을 맞이하기 위한 특별한 프로모션을 진행하고 있습니다<br>
<br>
<br>
<br>
<h2><font color="bile">바로 ‘미리 준비하는 여름’</font></h2>
<br>
<br>
<br>
전 멤버십 5개월 권 단기출시가 됐는데요, 
<br>
<br>
<br>
출시기념 전 멤버십 파격 할인으로
<br>
<br>
<br>
히트인들에게 올 여름 당당히 벗을 수 있도록 도와드리고 있답니다!
<br>
<br>
<br>
<br>
<br>
<br> 
이 여름맞이 프로모션을 회원분들과 좀더 뜻깊고<br>
재밌게 전달하기 위해<br>
히트짐 여름맞이 회원 참여 이벤트 를 준비했습니다
<br>
<br>
<br>
어디에서 ? 인스타그램에서! <br>
<img alt="버터풀" src="http://hitgym.tcubemnet.com/static/datas/board/attach/images/2016/11/24/6e3ffef44e5a3fc99e699ab78b4e7306.jpg">

</div>

</div>
</div>


<!-- 맨위로 가기 이미지 버튼 시작 -->

<a href="#" class="jcm-top hidden-xs hidden-sm">
<i class="icon icon-angle-up"></i></a>

<script>

$( document ).ready( function() {

$( window ).scroll( function() {

if ( $( this ).scrollTop() > 200 ) {

$( '.jcm-top' ).fadeIn();

} else {

$( '.jcm-top' ).fadeOut();

}

} );

$( '.jcm-top' ).click( function() {

$( 'html, body' ).animate( { scrollTop : 0 }, 400 );

return false;

} );

} );

</script>

<!-- 맨위로 가기 이미지 버튼 끝 -->




</body>
</html>
