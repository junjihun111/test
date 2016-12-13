<%@ page contentType="text/html; charset=UTF-8"%>
<!-- tiles 설정을 호출할 tiles 제공 Tag 라이브러리 등록 -->
<%@ taglib prefix="titles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



<style type="text/css">
header{
	background-color:black;
	text-align:center;
}html,body {
margin: 0;
padding: 0;
}div {
border: 0px solid #000000;
-moz-box-sizing: border-box; /* Firefox  */
-webkit-box-sizing: border-box; /* Safari */
box-sizing: border-box; /* CSS3 Standard */
}div#box {
height: 130%;
}main{
	text-align:center;
}
nav{
	line-height: 50px;
	background-color:lightgray;
	padding: 15px;
	min-height:700px;
	width:250px;
	float:left;
}
section{
	padding: 15px;
	min-height:400px;
	float:left;
}
footer{
	background-color:#3f3d3d;
	padding-top:15px;
	text-align:center;
	height:50px;
	clear:both;
	margin-top: 8px;
}
</style>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="http://malsup.github.com/jquery.cycle2.js"></script> 

<style>
.cycle-slideshow, .cycle-slideshow * { -webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box; }


.cycle-slideshow { position: relative;
    background: url(http://malsup.github.com/images/spinner.gif) no-repeat;

 }


.cycle-slideshow img { 

    position: absolute;
    width: 100%; display: block; height: 430px;
}



.cycle-slideshow img:first-child {
    position: static; z-index: 100;
}

/* pager */
.cycle-pager { 
    text-align: center; width: 100%; z-index: 500; position: absolute; top: 81%; overflow: hidden;
}

.cycle-pager span { 
    font-family: arial; font-size: 50px; width: 16px; height: 16px; 
    display: inline-block; color: #ddd; cursor: pointer; 
}
.cycle-pager span.cycle-pager-active { color: #D69746;}
.cycle-pager > * { cursor: pointer;}


/* caption */
.cycle-caption { position: absolute; color: white; bottom: 15px; right: 15px; z-index: 700; }



.cycle-overlay { 
    font-family: tahoma, arial;
    position: absolute; bottom: 0; width: 100%; z-index: 600;
    background: black; color: white; padding: 15px; opacity: .5;
}



.cycle-prev, .cycle-next { position: absolute; top: 0; width: 30%; opacity: 0; filter: alpha(opacity=0); z-index: 800; height: 100%; cursor: pointer; }
.cycle-prev { left: 0;  background: url(http://malsup.github.com/images/left.png) 50% 50% no-repeat;}
.cycle-next { right: 0; background: url(http://malsup.github.com/images/right.png) 50% 50% no-repeat;}
.cycle-prev:hover, .cycle-next:hover { opacity: .7; filter: alpha(opacity=70) }


/* 미디어 쿼리 */
/* only 부정키워드 and 논리키워드 */
@media only screen and (max-width: 480px), only screen and (max-device-width: 480px) {
    .cycle-slideshow { width: 200px;}
    .cycle-overlay { padding: 4px }
    .cycle-caption { bottom: 4px; right: 4px }
}
</style>
</head>
<body>

	<header id="box">
	<!-- name=header : put-attribute name이 header 로 설정된 jsp 를 이자리에 포함시켜라. -->
		<titles:insertAttribute name="header"/>
	
	
	<%-- <nav>
		<titles:insertAttribute name="nav"/>
	</nav> 
	 --%>

		<jsp:include page="/WEB-INF/view/body/menu.jsp"/>

	<div class="cycle-slideshow" data-cycle-fx=scrollHorz data-cycle-timeout=5000>
	<div class="cycle-pager"></div>
	
	<img src="gallery/kk1.jpg" height="300px">
	<img src="gallery/kk2.jpg" height="300px">
	<img src="gallery/kk3.jpg" height="300px">
	</div>

	</header>


	
	<div>
		<titles:insertAttribute name="body"/>	
	</div>
	
	
	<footer>
		<titles:insertAttribute name="footer"/>
	</footer> 
</body>
</html>


