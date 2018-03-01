<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html >
  <head>
    <meta charset="utf-8">
    <title>Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap core CSS -->
    <link href="<c:url value = '/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet">

	<!-- Font Awesome -->
	<link href="<c:url value='/css/font-awesome.min.css'/>" rel="stylesheet">
	
	<!-- Endless -->
	<link href="<c:url value = '/css/endless.min.css'/>" rel="stylesheet">
	
  </head>

  <body>
	<div class="login-wrapper">
		<div class="text-center">
			<h2 class="fadeInUp animation-delay10" style="font-weight:bold">
				<span class="text-success">Zgnay</span> <span style="color:#ccc; text-shadow:0 1px #fff">Admin</span>
			</h2>
	    </div>
		<div class="login-widget animation-delay1">	
			<div class="panel panel-default">
				<div class="panel-heading">
					<i class="fa fa-plus-circle fa-lg"></i> Sign up
				</div>
				<div class="panel-body">
					<form class="form-login">
						<div class="form-group">
							<label>Username</label>
							<input type="text" placeholder="Username" class="form-control input-sm bounceIn animation-delay2" >
						</div><!-- /form-group -->
						<div class="form-group">
							<label>Password</label>
							<input type="password" placeholder="Password" class="form-control input-sm bounceIn animation-delay3">
						</div><!-- /form-group -->
						<div class="form-group">
							<label>Confirm Password</label>
							<input type="text" placeholder="Confirm password" class="form-control input-sm bounceIn animation-delay4">
						</div><!-- /form-group -->
						<div class="form-group">
							<label>Email Address</label>
							<input type="text" placeholder="Email address" class="form-control input-sm bounceIn animation-delay5">
						</div><!-- /form-group -->
						<div class="form-group">
							<label class="label-checkbox">
								 <input type="checkbox"/>
								 <span class="custom-checkbox info bounceIn animation-delay6"></span>
								 I accept the agreement.
							</label>
						</div><!-- /form-group -->

						<div class="seperator"></div>
						<div class="form-group">
							<div class="controls">
								Already have an account? <a href="<c:url value = '/login'/>" class="primary-font login-link">Sign In</a>
							</div>
						</div><!-- /form-group -->
							
						<hr/>
						<div class="form-group">
							<div class="controls text-right">
								<a class="btn btn-success btn-sm bounceIn animation-delay7 login-link" href="<c:url value = '/login'/>"><i class="fa fa-plus-circle"></i> 注册</a>
							</div>
						</div><!-- /form-group -->
					</form>
				</div>
			</div><!-- /panel -->
		</div><!-- /login-widget -->
	</div><!-- /login-wrapper -->
	
    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
    <!-- Jquery -->
	<script src="<c:url value='/js/jquery-1.10.2.min.js'/>"></script>
    
    <!--Bootstrap-->
    <script src="<c:url value = '/bootstrap/js/bootstrap.min.js'/>"></script>
   
	<!-- Modernizr -->
	<script src="<c:url value = '/js/modernizr.min.js'/>"></script>
	
	<!-- Pace -->
	<script src="<c:url value = '/js/pace.min.js'/>"></script>
	
	<!-- Popup Overlay -->
	<script src="<c:url value = '/js/jquery.popupoverlay.min.js'/>"></script>
	
	<!-- Slimscroll -->
	<script src="<c:url value = '/js/jquery.slimscroll.min.js'/>"></script>
	
	<!--Cookie-->
	<script src="<c:url value = '/js/jquery.cookie.min.js'/>"></script>

	<!--Endless-->
	<script src="<c:url value = '/js/endless/endless.js'/>"></script>
  </body>
</html>
