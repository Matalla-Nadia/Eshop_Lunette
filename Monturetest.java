package bean;

public class Monturetest {
	 private int id;
	 private String nom;
     private String description;
     private String image;
     private Float prix;
     private int quantite;
     private Object categorie;
     
     
	public Monturetest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Monturetest(int id, String nom, String description, String image, Float prix, int quantite,
			Object categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.image = image;
		this.prix = prix;
		this.quantite = quantite;
		this.categorie = categorie;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Float getPrix() {
		return prix;
	}


	public void setPrix(Float prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Object getCategorie() {
		return categorie;
	}


	public void setCategories(Object categories) {
		this.categorie = categories;
	}


	@Override
	public String toString() {
		return "Monturetest [id=" + id + ", nom=" + nom + ", description=" + description + ", image=" + image
				+ ", prix=" + prix + ", quantite=" + quantite + ", categorie=" + categorie + "]";
	}


}
