<%@ include file="/menu/header.jsp" %>
<link rel="stylesheet" href="<%= request.getContextPath()+"/style3.css" %>" >
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<div id="blocdetail">
	<div class="card mb-3 blocdetail">
		<div class="card-body blocdes">
		
			<h3 class="card-title de">${actuel.nom}</h3>
						<p class="card-text">${actuel.description}</p>
						<p class="card-text"><span style="background:grey; color:white;">Prix: ${actuel.prix} euros</span></p>
			<img src="${actuel.image}" id="imgdetail" class="" alt="...">
			
				<div >
					
				</div>	
			</div>
			
			<div id="hello"></div>
			<form method="post" action="<%=request.getContextPath()%>/panier">
			<input name="reference" type="hidden" value="${actuel.id}">
			<input name="quantite" type="hidden" value="1">
			<button type="submit" class="btn btn m-3 " id="ajouter">Ajouter au panier</button>
			
		</form>
			
			
	</div>
</div>

