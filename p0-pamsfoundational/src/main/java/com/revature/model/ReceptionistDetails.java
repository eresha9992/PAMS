package com.revature.model;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.dbcon.DbCon;
   public abstract class ReceptionistDetails {
	public abstract void addDetails();
	public abstract void listReceptionistDetails();
	public abstract void deleteReceptionistDetails();
	public abstract void updateReceptionistDetails();
}
class ChildReceptionistDetails extends ReceptionistDetails
{
	private static final Logger logger=Logger.getLogger(Application.class);

	ReceptionistRegistration  receptionistRegistrationObj=new ReceptionistRegistration();
	Scanner sc=new Scanner(System.in);
	DbCon mycon=new DbCon();
	Application Applicationobj=new Application();
//	PreparedStatement preparedStatementsmt;
//	public PreparedStatement Receinsert;
//	public int receInt;
	
	@Override
public void addDetails() {
		ChildReceptionistDetails childObj=new ChildReceptionistDetails();
		logger.info("\nPress 1: Add details");
		logger.info("\nEnter your name:");
		receptionistRegistrationObj.setReceptionistName(sc.next());
	
		logger.info("\nEnter Receptionist Id :");
		receptionistRegistrationObj.setReceptionistId(sc.nextInt());
		logger.info("\nEnter Receptionist Gender:");
		receptionistRegistrationObj.setReceptionistGender(sc.next());
		
		logger.info("\nEnter Receptionist Desigination: ");
		receptionistRegistrationObj.setReceptionistDesigination(sc.next());
		
		logger.info("\nEnter Receptionist date of birth: ");
		receptionistRegistrationObj.setReceptionistDateOfBirthDate(sc.next());
		
		logger.info("\nEnter Receptionist Shift time: ");
		receptionistRegistrationObj.setReceptionistShiftTime(sc.next());
		logger.info("\nEnter Receptionist contact number: ");
		receptionistRegistrationObj.setReceptionistContactNumber(sc.next());
		
		logger.info("\nEnter Receptionist address: ");
		receptionistRegistrationObj.setReceptionistAddress(sc.next());
		
		
		String RegInsert="INSERT INTO `receptionist` \r\n"
				+ "(`R_NAME`, \r\n"
				+ "`R_ID`, \r\n"
				+ "`R_GENDER`, \r\n"
				+ "`R_DESIGINATION`, \r\n"
				+ "`R_DATE_OF_BIRTH`, "
				+ "`R_AGE`, \r\n"
				+ "`R_CONTACT_NUMBER`, "
				+ "`R_ADDRESS`) "
				+ "VALUES "
				+ "(?,?,?,?,?,?,?,?);";
		
//		R_NAME VARCHAR(10) NOT NULL,
//		R_ID INT PRIMARY KEY,
//		R_GENDER CHAR,
//		R_DESIGINATION VARCHAR(100),
//		R_DATE_OF_BIRTH DATE,
//		Shift varchar(30),
//		R_CONTACT_NUMBER VARCHAR(10),
//		R_ADDRESS VARCHAR(10),
	
		try {
			PreparedStatement Receinsert=DbCon.myCon.prepareStatement(RegInsert);
			
			Receinsert.setString(1,receptionistRegistrationObj.getReceptionistName());
			Receinsert.setInt(2, receptionistRegistrationObj.getReceptionistId());
			Receinsert.setString(3,receptionistRegistrationObj.getReceptionistGender());
			Receinsert.setString(4,receptionistRegistrationObj.getReceptionistDesigination());
			Receinsert.setString(5, receptionistRegistrationObj.getReceptionistDateOfBirthDate());
			Receinsert.setString(6, receptionistRegistrationObj.getReceptionistShiftTime());
			Receinsert.setString(7, receptionistRegistrationObj.getReceptionistContactNumber());
			Receinsert.setString(8, receptionistRegistrationObj.getReceptionistAddress());
			
			logger.info("\n"+RegInsert);
			int receInt=Receinsert.executeUpdate();
			if(receInt==0) {
				logger.info("\nNot Registered");
			}
			else {
				logger.info("\nRegisterd Sucessfully");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	 
	@Override
	public void listReceptionistDetails() {
		logger.info("\nPress 2: list ReceptionistDetails");
		logger.info("\nEnter your name: ");
		String name = sc.next();
		logger.info("\nEnter Receptionist Id :");
		int id=sc.nextInt();
		logger.info("\nEnter Receptionist Gender:");
		String gender=sc.next();
		logger.info("\nEnter Receptionist Desigination: ");
		String desigination=sc.next();
		logger.info("\nEnter Receptionist date of birth: ");
		String dob=sc.next();
		logger.info("\nEnter Receptionist Shift time: ");
		String shiftTime=sc.next();
		logger.info("\nEnter Receptionist contact number: ");
		String contact=sc.next();
		logger.info("\nEnter Receptionist address: ");
		String address=sc.next();
		

	}
	@Override
	public void deleteReceptionistDetails() {
		logger.info("\nPress 3: Delete ReceptionistDetails");
		logger.info("\nEnter your name: ");
		String name = sc.next();
		logger.info("\nEnter Receptionist Id :");
		int id=sc.nextInt();
		logger.info("Enter Receptionist Gender:");
		String gender=sc.next();
		logger.info("\nEnter Receptionist Desigination: ");
		String desigination=sc.next();
		logger.info("\nEnter Receptionist date of birth: ");
		String dob=sc.nextLine();
		logger.info("\nEnter Receptionist Shift time: ");
		String shiftTime=sc.next();
		logger.info("\nEnter Receptionist contact number: ");
		String contact=sc.next();
		logger.info("\nEnter Receptionist address: ");
		

	}
	@Override
	public void updateReceptionistDetails() {
		ChildReceptionistDetails childObj1=new ChildReceptionistDetails();
		int r_id = 0;
		
				
				try {
					Applicationobj.receptionistList=mycon.myStm.executeQuery("select * from RECEPTIONIST");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					while(Applicationobj.receptionistList.next()) {
						logger.info("\n"+Applicationobj.receptionistList.getString(1)+" "+Applicationobj.receptionistList.getString(2)+" "+
					Applicationobj.receptionistList.getString(3)+" "+Applicationobj.receptionistList.getString(4)+" "+Applicationobj.receptionistList.getString(5)+" "+
					Applicationobj.receptionistList.getString(6)+" "+Applicationobj.receptionistList.getString(7)+"  "+Applicationobj.receptionistList.getString(8));
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
		
		
		
		logger.info("\nSelect the id Want to Update");
		r_id=sc.nextInt();
		logger.info("\nEnter your name: ");
		String name = sc.next();
		logger.info("\nEnter Receptionist Id :");
		int id=sc.nextInt();
		logger.info("\nEnter Receptionist Gender:");
		String gender=sc.next();
		logger.info("\nEnter Receptionist Desigination: ");
		String desigination=sc.next();
		logger.info("\nEnter Receptionist date of birth: ");
		String dob=sc.next();
		logger.info("\nEnter Receptionist Shift time: ");
		String shiftTime=sc.next();
		logger.info("\nEnter Receptionist contact number: ");
		String contact=sc.next();
		logger.info("\nEnter Receptionist address: ");
		String address=sc.next();
		
		
		String updateQuery="Update receptionist set R_Name=?,R_ID=?,R_GENDER=?,"
				+ "R_DESIGINATION=?,R_DATE_OF_BIRTH=?,R_AGE=?,R_CONTACT_NUMBER=?,R_ADDRESS=? where R_id="+r_id;
		
		try {
//			preparedStatementsmt=DbCon.myCon.prepareStatement(updateQuery);
			PreparedStatement preparedStatementsmt=DbCon.myCon.prepareStatement(updateQuery);
			preparedStatementsmt.setString(1,name);
			preparedStatementsmt.setInt(2,id);
			preparedStatementsmt.setString(3,gender);
			preparedStatementsmt.setString(4,desigination);
			preparedStatementsmt.setString(5,dob);
			preparedStatementsmt.setString(6,shiftTime);
			preparedStatementsmt.setString(7,contact);
			preparedStatementsmt.setString(8,address);

			int updatecheck=preparedStatementsmt.executeUpdate();
			if(updatecheck==1) {
				logger.info("\nSuccessfully updated");
			}
			else {
				logger.info("\nNot Updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

	}
	}

