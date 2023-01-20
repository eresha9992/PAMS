package com.revature.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.dbcon.DbCon;
import com.revature.pams.service.LoginImp;

public class Application {
	
	static Application applicationobj=new Application();
	public ResultSet receptionistList;
	private static final Logger logger=Logger.getLogger(Application.class);
	public PreparedStatement recDelStm;
	
	public static void main(String[] args) {
		
		LoginImp l=new LoginImp();
		try {
			l.ReceptionistLogin();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			applicationobj.Menu();
	}



	public void Menu() {
		char isnot;
		//ArraySort
		DbCon mycon=new DbCon();
		Application Applicationobj=new Application();
		Scanner sc=new Scanner(System.in);
		logger.info("\nPress 1:Add details");
		logger.info("\nPress 2:listReceptionistDetails");
		logger.info("\nPress 3:DeleteReceptionistDetails");
		logger.info("\nPress 4:updateReceptionistDetails");
		logger.info("\npress 5:ExitReceptionistDetails");
		int press=sc.nextInt();
		ChildReceptionistDetails ctd=new ChildReceptionistDetails();
		do {
			
			switch(press)
		{
		case 1:
		ctd.addDetails();
//		getUserInput();
		
		break;
		case 2:
			//String receptionistList="select * from RECEPTIONIST";
			
			try {
				Applicationobj.receptionistList=mycon.myStm.executeQuery("select * from RECEPTIONIST");
			} catch (SQLException e) {
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
			
//		ctd.listReceptionistDetails();
		break;
		case 3:{
			logger.info("\n------Select the Receptionist ID want to delete");
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
				// TODO Auto-gace();
			}
			int delRecId=sc.nextInt();
			
			try {
				Applicationobj.recDelStm=mycon.myCon.prepareStatement("delete from receptionist where R_ID="+delRecId);
				int checkdelrec=Applicationobj.recDelStm.executeUpdate();
				if(checkdelrec==1) {
					logger.info("\n-----Successfully Deleted---- ");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  break;
		}
	      
		case 4:
		ctd.updateReceptionistDetails();
			break;
		
		case 5:
			System.exit(0);
			

		default:
			logger.info("\nPlease press valid key !");
		}
			logger.info("\nDo you want to continue (Y/N) :");
			isnot=sc.next().toUpperCase().charAt(0);
			if(isnot=='N')
			{
				logger.info("\nBye Bye");
				System.exit(0);
			}
			else if(isnot=='Y') {
				Menu();
			}
//		
		}	while (isnot=='Y');
	}
		

	
	private static void AddDetails() {
		// TODO Auto-generated method stub
		
}
}

