package com.facebook.Exception;

public class LoginNotSuccessfulException extends Exception {
	String name;
	
	public LoginNotSuccessfulException(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	public String toString() {
		
		return "login unsucessful with this name"+name;
		
	}

}
