package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Connection;

import bean.Monture;
import bean.user;


//DAO = couche de persistance

public class UserDao implements IDAO<user>{ 

	//important!!! permet la conexion!!

	Connection connect = Connect.getConnection();
	
		public boolean create(user object) {
		boolean message =false;
		try {
			
			PreparedStatement req = connect.prepareStatement("INSERT INTO user "
					+ "(nom, prenom, email, mot_de_passe) VALUES (?,?,?,?) ");
			
			req.setString(1, object.getNom()); 
			req.setString(2, object.getPrenom());
			req.setString(3, object.getEmail());
			req.setString(4, object.getMot_de_passe());
			
			System.out.println(req);
			req.executeUpdate();  
			
			System.out.println(" Felicitation l'utilisateur à bien ete ajouté!");
			
			message=true;
					
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Oupps erreur lors de la création de l'utilisateur!" );
			                  
		}
			return message;
	}
 
		public user login(String email, String mot_de_passe) {
		
			//return null;
			
			try {
				PreparedStatement req = connect.prepareStatement("SELECT * FROM user WHERE email=?");
				
				req.setString(1, email);
				
				ResultSet rs = req.executeQuery();
				
				while(rs.next()) {

					if (BCrypt.checkpw(mot_de_passe, rs.getString("mot_de_passe"))) {
						 return new user(rs.getString("nom"),rs.getString("prenom"),rs.getString("email")
								 ,rs.getString("mot_de_passe"));

					}
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return null;
		}

		public Object login(String prenom, String nom, String email, String mot_de_passe) {
		
			return null;
		}

		@Override
		public List<user> read() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void update(user object) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(user object) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<user> lister() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<user> findById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void vider_table(user object) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean create(Monture object) {
			// TODO Auto-generated method stub
			return false;
		}

		
			
		

}
