<%-- 
    Document   : index
    Created on : May 6, 2013, 2:48:51 PM
    Author     : Irvan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<div class="panel">
			<div class="row-fluid">
				<div class="span12"><p>
					<div class="row-fluid">
						<div class="span8">
							<div class="home">
							<b>Welcome to Twitter.</b><br>
							Find out what&#8217;s happening, right now, with the people and organizations you care about.
							</div>
						</div>
	<div class="span4"> 
		<div class="signin"> 
			<form class="form-inline" action="home.jsp">
                <input name="username" class="span12" type="text" placeholder="Username"/><p>
                <p><input name="password" class="span9" type="password" placeholder="Password"/>
                <input type="submit" class="btn btn-info" value="Log in"/>
			</form>
		</div>
		<div class="signup"> 
			<p style="font-size:17px;">New to Twitter? Sign up<hr>
			<div class="form-inline" >
			<spring:form modelAttribute="user" >
				<spring:input path="username" placeholder="Full name" class="span12"/><spring:errors path="username"/><p>
                <p><spring:input path="nama" placeholder="Email" class="span12" /><spring:errors path="nama"/><p>
				<p><spring:input path="password" placeholder="Password" class="span12" type="password" /><spring:errors path="password"/><p>
                <p align="right"><input type="submit" class="btn btn-warning" value="Sign up for Twitter"/>
			 </spring:form>  
			</div>
		</div>
	</div>
    </div>
  </div>
</div>
          <div class="span12"><div class="ftr">Copyright &copy;  2013 by Sukma Wijaya and Irvan Abdurrahman</div></div> 
      </div>        
    </body>
</html>
