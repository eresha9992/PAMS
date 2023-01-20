package com.revature.pams.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.dbcon.DbCon;
import com.revature.menu.ReceptionistOperationsMenu;
import com.revature.model.Application;

public class LoginImp {
	private static final Logger logger=Logger.getLogger(Application.class);
	Scanner sc = new Scanner(System.in);
	private static DbCon mycon=new DbCon();
	ReceptionistOperationsMenu m=new ReceptionistOperationsMenu();
    
	
	public void ReceptionistLogin() throws SQLException {
		int loggoff=0;
		do {
			logger.info("\n########## Admin Page ###########\n");
			logger.info("\nPress 1 for Register:- ");
			logger.info("\nPress 2 for Login:- ");
			int q=sc.nextInt();
			if(q==2)
			{
			logger.info("\nEnter your USERNAME  :-");
			
			String username = sc.next();
			
			
			logger.info("\nEnter your PASSWORD :-");
			String password = sc.next();
			
//			Connection Dbcon = null;
			Statement stms=DbCon.myCon.createStatement();
			ResultSet rs = stms.executeQuery("select * from PAMS_Admin");
			
			if(rs.next()) {
				if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
					logger.info("\n########### WELCOME ###########\n");
					m.ReceptionistOperationsMenu();
					
				}
				else {
					logger.info("\nEnter correct details\n");
					logger.info("\nWant to enter again press 1\n");
					int again=sc.nextInt();
					loggoff=again;
				}
			}
			
			}
			}while(loggoff==1);
	}
		
}

