package bean;

public class Panier {

	private int reference ;
	private int quantite;
	private float prix;
	private String nom_produit;
	private String description;
	private String image;
	
	
	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Panier(int reference, int quantite, float prix, String nom_produit, String description, String image) {
		super();
		this.reference = reference;
		this.quantite = quantite;
		this.prix = prix;
		this.nom_produit = nom_produit;
		this.description = description;
		this.image = image;
	}


	public int getReference() {
		return reference;
	}


	public void setReference(int reference) {
		this.reference = reference;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public String getNom_produit() {
		return nom_produit;
	}


	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
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


}