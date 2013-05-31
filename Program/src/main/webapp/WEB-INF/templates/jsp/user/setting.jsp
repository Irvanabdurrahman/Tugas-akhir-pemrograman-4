

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<div class="container">		
		<div class="setting">		
			<div class="isidaftar">		
			<div class="row-fluid">
				<div class="span12"><p>
					<div class="row-fluid"><br>
							<h2>Account</h2><div class="title">Change your basic account.</div><hr>
							<spring:form modelAttribute="user">
								<table width="330px">
									<tr><td>Username </td><td><input type="text" class="span11"></td></tr>
									<tr><td>Name  </td><td><input type="text" class="span11"></td></tr>
									<tr><td>Email </td><td><input type="text" class="span11"></td></tr>
									<tr><td>Password </td><td><input type="password" class="span11"></td></tr>
									<tr><td valign="top">Avatar </td><td valign="top"><img class="img-polaroid" src="<%= request.getContextPath() %>/img/user/User.png" width="70px" >
									<div class="btn-group">
										<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">Change photo <span class="caret"></span></a>
											<ul class="dropdown-menu">
												<li><a href="#">Upload photo</a></li>
												<li><a href="#">Remove</a></li>
											</ul>
									</div>
									</td>
									</tr>
									<tr><td>&nbsp;</td></tr>
									<tr>
										<td>&nbsp;</td><td><input type="submit" class="btn span11 btn-primary" value="Save"/></td>
									</tr>
								</table>
							</spring:form>		
					</div>
				</div>
			</div>
			</div>
		
		</div>
		</div>
    </body>
</html>