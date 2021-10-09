
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<link rel="stylesheet" href="<%= request.getContextPath()+"/style.css" %>">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-red bg-red nav">
	  <div class="container-fluid">
	    <a class="navbar-brand bienvenue" href="<%= request.getContextPath()+"/accueil2.jsp" %> ">Lunette+</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
		    <div class="collapse navbar-collapse" id="navbarSupportedContent">
		      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		        <li class="nav-item">
		          <a class="nav-link active accueil" aria-current="page" href="<%= request.getContextPath() %>/monture">Montures Femmes</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active accueilh" aria-current="page" href="<%= request.getContextPath()+"/montureh" %>">Montures Hommes</a>
		        </li>
		        <li>
		        <a class="nav-link active contact" aria-current="page" href="<%= request.getContextPath()+"/contact.jsp" %>">Nous contacter</a>
		        </li>
		        <li class="nav-item">
		        </li>
		        <li class="nav-item">
			         <a class="nav-link  panier" aria-current="page" href="<%= request.getContextPath()+"/panier.jsp" %>">Panier 
			         <img id="imgpanier"src="<%= request.getContextPath()+"/img/panier3.png" %>">
			         <span style="color:white;"> <c:choose><c:when test = "${taille_panier != null}">${taille_panier}</c:when><c:otherwise>${panier.reference}</c:otherwise></c:choose></span></a>
		        </li>
		      </ul>
		      	<!-- Creation du bouton deconnecter -->
		     	<c:if test="${empty utilisateur }">
		      	</c:if>
		      	<c:if test="${not empty utilisateur }">                    
			  <a href="<%= request.getContextPath()+"/login.jsp" %>"><button class="btn btn deconection" style="color:#D0DB97;"><span>${utilisateur}</span> || Deconnexion</button></a>
		     	</c:if>
		    </div>
		  </div>
	</nav>
