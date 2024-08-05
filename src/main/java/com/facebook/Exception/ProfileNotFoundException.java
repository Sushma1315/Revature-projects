package com.facebook.Exception;

public class ProfileNotFoundException extends Exception {
	
	String email;
	public ProfileNotFoundException(String email) {
		// TODO Auto-generated constructor stub
		this.email=email;
	
		
	}

	public String toString() {
		
		return "Wrong email"+email;
	}
	
	
	
	
	

}
