<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page  contentType="text/html; charset=UTF-8" %>
<title>드롭 다운 메뉴</title>

<link type="text/css" href="./css/style.css" rel="stylesheet" />

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	$(document).ready(function(){  
	  
		$(".topnav").hover(function() { //마우스를 topnav에 오버시
			$(this).parent().find(".subnav").slideDown('normal').show(); //subnav가 내려옴.
			$(this).parent().hover(function() {  
			}, function(){  
				$(this).parent().find(".subnav").slideUp('fast'); //subnav에서 마우스 벗어났을 시 원위치시킴  
			});  
		});  
	  
	});  
</script>

</head>

<body>
<font>
<div id="wrap">
	<div id="header">
		<div id="logo"></div>
			<div class="navi_bg">
				<div class="nav">

					<li class="navi_set">  </li><!-- 공백을 위함 -->
					<li class="navi_set">  </li> 
					<li class="navi_set">  </li>
					<li class="navi_set">  </li> 

					<li class="navi_set">  
						<div class="topnav" onclick="top.location.href='main4.do';" >INTRODUCE</div>
						<ul class="subnav">  
							<li onclick="top.location.href='main1.do';">GUIDE</li>  
							<li onclick="top.location.href='main3.do';">DIRECTIONS</li> 
						</ul>  
					</li>
					
						<li class="navi_set">  </li>  
					
					
					<li class="navi_set">  
						<div class="topnav" onclick="top.location.href='main2.do';">FACILITY</div>
						<ul class="subnav">  
						</ul>  
					</li> 
					
						<li class="navi_set">  </li> 
					
					<li class="navi_set">  
						<div class="topnav" onclick="top.location.href='event.do';">MAGAZINE</div>
						<ul class="subnav">  
								<li onclick="top.location.href='event.do';">EVENT</li>  
							    <li onclick="top.location.href='HealthInformation.do';">HEALTHINFORM</li>
						</ul>  
					</li> 
					
					<li class="navi_set">  </li> 
				
					<li class="navi_set">  
						<div class="topnav">SHOPPING</div>
						<ul class="subnav">  
						</ul>  
					</li>
					
					<li class="navi_set">  </li> 

					<li class="navi_set">  
						<div class="topnav">SERVICE</div>
						<ul class="subnav">  
							<li>menu</li>  
							<li>menu</li> 
							<li>menu</li>  
						</ul>  
					</li> 

				</div>
			</div>
	</div>
</div>  
</font>
</body>
</html>
