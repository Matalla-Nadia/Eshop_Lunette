
<%@ include file="/menu/header.jsp" %>



<div id="cb">

<h2 id="paie">Paiement</h2>
<hr>
<div class="form-check">
  <img alt="" src="img/masterC.png" id="masterimg">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" >
  <label class="form-check-label" for="flexRadioDefault1">
    
  </label>
</div>
<div class="form-check">
<img alt="" src="img/visa.png" id="masterimg">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" >
  <label class="form-check-label" for="flexRadioDefault2">
  </label>
</div>
<div class="form-check">
<img alt="" src="img/paypal.png" id="masterimg">
  <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
  </label>
</div>



<hr>



<div id="input">
<form method="post" action="<%= request.getContextPath()%>/merci.jsp">
 <label for="" class="col-sm-2 col-form-label numc">Numero Carte</label>
<input class="form-control form-control-sm" type="number" placeholder="Numero carte" required>
<label for="" class="">Date d'expiration</label>
<input class="form-control form-control-sm date" type="month" placeholder="YYYY-MM" aria-label=".form-control-sm example" required>
<label for="" class="col-sm-2 col-form-label numcv">Cryptogramme visuel</label><a id="interro" href="https://reassurez-moi.fr/guide/banque/cvv"><img src="img/interro.png" id="interro" required></a>
<input class="form-control form-control-sm date" type="number" placeholder="ccv" required> 
	 <button type="submit" class="btn btn-secondary btn-lg bout">Payer</button>
</form>		
</div>


<script src="paiement.js"></script>