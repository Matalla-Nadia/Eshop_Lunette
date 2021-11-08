
<%@ include file="/menu/header.jsp"%>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<div id="blocontact">
	<form method="post"
		action="<%=request.getContextPath()%>/messageenvoye.jsp">
		<div class="mb-3 message">
			<label for="exampleFormControlInput1" class="form-label">Saisissez
				votre email</label> <input type="email" class="form-control"
				id="exampleFormControlInput1" placeholder="name@example.com"
				required>
		</div>
		<div class="mb-3 textarea">
			<label for="exampleFormControlTextarea1" class="form-label">Ecrivez
				votre message</label>
			<textarea class="form-control" id="exampleFormControlTextarea1"
				rows="3" required></textarea>
		</div>
		<button type="submit" class="btn btn-secondary btn-lg bouton3">Envoyer</button>
	</form>
</div>

<div id="para">
	<h3>Contact</h3>
	<p id="un">
		Notre Boutique :<br> 6 rue dArcole Notre Dame<br> 75004
		Paris<br>
	</p>
	<p id="deux">
		M�tro ligne4 Saint- Michel<br> Ouvert tous les jours de 10h �
		19h, sauf dimanches et f�tes.<br>
	</p>
	<p id="trois">
		<b>tel:01.25.14.32.25<br> <b>mel:lunette+@gmail.fr<br>
	</p>

</div>

<iframe id="map"
	src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2623.932690564378!2d2.293200715555743!3d48.878559679289395!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47e66f935eecf10b%3A0xdfb59aafe73f450!2sMaison%20Pou!5e0!3m2!1sfr!2sfr!4v1630312754850!5m2!1sfr!2sfr"
	width="600" height="450" style="border: 0;" allowfullscreen=""
	loading="lazy"></iframe>

