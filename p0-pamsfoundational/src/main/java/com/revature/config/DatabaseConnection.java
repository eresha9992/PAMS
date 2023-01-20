//package com.revature.config;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.ResourceBundle;
//
//public class DatabaseConnection {
//	private static Connection connection=null;
//	
//	private DatabaseConnection(){
//	}
//		public static Connection getConnection() {
//			if(connection ==null)
//			{
//				ResourceBundle resourceBundle=ResourceBundle.getBundle("PAMS_add");
//				String driver=resourceBundle.getString("driver");
//				String dburl=resourceBundle.getString("dburl");
//				String username=resourceBundle.getString("username");
//				String password=resourceBundle.getString("password");
//				try {
//					Class.forName("Driver");
//					connection=DriverManager.getConnection(dburl,username,password);
//				} catch(ClassNotFoundException|SQLException e) {
//					e.printStackTrace();
//			}
//			
//		}
//			return connection;
//		}
//	
//
//
//	//private static Connection con=null;
////static {
//	//String url="jdbc:mysql://localhost:3307/PAMS_add";
//	//String user="root";
//	//String pass="root";
//	//try {
//		//con=DriverManager.getConnection(url, user, pass);
//	//} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		//e.printStackTrace();
//	//}
//
////public static Connection getConnection()
////{
//    //return con;
////}
//}
//}
