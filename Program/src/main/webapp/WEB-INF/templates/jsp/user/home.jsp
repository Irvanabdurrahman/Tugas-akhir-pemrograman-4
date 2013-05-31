

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
		<div class="container">		
			<div class="row-fluid">
				<div class="span12"><p>
					<div class="row-fluid">
						<div class="span5">
							<div class="profilehome">
								<div class="headerhome">
										<img src="<%= request.getContextPath() %>/img/user/User.png"  class="img-polaroid">
										<div class="headerhomename">
										<a href="<%= request.getContextPath() %>/aplikasi/user/me" style="color:black;"><b>FC Barcelona</b></a><br>
										<q class="headerusername">View my profile page
										</div><hr>
								</div>
								<spring:form modelAttribute="user">
									<textarea rows="1" name="teks" class="span12" placeholder="Compose new Tweet..." id="flip" ></textarea>
									<p align="right" id="tmb"><input type="submit" class="btn btn-info" value="Tweet"/>
								</spring:form>
							</div>
							
							<div class="people">
							Who to follow<hr>
							People people People people People people People people People people People people
							People people People people People people People people People people People people 
							</div><br>
						</div>
						
	<div class="span7"> 
		<div class="timeline"> 
		<p style="font-size:20px;"><b>Tweets</b><hr>
		<c:choose>
			<c:when test="${empty hasilTweet}">
				<br>
				<div class="tweetempty">
						<p><img src="<%= request.getContextPath() %>/img/empty.png" width="100px" height="100px"></p>You haven't any Tweets yet.
				</div>
			</c:when>
			<c:otherwise>
				<c:forEach items="${hasilTweet}" var="t">	
						<div class="headertweet"><a href="#" style="color:black;"><b>FC Barcelona</b></a>&nbsp;<q class="headerusername">@fc_barcelona</div>
						<img src="<%= request.getContextPath() %>/img/user/User.png" class="ava">	
						<div class="teks">${t.teks}<br></div>
						<div class="footertweet">
								Expand&nbsp;&nbsp;&nbsp;
								<i class="icon-share-alt"></i> <a href="#" id="show" value="id_tweet=${t.id_tweet}">Reply</a>&nbsp;&nbsp;&nbsp;
								<i class="icon-trash"></i> <a href="delete?id_tweet=${t.id_tweet}">Delete</a>&nbsp;&nbsp;&nbsp;
								<i class="icon-retweet"></i> Retweet&nbsp;&nbsp;&nbsp;
								<i class="icon-star"></i> Favorite&nbsp;&nbsp;&nbsp;						
						</div><hr>
						<div class="footertweet">
									<spring:form modelAttribute="user">
											<textarea rows="1" name="teks" class="span12" placeholder="Reply to" id="comment" style="resize: none;"></textarea>
											<p align="right" id="tmbl"><input type="submit" class="btn btn-info" value="Tweet"/>
									</spring:form>
						</div><hr id="line">
				</c:forEach>
			</c:otherwise>
		</c:choose>
		</div>	
		</div>
	</div>
  </div>
</div>
</div>
    </body>
</html>
