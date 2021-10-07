package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Monture;

public class MontureDao {

	Connection connect = Connect.getConnection();
	
	public boolean create(Monture object) {
		boolean response = false;
		try {
			PreparedStatement request = connect.prepareStatement("INSERT INTO `monture` (`nom_produit`, `reference`, `description`, `categorie`, `prix`, `image`,'quantite') "
					+ "VALUES (?,?,?,?,?,?,?)");

			request.setString(1, object.getNom_produit());
			request.setInt(2, object.getReference());
			request.setString(3, object.getDescription());
			request.setString(4, object.getCategorie());
			request.setFloat(5, object.getPrix());
			request.setString(6, object.getImage());
			request.setInt(7, 1);
			request.executeUpdate();
			
			System.out.println( object.getNom_produit()+ "  " +object.getReference() +" a été bien ajouté en base");
			
			response = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	public Monture read(int Int) {
		Monture prod = new Monture();
		
		try {
			PreparedStatement request = connect.prepareStatement("SELECT * FROM monture WHERE reference = ? ;");
			request.setInt(1, Int);
			System.out.println(request);
			ResultSet rs = request.executeQuery();
			while(rs.next()) {
				prod.setNom_produit(rs.getString("nom_produit"));
				prod.setReference(rs.getInt("reference"));
				prod.setDescription(rs.getString("description"));
				prod.setImage(rs.getString("image"));
				prod.setPrix(rs.getFloat("prix"));
				prod.setCategorie(rs.getString("categorie"));
				prod.setQuantite(rs.getInt("quantite"));
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prod;
		
	};

	public ArrayList<Monture> readAll() {
		ArrayList<Monture> response = null;
		try {
			PreparedStatement request = connect.prepareStatement("SELECT * FROM monture;");
			ResultSet rs = request.executeQuery();
			response = new ArrayList<Monture>();
			while(rs.next()) {
				Monture current = new Monture(rs.getString("nom_produit"),
				                              rs.getInt("reference"),
									           rs.getString("description"),
									           rs.getString("image"),
									           rs.getString("categorie"),
									           rs.getFloat("prix"),
											   rs.getInt("quantite"));	  
				response.add(current);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	public boolean update(Monture object) {
		boolean response = false;
		try {
			PreparedStatement request = connect.prepareStatement("UPDATE monture SET nom_produit=?, reference=?, description=?, categorie=?, prix=? , image=? WHERE reference= ?");
			request.setString(1, object.getNom_produit());
			request.setInt(2, object.getReference());
			request.setString(3, object.getDescription());
			request.setString(4, object.getCategorie());
			request.setFloat(5, object.getPrix());
			request.setString(6, object.getImage());
			request.setInt(7, object.getReference());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	public boolean delete(String reference) {
		boolean response = false;
		try {
			PreparedStatement request = connect.prepareStatement("DELETE FROM monture WHERE reference = ? ;");
			request.setString(1, reference);
			request.executeUpdate();
			response = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
	

	public ArrayList<Monture> findAll() {
		ArrayList<Monture> listeNote = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM monture;");
			ResultSet rs = req.executeQuery();
			
			while(rs.next()) {
				Monture tempNote = new Monture();
				tempNote.setReference(rs.getInt("reference"));
				tempNote.setNom_produit(rs.getString("nom_produit"));
				tempNote.setDescription(rs.getString("description"));
				tempNote.setCategorie(rs.getString("categorie"));
				tempNote.setImage(rs.getString("image"));
				tempNote.setPrix(rs.getFloat("prix"));
				
	
				listeNote.add(tempNote);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Read ERREUR !");
		}
		return listeNote;
	}

	public List<Monture> Monture(String requete) {
		// TODO Auto-generated method stub
		return null;
	}

	public bean.Monture read(String parameter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}