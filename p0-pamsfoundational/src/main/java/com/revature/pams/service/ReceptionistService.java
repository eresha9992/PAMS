/**
 * 
 */
package com.revature.pams.service;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.dbcon.DbCon;
import com.revature.model.Application;
import com.revature.util.TimeZoneConversion;


/**
 * @author Dell
 *
 */
public class ReceptionistService {
	private static final Logger logger=Logger.getLogger(Application.class);

	 public String receptionistname;
		public void receptionist() {
		 
		 DbCon dbconnection=new DbCon();		 
		 //Login login=new Login();		 
		 //Date datetime=new Date();
		 
		 
		 try {
			 	
			 ResultSet receptionist_name=dbconnection.myStm.executeQuery("select Receptionist_name from Receptionist where current_time() between  Receptionist_startime and Receptionist_endtime");
				
				if(receptionist_name.next()) {
					receptionistname=receptionist_name.getString(1);
//					logger.info("Hi iam "+receptionist_name.getString(1)+" How may i Help you "+Login.login_user_name);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		 
	 }
		public void getUserInput1() {
			// TODO Auto-generated method stub
			
		}
		public void displayReceptionistDetails() {
			// TODO Auto-generated method stub
			
		}
		public void getUserInput() {
			// TODO Auto-generated method stub
			
		}
	}


