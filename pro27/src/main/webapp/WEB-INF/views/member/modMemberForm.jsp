<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정창</title>
<style>
   .text_center{
     text-align:center;
   }
   .id{
   	 background-color:lightgrey;
   }
</style>
</head>
<body>
<c:forEach var="member" items="${memberInfo}" >
	<form method="post"   action="${contextPath}/member/modMember.do">
	<h1  class="text_center">회원 정보 수정창</h1>
	<table  align="center">
		   
		   <tr>
		      <td width="200"><p align="right">아이디</td>
		      <td width="400"><input class="id" name="id" value='<c:out value="${member.id}"/>' readonly="readonly"></td>
		   </tr>
		   <tr>
		      <td width="200"><p align="right">비밀번호</td>
		      <td width="400"><input type="password" name="pwd" value='<c:out value="${member.pwd}"/>'></td>
		    </tr>
		    <tr>
		       <td width="200"><p align="right">이름</td>
		       <td width="400"><p><input type="text" name="name" value='<c:out value="${member.name}"/>'></td>
		    </tr>
		    <tr>
		       <td width="200"><p align="right">이메일</td>
		       <td width="400"><p><input type="text" name="email" value='<c:out value="${member.email}"/>'></td>
		    </tr>
		    <tr>
		       <td width="200"><p>&nbsp;</p></td>
		       <td width="400"><input type="submit" value="수정하기"><input type="reset" value="다시입력"></td>
		    </tr>
	    
	</table>
	</form>
</c:forEach>
</body>
</html>