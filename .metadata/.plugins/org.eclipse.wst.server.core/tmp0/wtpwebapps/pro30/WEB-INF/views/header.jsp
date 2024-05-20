<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
  isELIgnored="false"
  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  

<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<head>
  <meta charset="UTF-8">
  <title>Nonage Shop</title>
	  <link href="${contextPath}/resources/css/shopping.css" rel="stylesheet">  
	  <script type="text/javascript" src="${contextPath}/resources/member/member.js"></script>
	  <script type="text/javascript" src="${contextPath}/resources/mypage/mypage.js"></script> 
</head>

  <body>

	<div id="wrap">
	<!--헤더파일 들어가는 곳 시작 -->
	  <header>
	    <!--로고 들어가는 곳 시작--->  
	    <div id="logo">
	      <a href="${contextPath}/Nonage.do">
	        <img src="${contextPath}/resources/images/logo.gif" width="180" height="100" alt="nonageshop">
	      </a>  
	    </div>
	    <!--로고 들어가는 곳 끝-->     
	    <nav id="catagory_menu">
	     <ul>
	       <c:choose>
	       <c:when test="${empty sessionScope.loginUser}">
	       <li>         
	         <a href="${contextPath}/member/loginForm.do" style="width:110px;">LOGIN(CUSTOMER</a>   
		     <a href="NonageShop?command=admin_login_form" style="width:100px;">| ADMIN)</a>
		   </li>		       
	       <li>/</li>
	       <li><a href="${contextPath}/contract.do">JOIN</a></li>
	       </c:when>
	       <c:otherwise>
	       <li style="color:orange">
	         ${sessionScope.loginUser.name}(${sessionScope.loginUser.id})
	       </li>
	       <li><a href="${contextPath}/logout.do">LOGOUT</a></li>
	       </c:otherwise>       
	       </c:choose>
	       <li>/</li>
	       <li>
	         <a href="${contextPath}/cart_list.do">CART</a>
	       </li><li>/</li>
	       <li>
	         <a href="${contextPath}/mypage.do">MY PAGE</a>
	       </li><li>/</li>
	       <li>
	         <a href="${contextPath}/qna_list.do">Q&amp;A(1:1)</a>
	       </li>
	     </ul>
	    </nav>
	
	    <nav id="top_menu">
	      <ul>
	        <li>
	          <a href="NonageShop?command=catagory&kind=1">Heels</a>
	        </li>  
	        <li>
	          <a href="NonageShop?command=catagory&kind=2">Boots</a>
	        </li>  
	        <li>
	          <a href="NonageShop?command=catagory&kind=3">Sandals</a>
	        </li> 
	        <li>
	          <a href="NonageShop?command=catagory&kind=4">Sneakers</a>
	        </li> 
	        <li>
	          <a href="NonageShop?command=catagory&kind=5">On Sale</a>
	        </li>  
	      </ul>
	    </nav>
	    <div class="clear"></div>
	    <hr>
	  </header>
	  <!--헤더파일 들어가는 곳 끝 -->