<%@ include file="/menu/header2.jsp" %> <!-- header vide pour le login -->


<div id="bloc1">									<!-- vers la page -->
<form method="post" action="<%= request.getContextPath()%>/login">
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Entrer votre email</label>
	  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="" name="email" required>
	  <!-- rajouter name car on souhaite recuperer le nom ici --> 
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Entrer votre mot de passe</label>
	  <input type="password" class="form-control" id="exampleFormControlInput1" placeholder="" name="mot_de_pass" required>
	</div>
	  <hr>
	   <button type="submit" class="btn btn-primary btn-lg bouton1">Se connecter</button>
	   <a id="mdp" href="https://help.twitter.com/fr/managing-your-account/forgotten-or-lost-password-reset">mot de passe oublie?</a>
</form>
</div>
<!-- --------------------------------------------------------------------------------------------------------------------- -->
<!-- Partie inscription  -->

<div id="bloc2">


	<form method="post" action="<%= request.getContextPath()%>/inscription">
	<div class="mb-3 p">
	  <label for="exampleFormControlInput1" class="form-label">Prenom</label>
	  <input type="text" class="form-control prenom"  placeholder="" name="prenom" required>
	  <!-- rajouter name car on souhaite recuperer le nom ici --> 
	  
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Nom</label>
	  <input type="text" class="form-control"  placeholder="" name="nom" required>
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Email</label>
		  <input type="text" class="form-control"  placeholder="" name="email" required>
	</div>
	
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Mot de passe</label>
	  <input type="password" class="form-control"  placeholder=""  name="mot_de_passe" required>
	  <hr>
	   <button type="submit" class="btn btn-secondary btn-lg bouton2">S'inscrire</button>
	    <a id="mdpp" href="https://support.google.com/accounts/?hl=fr#topic=3382296"> Deja membre?</a>
 
	</div>
</form>
</div>



</body>
</html>