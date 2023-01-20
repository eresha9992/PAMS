package com.revature.menu;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.model.Application;
import com.revature.pams.service.ReceptionistService;

public class ReceptionistOperationsMenu {
	private static final Logger logger=Logger.getLogger(Application.class);

public static void main(String[] args) {
			menuAppForReceptionist();
		}

		private static void menuAppForReceptionist() {
	// TODO Auto-generated method stub
	
}

		public static void menuAppFor() {
			int choice=0;
			int choices=0;
			Scanner sc=new Scanner(System.in);
			ReceptionistService rms=new ReceptionistService();
			do {
				logger.info("\nChoose 1 Receptionist Management Operation\n1.Add Details\n2.List Details\n3.Delete Details\n4.Update Details");
				choices=sc.nextInt();
				sc.nextLine();
				switch(choices) {
				case 1:		rms.getUserInput();
					break;
				case 2:		rms.displayReceptionistDetails();
					break;			
				default:
				logger.info("\nPlease enter the valid option");}
				logger.info("\nIf you want to continue press 1 otherwise press 0 to go outside loop");
				choice=sc.nextInt();
			} while (choice==1);
			sc.close();
			logger.info("\nprogram terminated1");
		}

		public void ReceptionistOperationsMenu() {
			// TODO Auto-generated method stub
			
		}
	}


