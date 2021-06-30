package bean;

public class user {

	
	private String nom;
	private String prenom;
	private String email;
	private String mot_de_passe;
	
	

	public user() {
		super();
	}

	public user(String nom, String prenom, String email, String mot_de_passe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mot_de_passe = mot_de_passe;
	}


	public user( String email, String mot_de_passe) {
		super();
		this.email = email;
		this.mot_de_passe = mot_de_passe;
	}


	public String getNom() {
		return nom;
	}

	
	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMot_de_passe() {
		return mot_de_passe;
	}



	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}



	
	
}





