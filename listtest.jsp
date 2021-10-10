<%@ include file="/menu/header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<p id="nav"></p>
 <div id="blo">
 




		  
		  <div id="carte"> 
<c:forEach items="${listeMonturetest}" var="monturetest" begin="1" end="1">
    <h1> ${monturetest.categorie}</h1>
     </c:forEach>
  <c:forEach items="${listeMonturetest}" var="monturetest">
  
				<div class="card card1"style="width: 18rem;" > 
						<img src="${monturetest.image}"/>
						<h5 class="card-title" style="background:lightgrey;" >${monturetest.nom}</h5>
						 <a href="<%= request.getContextPath()+"/ConsulterMonturetest?id=" %>${monturetest.id}"class="btn btn-secondary consul">Voir la monture</a>
				</div>
		
	</c:forEach>
	</div>