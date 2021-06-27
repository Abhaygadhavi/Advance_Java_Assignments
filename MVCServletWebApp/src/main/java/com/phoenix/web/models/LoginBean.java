/*
 * Author: abhay.gadhvi@stltech.in
 * Version:1
 * CopyRight:Sterlite Technologies Ltd.
 * 
 */

package com.phoenix.web.models;

public class LoginBean {

	//private data members
	private String username;
	private String password;
	
	//setter and getter methods
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
	
	//business logic for validating the user
	public boolean isValid() {
		
		if(username!=null && password!=null && username.equals("Abhay") && password.equals("ab742"))
			return true;
		else
			return false;
	}
	
}
