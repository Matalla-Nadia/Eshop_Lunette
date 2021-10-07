package dao;


	import java.sql.Connection;
	import java.sql.DriverManager;

	public class Connect {
		
	
		public static Connection getConnection() {
			Connection connect = null;
		
			
		String url="jdbc:mysql://localhost/";
		String database="blogjee";
		String user="root";
		String password="";

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connect = DriverManager.getConnection(url+database,user,password);
			 System.out.println("Connection ok");
			
		}catch(Exception e) {
			System.out.println("Connection KO");
			e.printStackTrace();
		}
		return connect;
	}

	}

	
	
	

