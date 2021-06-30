
<%@ include file="/menu/header.jsp" %>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
	<div id="blocontact">
		<form method="post" action="<%= request.getContextPath()%>/messageenvoye.jsp">
		<div class="mb-3 message">
		  <label for="exampleFormControlInput1" class="form-label" >Saisissez votre email</label>
		  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com" required>
		</div>
		<div class="mb-3 textarea">
		  <label for="exampleFormControlTextarea1" class="form-label">Ecrivez votre message</label>
		  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" required></textarea>
		</div>
		 <button type="submit" class="btn btn-secondary btn-lg bouton3">Envoyer</button>
		</form>
	</div>	

<div id="para">
<h3>Contact</h3>
<p id="un">
		Notre Boutique :<br>
		6 rue dArcole Notre Dame<br>
		75004 Paris<br>
</p>
<p id="deux">
	Métro ligne4 Saint- Michel<br>
	Ouvert tous les jours de 10h à 19h, sauf dimanches et fêtes.<br>
</p>
<p id="trois">
<b>tel:01.25.14.32.25<br>
<b>mel:lunette+@gmail.fr<br>
</p>

</div>
<div id="map"></div>
		<div id="blocSoc">
	          <a href="https://www.youtube.com/watch?v=GLyPmhp_a9c"><img src="img/youb.png" id="youtube"></a>
	          <a href="https://fr-fr.facebook.com/labouticalunettes/"><img src="img/fbblan.png" id="fb"></a>
	          <a href="https://www.instagram.com/?hl=fr"><img src="img/instab.png" id="insta"></a>
	     </div>	
	     	<script>
	     		function initMap(){
	     			var options = {
	     				zoom:8,
	     				center:{lat:48.8534,lng: 2.3488}
	     			}
	     			var map = new
	     			google.maps.Map(document.getElementById('map'), options);
	     			
	     			var marker = new google.maps.Marker({
	     				position:{lat:48.8534,lng:2.3488},
	     				map:map
	     			});
	     		}
	     		

	     	</script>
	     	
	     <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBM3lbJ2y9pJXsU3M7fG2s48tj0_WjaV3E&callback=initMap&libraries=&v=weekly"
      async >
    </script>	
	     	
	
	