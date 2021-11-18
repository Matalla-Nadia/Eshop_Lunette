<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/menu/header.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<meta charset="UTF-8">
<title></title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
<script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
  
  <link rel="stylesheet "href="https://cdn.datatables.net/1.11.0/css/jquery.dataTables.min.css">
  <script src="https://cdn.datatables.net/1.11.0/js/jquery.dataTables.min.js"></script>
</head>
<body>
 <table  id="matable" >
	  <thead >
		<tr >
		  <th scope="col">Quantité</th>
		  <th scope="col">Prix</th>
		  <th scope="col">Nom du produit</th>
		  <th scope="col">Description</th>
		  <th scope="col">Image</th>
	   </tr>
	  </thead>
	  <tbody>
		 <c:forEach var="panier" items="${listePanier}" >
		 <tr id="montd">
		  <td id="id">${panier.quantite}</td>
		  <td>${panier.prix}</td>
		  <td>"${panier.nom_produit}"</td>
		  <td>"${panier.description}"</td>
		  <td><img src=" ${panier.image}">
		  <td><a class="btn btn-dark" href="<%= request.getContextPath()+"/Delete?id=" %>${monturetest.id}">sup</a> 
		  <!--   <button class="btn btn-danger deletebtn " onclick="myModal(${monturetest.id})" id="sup" >Supprimer</button> -->
	      </td>
	   </tr>
	  </c:forEach>
	
	 </tbody>
   </table>
   <script>
	//JS Datatable
	 $(document).ready( function () {
			    $('#matable').DataTable(); 
			      responsive: true 
			} );
		
	</script>
   <!-- Modal-------------------------------------------------------- -->	
	<div class="modal" id="deletemodal" tabindex="-1">
	 <div class="modal-dialog">
	   <div class="modal-content">
		  <div class="modal-header">
		    <h5 class="modal-title" id="exampleModalLabel">supprimer</h5>
			<button type="button" class="btn-close"data-bs-dismiss="modal" aria-label="Close"></button>			
		 </div>
		  <div class="modal-body"> <p>Souhaitez-vous vraiment supprimer la recette?</p></div>
		  <div class="modal-footer">
		    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Non</button>
		    <button class="btn btn-primary" onclick="myFunction()">Oui je souhaite la supprimer!</button>	
		  </div>
		</div>
	  </div>
  </div>

	<span id="itemDelete"></span>	      
   <form method="post" id="supForm" action="Delete"></form>   
	 <script src="js.js"></script>                     

</body>
</html>