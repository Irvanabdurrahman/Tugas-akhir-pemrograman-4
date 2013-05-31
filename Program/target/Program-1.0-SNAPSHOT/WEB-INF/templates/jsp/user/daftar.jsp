

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<div class="daftar">		
			<div class="isidaftar">		
			<div class="row-fluid">
				<div class="span12"><p>
					<div class="row-fluid"><br>
							<h2>Join Twitter today.</h2><hr>
			<spring:form modelAttribute="user">
			<c:forEach items="${daftarUser}" varStatus="u">
			<table width="800px">
				<tr><input type="hidden"  name="avatar"/>
					<td><label><strong>Full name</strong></label>
							<spring:input path="nama" placeholder="Full name" value="${u.nama}" class="span11"/></td>
					<td><spring:errors path="nama" class="pesan"/></td>
				</tr>
				<tr>
					<td><label><strong>Your Email</strong></label>
							<spring:input path="email" placeholder="Email" class="span11" value="${u.email}"/></td>
					<td><spring:errors path="email" class="pesan"/></td>
				</tr>
				<tr>
					<td><label><strong>Create a password</strong></label>
							<spring:input path="password" placeholder="Password" class="span11" type="password" value="${u.password}"/></td>
					<td><spring:errors path="password" class="pesan"/></td>
				</tr>
				<tr>
					<td><label><strong>Create your username</strong></label>
							<spring:input path="username" placeholder="Username" class="span11" /></td>
					<td><spring:errors path="username" class="pesan"/></td>
				</tr>
				<tr><td>&nbsp;</td></tr>
				<tr>
					<td><input type="submit" class="btn span11 btn-warning" value="Create my account"/></td>
				</tr>
			</table><br>
			 </c:forEach>
			 </spring:form>		
					</div>
				</div>
			</div>
			</div>
		
		</div>
    </body>
</html>