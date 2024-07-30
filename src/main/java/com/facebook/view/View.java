package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.facebookControllerInterface;


public class View {

	
	public static void main(String[] args) {
		
		
		System.out.println("****Main menu*****");
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to view profile");
		System.out.println("Press 3 to edit profile");
		System.out.println("Press 4 to delete profile");
		System.out.println("Press 5 to search profile");
		System.out.println("Press 6 to viewALl profile");
		System.out.println("Press 7 to login profile");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice");
		int c=scan.nextInt();
		facebookControllerInterface fc= new FacebookController();
		
		switch(c) {
		case 1:fc.createProfileContoller();
			break;
		case 2:fc.viewProfileController();
			break;
		case 3:fc.editProfileController();
			break;
		case 4:fc.deleteProfileController();
			break;
		case 5:fc.searchProfileController();
			break;
		case 6:fc.viewAllProfileController();
			break;
		case 7:fc.loginProfileController();
			break;
			default:
				System.out.println("Wrong choice");
		}
		
		
		
		
		
		
		
		
	}

	private static facebookControllerInterface facebookControllerInterface() {
		// TODO Auto-generated method stub
		return null;
	}
}
