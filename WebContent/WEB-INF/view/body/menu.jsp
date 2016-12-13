<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page  contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<title></title>

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
				<li class="navi_set">  
						<div class="topnav" onclick="top.location.href='mainguest1.do';" >STUBBORN</div>
						<ul class="subnav">  
						</ul>  
					</li>
					<li class="navi_set">  </li><!-- 공백을 위함 -->
					<li class="navi_set">  </li> 
					
			

					<li class="navi_set">  
						<div class="topnav" onclick="top.location.href='main4.do';" >INTRODUCE</div>
						<ul class="subnav"> 
							<li onclick="top.location.href='main4.do';">소개</li> 
							<li onclick="top.location.href='main1.do';">이용 안내</li>  
							<li onclick="top.location.href='main3.do';">오시는 길</li> 
						</ul>  
					</li>
					
						<li class="navi_set">  </li>  
					
					
					<li class="navi_set">  
						<div class="topnav" onclick="top.location.href='main2.do';">FACILITY</div>
						<ul class="subnav">
							<li onclick="top.location.href='main2.do';">시설 안내</li>
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
								<li onclick="top.location.href='/HealthJJang/ViewList.do?code=D';">기구</li>  
								<li onclick="top.location.href='/HealthJJang/ViewList.do?code=E';">운동복</li>  
								<li onclick="top.location.href='/HealthJJang/ViewList.do?code=F';">영양제</li>  
							
							<c:if test="${not empty sessionScope.managerID}">
								<c:if test="${not empty sessionScope.managerPW}">
							
									<li onclick="top.location.href='/HealthJJang/addItemController.do';">등록</li>  
								</c:if>
							</c:if>
						</ul>  
					</li>
					
					<li class="navi_set">  </li> 

					<li class="navi_set">  
						<div class="topnav">SERVICE</div>
						<ul class="subnav">  
							<li onclick="top.location.href='BoardList.do?page=1.do';">공용게사판</li>  
							<li onclick="top.location.href='QAList.do';">자주묻는 질문</li> 
							<li onclick="top.location.href='operationBoardList.do';">공지사항게시판</li>  
						</ul>  
					</li> 

				</div>
			</div>
	</div>
</div>  
</font>
</body>
</html>
