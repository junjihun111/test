<%@ page contentType="text/html; charset=UTF-8"%>
</head>
<style>
@font-face{
   font-family:'NanumGothic';
   src: url(font/NanumFont_TTF_ALL/NanumGothic.ttf) format('truetype');
}
#t1{font-size: 50px; color: gray; font-family: arial; font-weight: bold;}
#tt1{margin-top:5%; margin-bottom: 5%; text-align: center;}

img{width: 400px; height: 300px;  border-radius: 10px;}
  
  #left12{  display: inline-block; position: relative; z-index: 2; margin-left: 5%; margin-bottom: 5%; 
  margin-left: 5%; }
  
  
    #right12{  display: inline-block; position: relative; z-index: 2; margin-left: 5%; margin-bottom: 5%; 
  margin-left: 5%;}
 
 #gallery11{display: inline-block; transform: rotate(-5deg);  margin-left: 5%; margin-bottom: 5%; 
  margin-left: 5%;}
  
 #gallery13{display: inline-block; transform: rotate(5deg);  margin-left: 5%; margin-bottom: 5%; 
  margin-left: 5%;}
 
#left12:after{
 position: absolute;
  content: "";
  box-shadow: 0 15px 10px rgba(0,0,0, 1.5); /* 그림자효과 */
  transform: rotate(3deg); /* 회전효과 */
  right: 5px;
  left: auto;
  top: auto;
  bottom: 15px;
  z-index: -1;
  width: 50%;
  height: 20%;
}
#right12:after{
 position: absolute;
  content: "";
  box-shadow: 0 15px 10px rgba(0,0,0, 1.5); /* 그림자효과 */
  transform: rotate(3deg); /* 회전효과 */
  right: 5px;
  left: auto;
  top: auto;
  bottom: 15px;
  z-index: -1;
  width: 50%;
  height: 20%;
}


#rightFont{margin-left: 5%; color: gray; font-weight: bold; font-size: 30px;}
#righTle{margin-bottom: 5%; margin-top: 5%; }

#left{margin-left: 15%}
#leftFont{margin-right: 40%; color: gray; font-weight: bold; font-size: 30px;}
#leftTle{margin-bottom: 5%; margin-top: 5%; }

body{
font-family: NanumGothic;
}

#f1{color: gray; font-weight: bold; font-size: 30px;}

#div1{margin-right: 80%}
</style>
<body>
<div id="div1">
      <font id="main4font" onclick="top.location.href='mainguest1.do';">HOME</font>
      &nbsp; > &nbsp;
       <font id="main4font" onclick="top.location.href='main2.do';">STUBBORN 갤러리</font>
</div>
<div id="gallery">
<div id="tt1">
<font id="t1">STUBBORN 갤러리</font>
</div>
<div id="gallery11">
<div id="right12"><img src="gallery/1.jpg" align="right"></div>
</div>
<div id="gallery13">
<div id="left12"><img src="gallery/2.jpg" align="left"></div>
</div>
<br>
<div id="gallery13">
<div id="right12"><img src="gallery/4.jpg" align="right"></div>
</div>
<div id="gallery11">
<div id="left12"><img src="gallery/5.jpg" align="left"></div>
</div>
<div style="margin-top: 5%" ></div>
<font id="f1">찜질 and 샤워장 시설을 갖추고 있습니다.</font>
</div>


<br>
<hr>
      <div style="margin-bottom: 1.5%; text-align: center;">
      <a href="main2.do">△ 위로 가기 △</a>
      </div>
</body>
</html>