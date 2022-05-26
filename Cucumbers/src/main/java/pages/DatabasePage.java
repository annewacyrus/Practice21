//package pages;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DatabasePage {
//
//public String getData() {
//	Connection connection;
//	Statement statement;	
//	//setting properties for mySQL
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	    String sqlUrl = "jdbc:mysql://localhost:3306/september2021";  //url for the database
//	    String sqlUsername = "root";
//	    String sqlPassword = "admin";
//	    String query = "Select * from users";
//	
//	//create connection to local DB
//	connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
//	} catch (ClassNotFoundException e) {
//		e.printStackTrace();
//	} catch (SQLException e) {
//	  e.printStackTrace();
//	}
//	
//	
//	return null;
//	
//	
//}
//
//
//}
