<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">
<title>Insert title here</title>
</head>
<script src="http://code.jquery.com/jquery.js"></script>
<script>
    $(document).ready(function () {
        
        $('#signUpButton').click(function(){
        	var str=$('#signUp').serialize();
            
        	$.ajax({
                type:"POST",
                url:"signUp.login",
                contentType: "application/x-www-form-urlencoded; charset=utf-8",
                datatype:"json",
                data:str,
                success:function (data) {
                	console.log(data);
                    if(data=="err101901"){
                    	$('#idcheck').text("이미 사용중인 아이디가 있습니다");
                    }                   
                    else{                    	
                    	self.location="boardList.board";                        
                    }
                    
                },
                error:function (e) {
                    alert("에러발생");
                }
                
            });     	
        	
        })
    });
</script>
<style>
    .signIn{
        position: relative;
        top: 25PX;
        font-size: 100%;
        padding: 0;
        height: 50px;
    }
</style>
<body>
<section class="mbr-section" style="background-color: rgb(0, 255, 255); padding-top: 50px; padding-bottom: 50px;">


            <div class="row">

                    <div class="col-xs-12 col-md-8 row row-sm-offset">

                    </div>
                    <div class="col-xs-12 col-md-4 row row-sm-offset">
                        <div class="col-xs-12 col-md-5">
                            <div class="form-group">
                                <label class="form-control-label" for="form1-b-name">Name<span class="form-asterisk">*</span></label>
                                <input type="text" class="form-control" name="name" required="" data-form-field="Name" id="form1-b-name">
                            </div>
                        </div>

                        <div class="col-xs-12 col-md-5">
                            <div class="form-group">
                                <label class="form-control-label" for="form1-b-email">Email<span class="form-asterisk">*</span></label>
                                <input type="email" class="form-control" name="email" required="" data-form-field="Email" id="form1-b-email">
                            </div>
                        </div>
                        <div class="col-xs-12 col-md-2">
                            <button class="col-xs-12 col-md-12 btn btn-primary signIn">Sign Up</button>
                        </div>

                    </div>

            </div>


</section>
<section class="mbr-section" id="form1-b" style="background-image: rgb(255, 255, 255); padding-top: 120px; padding-bottom: 120px;">
    

    <div class="mbr-section mbr-section-nopadding">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-lg-10 col-lg-offset-1" data-form-type="formoid">

                    <form id="signUp">

                        <div class="mbr-section mbr-section__container mbr-section__container--middle">
                            <div class="container">
                                <div class="row">
                                    <div class="col-xs-12 text-xs-center">
                                        <h3 class="mbr-section-title display-2">가입하세요</h3>
                                        <h5 class="mbr-section-subtitle">항상 지금처럼 무료로 즐기실 수 있습니다.</h5>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-12 col-md-6 row row-sm-offset">
                            <h5>항상 지금처럼 무료로 즐기실 수 있습니다.</h5>
                        </div>

                        <div class="col-xs-12 col-md-6 row row-sm-offset">

                            <div class="col-xs-12 col-md-12">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-b-name">이름<span class="form-asterisk">*</span></label>
                                    <input class="form-control" name="name" >                                    
                                </div>
                            </div>

                            <div class="col-xs-12 col-md-12">
                                <div class="form-group">
                                    <label class="form-control-label" for="form1-b-email">나이<span class="form-asterisk">*</span></label>
                                    <input class="form-control" name="age" >
                                </div>
                            </div>

                            <div class="col-xs-12 col-md-12">
                                <div class="form-group">
                                    <label class="form-control-label" >이메일</label>
                                    <input class="form-control" name="email" >
                                </div>
                            </div>
                            <div class="col-xs-12 col-md-12">
                                <div class="form-group">
                                    <label class="form-control-label" >아이디</label>
                                    <input class="form-control" name="signUpId" >
                                    <p id="idcheck"></p>
                                </div>
                            </div>
                            <div class="col-xs-12 col-md-12">
                                <div class="form-group">
                                    <label class="form-control-label" >비밀번호</label>
                                    <input class="form-control" name="signUpPassword" >
                                </div>
                            </div>
                            <div class="col-xs-12 col-md-12">
                                <button id="signUpButton" class="col-xs-12 col-md-12 btn btn-primary">Sign Up</button>
                            </div>

                        </div>

                    </form>
                    <div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>


  <section class="engine"><a rel="external" href="https://mobirise.com">best web site design software download</a></section><script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/tether/tether.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/smooth-scroll/SmoothScroll.js"></script>
  <script src="assets/viewportChecker/jquery.viewportchecker.js"></script>
  <script src="assets/theme/js/script.js"></script>
  <script src="assets/formoid/formoid.min.js"></script>
  
  
  <input name="animation" type="hidden">
  </body>
</html>