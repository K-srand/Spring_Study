<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

     <div id="header">
        <tiles:insertAttribute name="header"/>
     </div>
     <div id="index">
         <tiles:insertAttribute name="index"/>
     </div>
     <div id="footer">
         <tiles:insertAttribute name="footer"/>
     </div>
      
</body>
</html>