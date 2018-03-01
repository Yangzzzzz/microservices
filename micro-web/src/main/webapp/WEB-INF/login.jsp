<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap core CSS -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
	
	<!-- Font Awesome -->
	<link href="css/font-awesome.min.css" rel="stylesheet">
	
	<!-- Endless -->
	<link href="css/endless.min.css" rel="stylesheet">

  </head>

  <body>
	<div class="login-wrapper">
		<div class="text-center">
			<h2 class="fadeInUp animation-delay8" style="font-weight:bold">
				<span class="text-success">Zgnay</span> <span style="color:#ccc; text-shadow:0 1px #fff">System</span>
			</h2>
		</div>
		<div class="login-widget animation-delay1">	
			<div class="panel panel-default">
				<div class="panel-heading clearfix">
					<div class="pull-left">
						<i class="fa fa-lock fa-lg"></i> 登录
					</div>

					<div class="pull-right">
						<span style="font-size:11px;">没有账号?</span>
						<a class="btn btn-default btn-xs login-link" href="<c:url value="/register/view" />" style="margin-top:-2px;"><i class="fa fa-plus-circle"></i> 注册</a>
					</div>
				</div>
				<div class="panel-body">
					<form class="form-login" method="post" id="login_form" action="<c:url value='/login'/>" f>
						<div class="form-group">
							<label>用户名</label>
							<input type="text" placeholder="Username" name = "name" class="form-control input-sm bounceIn animation-delay2" >
						</div>
						<div class="form-group">
							<label>密码</label>
							<input type="password" placeholder="Password"  name = "password" class="form-control input-sm bounceIn animation-delay4">
						</div>
						<div class="form-group">
							<label class="label-checkbox inline">
								<input type="checkbox" class="regular-checkbox chk-delete" />
								<span class="custom-checkbox info bounceIn animation-delay4"></span>
							</label>
							记住我
						</div>
                        ${resultMsg!=null?'<font color = "red" >账号或密码错误，请重新登录！</font>':''}
						<div class="seperator"></div>
					<%--	<div class="form-group">
							Forgot your password?<br/>
							Click <a href="#">here</a> to reset your password
						</div>--%>

						<hr/>
							
						<a class="btn btn-success btn-sm bounceIn animation-delay5 login-link pull-right" onclick="$('#login_form').submit();"><i class="fa fa-sign-in"></i> Sign in</a>
                        <%--<button class="btn btn-success btn-sm bounceIn animation-delay5 login-link pull-right" type="submit"><i class="fa fa-sign-in"></i> Sign in</button>--%>
					</form>
				</div>
			</div><!-- /panel -->
		</div><!-- /login-widget -->
	</div><!-- /login-wrapper -->

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
    <!-- Jquery -->
	<script src="js/jquery-1.10.2.min.js"></script>
    
    <!-- Bootstrap -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
   
	<!-- Modernizr -->
	<script src='js/modernizr.min.js'></script>
   
    <!-- Pace -->
	<script src='js/pace.min.js'></script>
   
	<!-- Popup Overlay -->
	<script src='js/jquery.popupoverlay.min.js'></script>
   
    <!-- Slimscroll -->
	<script src='js/jquery.slimscroll.min.js'></script>
   
	<!-- Cookie -->
	<script src='js/jquery.cookie.min.js'></script>

	<!-- Endless -->
	<script src="js/endless/endless.js"></script>
  </body>
</html>
