<%@ include file="/menu/header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<p id="nav"></p>
 <div id="blo">
 

   <c:forEach items="${listeMonturetest}" var="recette" begin="1" end="1">
	 <h1 id="itemNom"> ${monturetest.categorie}</h1>
  </c:forEach>
  <c:forEach items="${listeMonturetest}" var="monturetest">
	<div>
	  <h5 class="card-title listR">${monturetest.nom}</h5>	                 
	</div>
	 <div id="blo2">
	  <a href="<%= request.getContextPath()+"/menutest?id=" %>${monturetest.id}"class="btn btn-secondary consul">Voir la monture</a>
   </div>
 </c:forEach>
</div>



