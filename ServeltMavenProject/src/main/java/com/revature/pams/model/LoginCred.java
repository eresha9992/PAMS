package com.revature.pams.model;

import java.sql.SQLException;

import com.revature.pams.dao.PamsMain;

public class LoginCred implements PamsMain {

/**
	 * 
	 */
	public LoginCred() {
		super();
	}
/**
	 * @param username
	 * @param password
	 */
//	public LoginCredentials(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}
	   //public void LoginCredentials() {
		private String username;
		private String password;
		public LoginCred(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public void LoginCredentials() throws Exception {
			// TODO Auto-generated method stub
			
		}
		
		
			}
	
		
		