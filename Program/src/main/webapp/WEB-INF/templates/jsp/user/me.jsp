
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
		<div class="container">		
		
			<div class="row-fluid">
				<div class="span12"><p>
					<div class="row-fluid">
						<div class="span5">						
        <div class="menutab">
            <ul class="nav nav-tabs nav-stacked" id="size">
              <li><a href="<%= request.getContextPath() %>/aplikasi/user/me">Tweets<i class="icon-chevron-right" id="pos"></i></a></li>
              <li><a href="#">Favorites<i class="icon-chevron-right" id="pos"></i></a></li>
            </ul>
          
        </div>
							<div class="photo">
							Photos<hr>
							photo photo photo photo photo photo photo photo photo photo photo photo photo
							photo photo photo photo photo photo photo photo photo photo photo photo photo
							photo photo photo photo photo photo photo photo photo photo photo photo photo
							</div>
							
							<div class="people">
							Who to follow<hr>
							People people People people People people People people People people People people
							People people People people People people People people People people People people 
							</div>
						</div>
						
	<div class="span7"> 
	<div class="profile"> 
				<img src="<%= request.getContextPath() %>/img/user/User.png"  class="avatar" width="70px"></p>
				<div class="nameProfile">FC Barcelona</div>
				<div class="username">@fc_barcelona</div>
	</div>

	<div>
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
								<i class="icon-share-alt"></i> Reply&nbsp;&nbsp;&nbsp;
								<i class="icon-trash"></i> <a href="delete?id_tweet=${t.id_tweet}" stylecolor="red">Delete</a>&nbsp;&nbsp;&nbsp;
								<i class="icon-retweet"></i> Retweet&nbsp;&nbsp;&nbsp;
								<i class="icon-star"></i> Favorite&nbsp;&nbsp;&nbsp;						
						</div><hr>
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