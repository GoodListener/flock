<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Flock | 양떼</title>
<link rel="stylesheet" type="text/css" href="./css/base.css">
<link rel="stylesheet" type="text/css" href="./css/common.css">
</head>
<body>
<div class="container">
  <jsp:include page="../common/header.jsp">
    <jsp:param value="doodle" name="active"/>
  </jsp:include>
  <div class="contentWrapper">
    <div class="newImage">+</div>
    <div class="imageListWrapper">
      <ul class="imageList">
      <c:forEach items="${doodleList}" var="doodle">
        <li class="imageBox">
        </li>
      </c:forEach>
      </ul>
    </div>
  </div>
</div>
</body>
</html>