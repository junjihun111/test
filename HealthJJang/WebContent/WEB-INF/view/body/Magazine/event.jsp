<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css?20160824" />
<meta charset="UTF-8">
<title>Insert title here</title>












	

<style type="text/css">

* {padding:0;margin:0;}  

li {list-style:none;}  

a {text-decoration:none;color:#000;}  

.hoverFilter > span {display:inline-block;position:relative;} 

.hoverFilter img {vertical-align:top;} 

.hoverFilter:hover > span:before {content:"";position:absolute;width:100%;height:100%;background-color:rgba(128,245,255,0.5)} 

.hoverFilter div {padding:10px 20px;} 

.hoverFilter strong {display:block;} 


#align{

/* width: 40%; */
text-align: center;

}

#content{
margin:0 auto;
width: 2200px;
text-align: center;

}
/* img {border: none;} */



table, td{
padding: 10px;
border: 0px solid skyblue;
/*  border-spacing: 20px 10px; */
font-weight:bolder;
font-family:cursive; /*글씨 이쁘게 가꿔줌  */
color:navy;
font-size: 20px;
table-layout: fixed;
border-style: outset; /*테이블 선  */
border-collapse:collapse;
overflow: hidden;
text-overflow: ellipsis;
white-space: nowrap;
/* width: 100px; */
text-align: left;
 width: 70%;
 height: 30px;
	


}

caption{
height: 60px;
 font-size: 1.5em;
    font-weight: bold;
    text-align: center;
    line-height: 52px;
    border-bottom: 5px solid #FFF;
    -webkit-border-radius: 8px 8px 0 0;
    -moz-border-radius: 8px 8px 0 0;
    border-radius: 8px 8px 0 0;
    background: SlateGray ;
    border-spacing: 50px;

}

caption:before {
    content: '';
    display: block;
    height: 8px;
    -webkit-border-radius: 8px 8px 0 0;
    -moz-border-radius: 8px 8px 0 0;
    border-radius: 8px 8px 0 0;
    background-color: Lavender ;
}


a {
text-decoration: none;
color: navy;

}

a:hover{
text-decoration: underline;

color: red;
}

image{
width: 270px;
height: 180px;
vertical-align: top;
}















#a{

}

font{
font-size: 10px;
}
</style>
</head>

<body>




















<jsp:include page="/WEB-INF/view/body/magazinemenu.jsp"/>



<div align="center" id="align">
<div align="center" id="content">
<hr>
<div  style="text-align:center" >



 <table style= "margin:0 ,	 auto;">

 <caption>각종 헬스장 이벤트 정보
</caption>
<tr>

	<td>  <a href="eventview.do" class="hoverFilter"><span><img src="IMAGE/꼬북이.jpg" width="400" height="300"></span></a></td>
	<td>  <a href="eventview.do" class="hoverFilter"><span><img src="IMAGE/파이리.jpg" width="400" height="300"></span></a></td>
	<td>  <a href="eventview.do" class="hoverFilter"><span><img src="IMAGE/이상해씨.jpg" width="400" height="300"></span></a></td> 
</tr>
	<tr>
		<td><a href="eventview4.do" style="border:5px  #ccc;padding-bottom:10px;">팬텀에 빠르고 강한 운동방법</a><p><font>2010-03-12</font></td>
		<td><a href="eventview5.do" style="border:5px  #ccc;padding-bottom:10px;">피카츄에 기구할인법</a><p><font>2011-03-12</font></td>
		<td><a href="eventview6.do" style="border:5px  #ccc;padding-bottom:10px;"> 근육몬에 절대고수 운동법</a><p><font>1960-05-16</font></td>

	</tr>


</table>



 <div    style="text-align:center">
<table   style="margin:0, auto;">


<tr>
		<td>  <a href="eventview.do" class="hoverFilter"><span><img src="IMAGE/팬텀.jpg" width="400" height="300"></span></a> </td> 
		<td>  <a href="eventview.do" class="hoverFilter"><span><img src="IMAGE/피카츄.jpg" width="400" height="300"></span></a> </td> 
		<td>  <a href="eventview.do" class="hoverFilter"><span><img src="IMAGE/근육몬.jpg" width="400" height="300"></span></a> </td> 

</tr>
		<tr>
		<td><a href="eventview4.do" style="border:5px  #ccc;padding-bottom:10px;">팬텀에 빠르고 강한 운동방법</a><p><font>1979-12-12</font></td>
		<td><a href="eventview5.do" style="border:5px  #ccc;padding-bottom:10px;">피카츄에 기구할인법</a><p><font>1950-06-25</font></td>
		<td><a href="eventview6.do" style="border:5px  #ccc;padding-bottom:10px;"> 근육몬에 절대고수 운동법</a><p><font>1960-05-16</font></td>

	</tr>

	
	
</table>
</div>
</div>
</div> 
</div>

</body>
</html>
