/**
 * 
 */
package com.dbcon;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Logger;


/**
// * @author Dell
// *
// */
//public class DatabaseConnection {
//	private static Connection connection=null;
//
//	public static Connection getConnection() {
//		if(connection == null) {
//			ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
//			String dburl =resourceBundle.getString("durl");
//			String username =resourceBundle.getString("username");
//			String pass =resourceBundle.getString("password");
//			try {
//				Class.forName(resourceBundle.getString("driver"));
//				connection =DriverManager.getConnection(dburl, username, pass);
//			} catch (ClassNotFoundException e) {
//				System.out.println(e.getMessage());
//			} catch (SQLException e)
//			{
//				System.out.println(e.getMessage());
//			}
//		}
//		return connection;
//	}
//}



public class DatabaseConnection {
	private static DatabaseConnection instance = new DatabaseConnection();
// private constructor
private DatabaseConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}

private Connection createConnection() {
	Connection connection = null;
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/HOSPTIAL", "root", "root");
	} catch (SQLException e) {
		System.out.println("ERROR: Unable to Connect to Database.");
	}
	return connection;
}

public static Connection getConnection() {
	return instance.createConnection();
}
}