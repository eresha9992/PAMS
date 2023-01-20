package com.revature.dao;
import java.util.ArrayList;
import java.util.List;

public interface ReceptionistDetailsDao{

	public abstract void getUserInput();
	public abstract void displayReceptionistDetails();


public interface UserDao {

		static List<UserDao>UserInfo=new ArrayList<>();
		public void getUser();
		public void DisplayUser();
	}
}


