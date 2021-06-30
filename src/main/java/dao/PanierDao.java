package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Monture;
import bean.Montureh;
import bean.Panier;
import bean.user;

public class PanierDao implements IDAO<Panier> {
	
	Connection connect = Connect.getConnection(); 
	
	@Override
	
	public boolean create(Monture object) {
		boolean connectionOK = false;
		try {
			PreparedStatement req = connect.prepareStatement("INSERT INTO panier " + "(reference, quantite, prix, nom_produit)" + " VALUES (?,?,?,?) ");
			req.setInt(1, object.getReference());
			System.out.println("reference " + object.getReference());
			System.out.println("prix " + object.getPrix());
			
			req.setInt(2, 1);
			req.setFloat(3, object.getPrix());
			req.setString(4, object.getNom_produit());
			System.out.println(object.getNom_produit());
			
			System.out.println(req);
			req.executeUpdate();
			System.out.println("Create ok");
			connectionOK = true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Create ERREUR !");
		}
		return connectionOK;
	}
	
	public boolean create(Montureh object) {
		boolean connectionOK = false;
		try {
			PreparedStatement req = connect.prepareStatement("INSERT INTO panier " + "(reference, quantite, prix, nom_produit)" + " VALUES (?,?,?,?) ");
			req.setInt(1, object.getReference());
			System.out.println("reference " + object.getReference());
			System.out.println("prix " + object.getPrix());
			
			req.setInt(2, 1);
			req.setFloat(3, object.getPrix());
			req.setString(4, object.getNom_produit());
			System.out.println(object.getNom_produit());
			
			System.out.println(req);
			req.executeUpdate();
			System.out.println("Create ok");
			connectionOK = true;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Create ERREUR !");
		}
		return connectionOK;
	}
	@Override
	public List<Panier> read() {
		List<Panier> listeUser = new ArrayList<>();
		//Panier tempUser = new Panier();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM panier");
			ResultSet rs = req.executeQuery();
			
			while(rs.next()) {
				Panier tempUser = new Panier();
				tempUser.setReference(rs.getInt("reference"));
				tempUser.setNom_produit(rs.getString("nom_produit"));
				tempUser.setQuantite(rs.getInt("quantite"));
				tempUser.setPrix(rs.getFloat("prix"));
				
				listeUser.add(tempUser);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Read ERREUR !");
		}
		return listeUser;
	}
	
	@Override
	public void update(Panier object) {
		try {
			PreparedStatement req = connect.prepareStatement("UPDATE panier SET reference = ?, quantite = ? WHERE id = ?");
			req.setInt(1, object.getReference());
			req.setInt(2, object.getQuantite());
			
			req.executeUpdate();
			
			System.out.println("Update ok");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Update ERREUR !");
		}
		
	}

	@Override
	public void delete(Panier panier) {
		try {
			PreparedStatement req = connect.prepareStatement("DELETE FROM panier WHERE id = ?");
		
			req.executeUpdate();
			
			System.out.println("Delete ok");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Delete ERREUR !");
		}
	}

	
	public void deleteAll() {
		try {
			PreparedStatement req = connect.prepareStatement("DELETE FROM panier ");
		
			req.executeUpdate();
			
			System.out.println("Delete ok");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Delete ERREUR !");
		}
	}

	@Override
	public List<Panier> lister() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Panier> findById(int id) {
		List<Panier> listePanier = new ArrayList<>();
		Panier tempUser = new Panier();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM panier where id =? ");
			ResultSet rs = req.executeQuery();
			
			while(rs.next()) {
				
				tempUser.setReference(rs.getInt("reference"));
				tempUser.setQuantite(rs.getInt("quantite"));
				
				listePanier.add(tempUser);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Read ERREUR !");
		}
		return listePanier;
	}
		

	@Override
	public void vider_table(Panier object) {
		// TODO Auto-generated method stub
		
	}

	
	
	@Override
	public user login(String email, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Panier object) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

}