
 
<%@ include file="/menu/header.jsp" %>


<link rel="stylesheet" href="<%= request.getContextPath()+"/style3.css" %>" >

<p id="nav"></p>

	
		  
		  <div id="carte"> 
	<c:forEach items="${listeMonture}" var="monture" >
				<div class="card card1"style="width: 18rem;" > 
						<img src="${monture.image}"/>
						<h5 class="card-title" style="background:lightgrey;" >${monture.nom_produit}</h5>
						<!--  <p class="card-text" style="color:white;">${monture.description}</p>-->
						<a href="<%= request.getContextPath()+"/consulterProduit?reference=" %>${monture.reference}" class="btn btn-secondary consul" >Consulter</a>
				</div>
		
	</c:forEach>
	</div>