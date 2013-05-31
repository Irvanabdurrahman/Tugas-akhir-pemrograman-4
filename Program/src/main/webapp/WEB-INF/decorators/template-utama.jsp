
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Pemrograman 4</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link href="<%= request.getContextPath() %>/css/bootstrap.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 41px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }

      @media (max-width: 980px) {
        /* Enable use of floated navbar text */
        .navbar-text.pull-right {
          float: none;
          padding-left: 5px;
          padding-right: 5px;
        }
      }
    </style>
	
	<!-- Jquery for tweet -->
	<script src="<%= request.getContextPath() %>/js/jquery.min.js"></script>
		<script> 
			$(document).ready(function(){
				$("#tmb").hide();
				$("#flip").click(function(){
				$("#tmb").show();
					$("#flip").height(100);
				});
			});
		</script>
		
		<style type="text/css"> 
			#flip {
				resize: none;
			}
		</style>
		
		
		<!-- Jquery for reply -->
		<script>
			$(document).ready(function(){
				$("#comment").hide();
				$("#tmbl").hide();
				$("#line").hide();
				$("#show").click(function(){
					$("#comment").toggle();
					$("#tmbl").toggle();
					$("#line").toggle();
				});
				$("#comment").click(function(){
					$("#comment").height(100);
				});
			});
			</script>
	
	
    <!--<link href="<= request.getContextPath() >/css/bootstrap-responsive.css" rel="stylesheet">-->
    <link rel="icon" href="<%= request.getContextPath() %>/img/icon.ico">
  </head>

  <body>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">          
          <div class="nav-collapse collapse">
		    <p class="pull-right">
             <a href="#myModal" role="button" class="btn btn-info" data-toggle="modal" data-toggle="tooltip" title="Compose new Tweet"><i class="icon-edit icon-white"></i></a>
            
			
			  <div class="pull-right">
				<ul class="nav">
				<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<i class="icon-cog icon-white"></i>
							<b class="caret"></b>
					</a>
				<ul class="dropdown-menu">
					<li><a href="<%= request.getContextPath() %>/aplikasi/user/setting"><img src="<%= request.getContextPath() %>/img/user/User.png"  class="img-polaroid"> Profile and Username &nbsp;</a></li>
					<li class="divider"></li>
					<li><a href="<%= request.getContextPath() %>/aplikasi/user/setting"><i class="icon-wrench"></i> Setting</a></li>
					<li><a href="<%= request.getContextPath() %>/aplikasi/user/index"><i class="icon-remove-sign"></i> Log Out</a></li>
    </ul>
  </li>
</ul></div>
            <ul class="nav">
              <li class="active"><a href="<%= request.getContextPath() %>/aplikasi/user/home"><i class="icon-home" ></i> Home</a></li>
			  <li><a href="<%= request.getContextPath() %>/aplikasi/user/connect"><i class="icon-globe" ></i> Connect</a></li>
              <li><a href="<%= request.getContextPath() %>/aplikasi/user/me"><i class="icon-user" ></i> Me</a>
			  </li>
            </ul>            
          </div>
        </div>
      </div>
    </div>
	
	<!-- Modal for tweet -->
		<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h3 id="myModalLabel">What's happening?</h3>
			</div>
			<spring:form modelAttribute="user">
			<div class="modal-body">
				<table>
						<textarea rows="4" name="teks" class="span7" style="resize: none;"></textarea>
						
				</table>
			</div>
			<div class="modal-footer">
				<input type="file">
				<input type="submit" class="btn btn-info" value="Tweet"/>
			</div>
		</spring:form>
		</div>

   
     <!--  <div class="row-fluid">
        <div class="span3">
          <div class="well sidebar-nav">
            <ul class="nav nav-list">
              <li class="nav-header">Sidebar</li>
              <li ><a href="#">Link</a></li>
              <li class="active"><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li class="nav-header">Sidebar</li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li class="nav-header">Sidebar</li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
              <li><a href="#">Link</a></li>
            </ul>
          </div>
        </div>-->
		<div >
       <decorator:body></decorator:body>
	   </div>
	   
	 <!--<div class="container">
    
        <div class="row-fluid">
  <div class="span12">
   <p>
    <div class="row-fluid">
      <div class="span8">
	  <div class="home">
        Welcome to Twitter.<br>
Find out whats happening, right now, with the people and organizations you care about.
      </div>
      </div>
      <div class="span4"><decorator:body></decorator:body></div>
    </div>
  </div>
</div>
          
      </div>    -->

	  

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="<%= request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
    <script src="<%= request.getContextPath() %>/js/bootstrap.file-input.js"></script>
    <script src="<%= request.getContextPath() %>/js/bootstrap.min.js"></script>

  </body>
</html>
