<%@page import="org.gori.dto.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="generator" content="Mobirise v3.8.1, mobirise.com">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="assets/images/logo.png" type="image/x-icon">
<meta name="description" content="">
 
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic&amp;subset=latin">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">
<link rel="stylesheet" href="assets/et-line-font-plugin/style.css">
<link rel="stylesheet" href="assets/bootstrap-material-design-font/css/material.css">
<link rel="stylesheet" href="assets/tether/tether.min.css">
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/socicon/css/socicon.min.css">
<link rel="stylesheet" href="assets/animate.css/animate.min.css">
<link rel="stylesheet" href="assets/theme/css/style.css">
<link rel="stylesheet" href="assets/mobirise-gallery/style.css">
<link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">

<title>Insert title here</title>
</head>
<style>
    .submenu ul li{
        width: 25%;
        height: 80px;
        float: left;
        list-style: none;
        background: white;
        border: 1px solid darkgray;
        margin-bottom: 60px;
        margin-top: 40px;

    }
    .boards{
        padding: 0px;
        background: white;
        border: 1px outset gainsboro;
        margin: 0.5%;
    }
    .BoardImg{
        overflow: hidden;
    }
    .title{
        background: white;
        height: 80px;
    }
    .tag{
        background: white;
        height: 50px;
        border: 1px solid gainsboro;
    }
</style>
<body style="background: ghostwhite">
<section class="mbr-section" id="form2-c" style="background-color: rgb(90, 46, 46); padding-top: 30px; padding-bottom: 30px;">

        <div class="container">

        </div>

    <div class="mbr-section mbr-section-nopadding">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-lg-10 col-lg-offset-1" data-form-type="formoid">
                    <form class="mbr-form" action="https://mobirise.com/" method="post" data-form-title="SUBSCRIBE FORM">
                        <div class="mbr-subscribe mbr-subscribe-dark input-group">
                            <input type="email" class="form-control" name="email" required="" data-form-field="Email" placeholder="Enter Your Email Address..." id="form2-c-email">
                            <span class="input-group-btn"><button type="submit" class="btn btn-primary">SUBSCRIBE</button></span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<div class="col-xs-12 col-md-12">
    <!-- Filter -->
    <div class="container submenu">
        <ul >
            <li><a href="boardWrite.board">글쓰기</a></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>

    </div>

    <!-- Gallery -->	
	    <div class="col-xs-12 col-md-12 ">
		    <c:forEach items="${list}" var="Board">	
		        <div class="col-xs-12 col-md-3 boards">
		            <div class="BoardImg">
		                <img width="100%" src="C:\eclipse-jee-neon-R-win32-x86_64\eclipse\BoardImg\Chrysanthemum.jpg">
		            </div>
		            <div class="col-xs-12 col-md-12 title">
		                <h3>${Board.title}</h3>
		            </div>
		            <div class="col-xs-12 col-md-12 tag">
		                <p>${Board.tags}</p>
		            </div>
		        </div>
		     </c:forEach>	
	    </div>
	


</div>


  <script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/tether/tether.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/smooth-scroll/SmoothScroll.js"></script>
  <script src="assets/viewportChecker/jquery.viewportchecker.js"></script>
  <script src="assets/masonry/masonry.pkgd.min.js"></script>
  <script src="assets/imagesloaded/imagesloaded.pkgd.min.js"></script>
  <script src="assets/bootstrap-carousel-swipe/bootstrap-carousel-swipe.js"></script>
  <script src="assets/theme/js/script.js"></script>
  <script src="assets/mobirise-gallery/script.js"></script>
  <script src="assets/formoid/formoid.min.js"></script>


  <input name="animation" type="hidden">
  </body>
</html>

