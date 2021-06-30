
<%@ include file="/menu/header.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

<div id="recap">
 <h2 style="color:antiquewhite;">Recapitulatif</h2>
	<div class="mb-3 p">
	 <c:forEach var="panier" items="${listePanier}">
            <div class="alert alert-light m-2" role="alert">
			<c:out value="Quantité: ${panier.quantite}|| Prix: ${panier.prix} || Nom :${panier.nom_produit}">
		</c:out>
			</div>									
      </c:forEach>
	</div>
   <a href="<%= request.getContextPath()+"/Delete" %>"><button class="btn btn-secondary" style="border:solid 2px;">Valider et payer</button></a>
</div>

