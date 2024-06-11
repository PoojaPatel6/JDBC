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
		
		//String query = "Insert into ADIT values(1,'Pooja','pooja@gmail.com')";
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


		
		 // 8th Step
	    
	    //Update data in the table
		
//	    String  query = "update ADIT set name='Anshi' where id= 2";
//	    String  query = "update ADIT set mobile=4357892334 where id= 4";      //update mobile number
//	    Statement st = conn.createStatement();
//	    st.execute(query);
//		System.out.println("Data is Updated.");
//	    
	    
	    //Delete data     9th Step
	   
//         String query = "delete from ADIT where name ='Anshi'";
//         Statement st = conn.createStatement();
// 	   st.execute(query);
//         System.out.println("Deleted data Successfully...");
	    
	    
//	    //  Add new Column   10th Step 
	    
	    
//	    String query= "alter table ADIT add mobile int ";
//	    Statement st = conn.createStatement();
//	    st.execute(query);
//	    System.out.println("Added Successfully...");
	    
	    
	    
	    //drop database or table
	    
//       String query = "drop table  adit";
//     	 Statement st = conn.createStatement();
//	 st.execute(query);	
//	 System.out.println("Deleted Successfully");
//	    		
	    		
	   //delete any column   11th step
	    
//	String query = "alter table ADIT drop column mobile";
//	Statement st = conn.createStatement();
//	st.execute(query);
//	System.out.println("Deleted Column Successfully..");
//	   
	    
	  
	    //Fetching data from the table
	    
//      String query = "select * from ADIT where age= 22";
//      Statement st = conn.createStatement();
//      ResultSet a = st.executeQuery(query);
//      System.out.println("Name  - AGE - MAIL");
//      while(a.next()) {
//    	 System.out.println(a.getString("name")+ "-"+a.getInt("age")+"-"+a.getString("mail"));
//     }
	    
	   }
	}
