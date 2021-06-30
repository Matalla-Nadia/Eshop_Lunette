
<%@ include file="/menu/header.jsp" %>
<link rel="stylesheet" href="<%= request.getContextPath()+"/styleh.css" %>" >
   
<div id="blocdetail">
	<div class="card mb-3 blocdetail">
		<div class="card-body blocdes">
		
			<h3 class="card-title de">${montureh_actuel.nom_produit}</h3>
						<p class="card-text">${montureh_actuel.description}</p>
						<p class="card-text"><span style="background:grey; color:white;">Prix: ${montureh_actuel.prix} euros</span></p>
			<img src="${montureh_actuel.image}" id="imgdetail" class="" alt="...">
			
				<div >
					
				</div>	
			</div>
			
			<div id="helloh"></div>
			<form method="post" action="<%=request.getContextPath()%>/Panierh">
			<input name="reference" type="hidden" value="${montureh_actuel.reference}">
			<input name="quantite" type="hidden" value="1">
			<button type="submit" class="btn btn m-3 " id="ajouterh">Ajouter au panier</button>
		</form>
			
			
	</div>
</div>

   