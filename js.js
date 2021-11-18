/**
 * 
 */	 $(document).ready (function(){
			 $('.deletebtn').on('click', function(){
				 $('#deletemodal').modal('show');
			 }); 
		 });
	 
		  function myModal(idRecu){
			  $('#itemDelete').text(idRecu);	
			  $('#deletemodal').modal('show'); 
		  }
	    
		  function myFunction(){
			 $('#supForm').append('<input type="hidden" name="id" value="'+ $('#itemDelete').text()+'" />').submit()
		  }

	
			//JS Datatable
		 $(document).ready( function () {
				    $('#matable').DataTable(); 
				      responsive: true 
				} );
			
		