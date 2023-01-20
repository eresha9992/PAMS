/**
 * 
 */
package com.dbcon;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.log4j.Logger;


import com.revature.model.Application;

/**
 * @author Dell
 *
 */
public class DbCon {
	private static final Logger logger=Logger.getLogger(Application.class);
	public static Connection myCon;
	@SuppressWarnings("exports")
	public Statement myStm;
    
    private String password;
    private String url;
	private String username;

	public DbCon()  {
    	 this.url="jdbc:mysql://localhost:3307/PAMS_add";
         this.username="root";
         this.password="root";
        
        try {
			myCon=DriverManager.getConnection(url, username, password);
			myStm=myCon.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
    }

}
