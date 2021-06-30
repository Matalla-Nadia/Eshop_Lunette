package bean;

public class Monture {

	 private String nom_produit ;
     private int reference;
     private String description;
     private String image;
     private String categorie;
     private Float prix;
     private int quantite;
     
     
	public Monture() {
		super();
		
	}
	public Monture(String nom_produit, int reference, String description, String image, String categorie, Float prix, int quantite) {
		super();
		this.nom_produit = nom_produit;
		this.reference = reference;
		this.description = description;
		this.image = image;
		this.categorie = categorie;
		this.prix = prix;
		this.quantite= quantite;
	}
	public String getNom_produit() {
		return nom_produit;
	}
	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
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
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
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
	
	
	@Override
	public String toString() {
		return "Monture [nom_produit=" + nom_produit + ", reference=" + reference + ", description=" + description
				+ ", image=" + image + ", categorie=" + categorie + ", prix=" + prix + ", quantite=" + quantite + "]";
	}
	 
	
	
     
}
