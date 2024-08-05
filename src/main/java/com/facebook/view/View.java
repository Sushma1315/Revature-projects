package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.facebookControllerInterface;


public class View {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
		
		String ss="y";
		
		while(ss.equals("y")) {
		System.out.println("****Main menu*****");
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to view profile");
		System.out.println("Press 3 to viewAll profile");
		System.out.println("Press 4 to search profile");
		System.out.println("Press 5 to login profile");
		System.out.println("Press 6 to edit profile");
		System.out.println("Press 7 to delete profile");
		
		
		System.out.println("Enter your choice");
		int c=scan.nextInt();
		
		
	
		facebookControllerInterface fc= new FacebookController();
		switch(c) {
		case 1:fc.createProfileContoller();
			break;
		case 2:fc.viewProfileController();
			break;
		case 3:fc.viewAllProfileController();
			break;
		case 4:fc.searchProfileController();
			break;
		case 5:fc.loginProfileController();
			break;
		case 6:fc.editProfileController();
			break;
		case 7:fc.deleteProfileController();
			break;
		
		
		default:
				
				System.out.println("Wrong choice");
		}
		
		System.out.println("Enter y to continue");
		ss=scan.next();
		
		
		}
		
	}
		
		
	}

	

