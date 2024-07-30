package com.facebook.controller;

import java.util.Scanner;

import com.facebook.Entity.FacebookUser;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;

public class FacebookController implements facebookControllerInterface {

	@Override
	public void createProfileContoller() {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.next();
		System.out.println("Enter your password");
		String password=scan.next();
		System.out.println("Enter your email");
		String email=scan.next();
		System.out.println("Enter your address");
		String address=scan.next();
		
		FacebookUser fc=new FacebookUser();
		fc.setName(name);
		fc.setPassword(password);
		fc.setEmail(email);
		fc.setAddress(address);
		
		FacebookServiceInterface fs=new FacebookService();
		
		int i=fs.createProfileService(fc);
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub
		
	}

}
