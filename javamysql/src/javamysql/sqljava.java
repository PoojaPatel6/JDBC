package javamysql;
import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;



public class sqljava {
	public static void main(String[]args)  throws ClassNotFoundException, SQLException{
		//Driver registation
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
		// database connection  1st step
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsti","root", "");  // mention the database name (4rth step)
	    System.out.println("Connection Established: "+conn);
		
	    
	    
	    
	    //create databases  2nd step
	    
//		Statement st = conn.createStatement();
//  	st.executeUpdate("create database nsti");
	    
	    // Show Databases   3rd step
	    
//	   ResultSet rs = st.executeQuery("show databases");
//        while(rs.next()) {
//		
//	System.out.println(rs);
//		System.out.println(rs.getString(1));  // database showing with name format not object format
//	 }
   
	    
//	     mention the database name (4rth step)
	    
	    
//       create table 5th step
		
		// Create table
		
//		String sql = "create table  ADIT(id int, name varchar(40), mail varchar(45) primary key)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//	    System.out.println("table created");
	    
		
		// Insert Data  6th step
		
		//String query = "Insert into ADIT values((1,'Pooja','pooja@gmail.com')";
//	    String query = "Insert into ADIT values(2,'Princy','princy@gmail.com'), (3,'bulbul', 'bulbul@gmail.com'), (4,'Neha','neha@gmail.com')";
//	    Statement st = conn.createStatement();
//	    st.executeUpdate(query);
//	    System.out.println("Data Inserted Successfully");
    
		
	
		
//( table format)    7th step
		// Read 
	   String query = "select * from ADIT";
	   Statement st = conn.createStatement();
	   ResultSet res =  st.executeQuery(query);
	   System.out.println(res);
		
		while(res.next()) {
			System.out.println(res.getInt("id")+ "-" + res.getString("name") +" -" + res.getString("mail"));
		}
		
	   }
	}
