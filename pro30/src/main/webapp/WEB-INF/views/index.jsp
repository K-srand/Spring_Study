<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
  <c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

  <!--메인 이미지 들어가는 곳 시작 --->
  <div class="clear"></div>
  <div id="main_img">
    <img src="${contextPath}/resources/images/main_img.jpg" >    
  </div>
  <!--메인 이미지 들어가는 곳 끝--->

  <div class="clear"></div>   

  <div id="front">   
    <h2> New Item</h2>     
    <div id="bestProduct">         
      <c:forEach items="${newProductList }"  var="productVO">
        <div id="item">
          <a href=
"NonageShop?command=product_detail&pseq=${productVO.pseq}">
            <img src="${contextPath}/resources/product_images/${productVO.image}" />
            <h3> ${productVO.name} </h3>    
            <p>${productVO.price2} </p>
          </a>    
        </div>
      </c:forEach>      
    </div>
   <div class="clear"></div>
     
    <h2> Best Item</h2>     
      <div id="bestProduct">         
        <c:forEach items="${bestProductList}"  var="productVO">
          <div id="item">
           <a href=
"NonageShop?command=product_detail&pseq=${productVO.pseq}">
             <img src="${contextPath}/resources/product_images/${productVO.image}" />
           <h3> ${productVO.name} </h3>    
           <p>${productVO.price2} </p>
        </a>  
      </div>
    </c:forEach>      
  </div>
  <div class="clear"></div>
  </div>
 