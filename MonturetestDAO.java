package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Categorie;
import bean.Monturetest;



public class MonturetestDAO {
	
	Connection connect = Connect.getConnection();
	
	
	  public boolean create(Monturetest object) {
			boolean response = false;
			try {
				PreparedStatement request = connect.prepareStatement("INSERT INTO monturetest (nom, description, image,prix, quantite, categorie" 
						+ "VALUES (?,?,?,?,?,?)");
			 
				request.setString(1, object.getNom());
				request.setString(2, object.getDescription());
				request.setString(3, object.getImage());
				request.setFloat(4, object.getPrix());
				request.setInt(5, object.getQuantite());
				request.setObject(6, object.getCategorie());
				
				request.executeUpdate();
				
				response = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return response;
		}
/*------------------------------------------------------------------------------------------------------------------------------------------------------*/
	  
	  public ArrayList<Monturetest> readByCategorie(String id) {
			ArrayList<Monturetest> response = null;
			try {
				PreparedStatement request = connect.prepareStatement("SELECT monturetest.id, monturetest.nom, monturetest.description, monturetest.image,monturetest.prix, monturetest.quantite, monturetest.categorie, categories.nom , categories.id FROM monturetest , categories "
																	+ "where monturetest.categorie = categories.id and categories.id=" + id);
				ResultSet rs = request.executeQuery();
				response = new ArrayList<Monturetest>();
				while(rs.next()) {
					Categorie cat= new Categorie(rs.getInt(7),
	                  rs.getString(8));
	                     
				Monturetest tout = new Monturetest (rs.getInt(1), 
						                    rs.getString(2),
				                           rs.getString(3),
									       rs.getString(4),
									       rs.getFloat(5),
									       rs.getInt(6),
									       cat);
									       
									          
				System.out.println(request);
				response.add(tout); 
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return response;
		}
/*----------------------------------------------------------------------------------------------------------------------------------------------------*/
	  public Monturetest read(int Int) {
		  Monturetest rec = new Monturetest();
			
			try {
				PreparedStatement request = connect.prepareStatement("SELECT * FROM Monturetest WHERE id = ? ;");
				request.setInt(1, Int); 
				System.out.println(request);
				ResultSet rs = request.executeQuery();
				while(rs.next()) {
					rec.setId(rs.getInt(1));    
					rec.setNom(rs.getString("nom"));
					rec.setDescription(rs.getString("description"));
					rec.setImage(rs.getString("Image"));
					rec.setPrix(rs.getFloat("prix"));
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return rec;
		};
}
