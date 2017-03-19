<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<div class="header">
	<div class="appTitle">
	  <p>Flock</p>
	  <img src="./svg/common/more.svg" class="menuIcon">
	</div>
	
	<nav class="mainMenu" style="display:none;">
	  <ul class="mainMenuList">
	    <li class="${param.active == 'main' ? 'mainMenuActive' : ''}"><a ${param.active == 'main' ? '' : 'href="main.do"'}>메인</a></li>
	    <li class="${param.active == 'user' ? 'mainMenuActive' : ''}"><a href="userList.do">유저</a></li>
	    <li class="${param.active == 'doodle' ? 'mainMenuActive' : ''}"><a href="doodle.do">낙서장</a></li>
	    <li class="${param.active == 'board' ? 'mainMenuActive' : ''}"><a href="board.do">게시판</a></li>
	  </ul>
	</nav>
</div>
