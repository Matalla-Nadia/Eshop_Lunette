<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<link rel="stylesheet" href="<%= request.getContextPath()+"/style.css" %>">
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-red bg-red nav">
  <div class="container-fluid">
    <a class="navbar-brand tit" href=" #">Lunette +</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
       
      </ul>
      	
     
     
      	<c:if test="${not empty utilisateur }">
      		  <button type ="button"class="btn btn" style="color:#D0DB97;">
      		<a href="" style="color:#D0DB97;">|| Se connecter</a></button>
      		</c:if>
      	
      	
      <form class="d-flex">
        
       
      </form>
    </div>
  </div>
</nav>


</body>
</html>