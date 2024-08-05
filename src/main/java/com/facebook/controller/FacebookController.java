package com.facebook.controller;

import java.util.List;
import java.util.Scanner;

import com.facebook.Entity.FacebookUser;
import com.facebook.Exception.LoginNotSuccessfulException;
import com.facebook.Exception.ProfileNotFoundException;
import com.facebook.service.FacebookService;
import com.facebook.service.FacebookServiceInterface;
import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

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
		
		if(i>0) {
			System.out.println("Profile created");
		}
		else {
			System.out.println("Profile not created");
		}
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter email to view profile");
		String email=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setEmail(email);
		
		FacebookServiceInterface fs=new FacebookService();
		
		
		
		FacebookUser res=fs.viewProfileService(fu);
		
		try {
		if(res!=null) {
			System.out.println("Profile found");
			
			System.out.println("Your name is--------->"+fu.getName());
			System.out.println("Your password is----->"+fu.getPassword());
			System.out.println("Your email is---------->"+fu.getEmail());
			System.out.println("Your address is ---------->"+fu.getAddress());
		}
		else {
			throw new ProfileNotFoundException("Profile not found for this email  "+email);
		}
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter email to edit");
		String email=scan.next();
		
		FacebookUser fu=new FacebookUser();
		
		fu.setEmail(email);
		FacebookServiceInterface fs=new FacebookService();
		FacebookUser res=fs.viewProfileService(fu);
		
		try {
		if(res!=null) {
			System.out.println("Your old profile");
			System.out.println("Your name is ---------->"+fu.getName());
			System.out.println("Your password is-----------"+fu.getPassword());
			System.out.println("Your email is ----------->"+fu.getEmail());
			System.out.println("Your addressis --------->"+fu.getAddress());
			
			
			System.out.println("Press 1 to edit password");
			System.out.println("Press 2 to edit address");
			int c=scan.nextInt();
		
		switch(c) {
		case 1:
			
			
			System.out.println("Enter your new password");
			String password=scan.next();
			
			fu.setPassword(password);
			
			int res1=fs.editProfileService(fu);
			
			if(res1>0) {
				
				System.out.println("Password updated");
			}
				
				
			break;
		case 2:
			
			System.out.println("Enter new address");
			String address=scan.next();
			
			fu.setAddress(address);
			
			int res3=fs.editProfileService(fu);
			
			if(res3>0) {
				System.out.println("New Address updated");
			}
			
			break;
			
			
			default:System.out.println("Wrong choice");
				
			}
			
			
		}	
		
		else {
			throw new ProfileNotFoundException("Profile Not found for given email"+ email);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		
		



	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your name to delete");
		String name=scan.next();
		
		
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.deleteProfileService(fu);
		
		if(i>0) {
			System.out.println("profile deleted");
		}

		
		
	}

	@Override
	public void searchProfileController() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name to search");
		String name=scan.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		FacebookServiceInterface fs=new FacebookService();
	    FacebookUser ll=fs.searchProfileService(fu);
	    try {
	    if(ll!=null) {
	    	System.out.println("Profile found");
	    }
	    else {
	    	throw new ProfileNotFoundException(name);
	    }
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub
		FacebookServiceInterface fs=new FacebookService();
		List<FacebookUser> li=fs.viewAllProfileService();
		
		for(FacebookUser vv:li) {
			System.out.println("--------------------------------------");
			System.out.println("Name is ------->"+vv.getName());
			System.out.println("Password is------>"+vv.getPassword());
			System.out.println("Email is -------->"+vv.getPassword());
			System.out.println("Address is ----->"+vv.getAddress());
			
			
			System.out.println("--------------------------------------");
		}
		
		
	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name to login");
		String name=scan.next();
		
		System.out.println("Enter yur password");
		
		String password=scan.next();
		
		FacebookUser fu=new FacebookUser();
		
		fu.setName(name);
		fu.setPassword(password);
		
		FacebookServiceInterface fs=new FacebookService();
		FacebookUser res=fs.loginProfileService(fu);
		try {
		if(res!=null) {
			System.out.println("Login successfull");
		}
		else {
			throw new LoginNotSuccessfulException(name);
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
