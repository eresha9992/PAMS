package com.revature.dao.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.dao.ReceptionistDetailsDao;
import com.revature.model.Application;
public class ReceptionistDetails implements ReceptionistDetailsDao 
{
	private static final Logger logger=Logger.getLogger(Application.class);
public void getUserInput() {
		Scanner s=new Scanner(System.in);
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//logger.infoln("Driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/PAMS_add", "root", "root");
			//logger.infoln("Connection Established");
			
		logger.info("\nEnter Receptinist name:");
		String receptionistName=s.nextLine();
		logger.info(" \nenter ReceptionistId:");
		int receptionistId=s.nextInt();
		logger.info("\nEnter Receptionist gender:");
		String receptionistGender=s.nextLine();
		logger.info("\nEnter Receptionist desigination:");
		String receptionistDesigination=s.nextLine();
		logger.info("\nEnter Receptionist date of birth:");
		String receptionistDateOfBirth=s.nextLine();
		logger.info("\nEnter Receptionist shift time:");
		String receptionistShiftTime=s.nextLine();
		logger.info("\nEnter Receptionist contact number:");
		String receptionistontactNumber=s.nextLine();
		logger.info("\nEnter Receptionist Address:");
		String receptionistAddress=s.nextLine();

		java.sql.Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("SELECT R_id FROM RECEPTIONIST");
		while(rs.next()) {
			int rid=rs.getInt(1);
			if(rid==receptionistId) {
//			if(receptionistId.equals(rid)){
			logger.info("\nEnter another RecetionistId");
		}
			else {
				String sql="INSERT into RECEPTIONIST(R_ID,R_Name,R_GENDER,R_DESIGINATION,R_DATE_OF_BIRTH,R_shiftTime,R_CONTACT_NUMBER,R_ADDRESS)values(?,?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, receptionistName);
				ps.setInt(2, receptionistId);
				ps.setString(3, receptionistGender);
				ps.setString(4, receptionistDesigination);
				ps.setString(5,  receptionistDateOfBirth);
				ps.setString(6, receptionistShiftTime);
				ps.setString(7, receptionistontactNumber);
				ps.setString(8, receptionistAddress);
				ps.executeUpdate();

			}
		}

		} catch (ClassNotFoundException | SQLException e) {
			logger.info("\nException" + e.getMessage());
		}
		try {
			con.close();
		} 
		catch (SQLException e) {}
	}

	public void displayReceptionistDetails() 
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//logger.infoln("Driver Loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/PAMS_add");
			//logger.infoln("Connection Established");
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM RECEPTIONIST");
			while(rs.next()) {
				String receptionistName=rs.getString(1);
				int receptionistId =rs.getInt(2);
				String receptionistGender =rs.getString(3);
				String receptionistDesigination=rs.getString(4);
				String receptionistShiftTime=rs.getString(5);
				String receptionistDateOfBirth=rs.getString(6);
				String receptionistontactNumber=rs.getString(7);
				String receptionistAddress=rs.getString(8);
				
				
				logger.info("\n"+receptionistName+" "+receptionistId+" "+receptionistGender+""+receptionistDesigination+""+receptionistShiftTime+""+receptionistDateOfBirth+""+receptionistontactNumber+""+receptionistAddress);
			}

		}catch(ClassNotFoundException | SQLException e ){
			logger.info(e.getMessage());
		}
		try {
			con.close();
		} 
		catch (SQLException e) {}
			
		}
	}



