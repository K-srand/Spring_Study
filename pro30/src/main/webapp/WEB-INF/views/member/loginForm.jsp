<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
  isELIgnored="false"
  %>
<%
  request.setCharacterEncoding("UTF-8");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>  

<tiles:insertAttribute name="header"/>

<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%@ include file="sub_img.html"%> 
<%@ include file="sub_menu.html" %>   

  <article>
    <h1>Login</h1>
    <form method="post" action="${contextPath}/member/login.do">
        <fieldset>
        <legend></legend>
	          <label>User ID</label>
	          <input name="id" type="text" ><br> 
	          <label>Password</label> 
	          <input name="pwd" type="password" value="1111"><br> 
        </fieldset>
        <div class="clear"></div>
        <div id="buttons">
            <input type="submit" value="로그인" class="submit">
            <input type="button" value="회원가입" class="cancel"
                 onclick="location=''"> 
        </div>
    </form>  
  </article>
 
<tiles:insertAttribute name="footer"/>

