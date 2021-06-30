
<%@ include file="/menu/header.jsp" %>
<link rel="stylesheet" href="<%= request.getContextPath()+"/style3.css" %>" >

   
<div id="blocdetail">
	<div class="card mb-3 blocdetail">
		<div class="card-body blocdes">
		
			<h3 class="card-title de">${monture_actuel.nom_produit}</h3>
						<p class="card-text">${monture_actuel.description}</p>
						<p class="card-text"><span style="background:grey; color:white;">Prix: ${monture_actuel.prix} euros</span></p>
			<img src="${monture_actuel.image}" id="imgdetail" class="" alt="...">
			
				<div >
					
				</div>	
			</div>
			
			<div id="hello"></div>
			<form method="post" action="<%=request.getContextPath()%>/panier">
			<input name="reference" type="hidden" value="${monture_actuel.reference}">
			<input name="quantite" type="hidden" value="1">
			<button type="submit" class="btn btn m-3 " id="ajouter">Ajouter au panier</button>
			
		</form>
			
			
	</div>
</div>

