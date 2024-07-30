package com.facebook.service;

import com.facebook.dao.FacebookDAO;
import com.facebook.dao.FacebookDAOInterface;
import com.facebook.Entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	
	public int createProfileService(FacebookUser fc) {
		// TODO Auto-generated method stub
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.createProfileDAO();
		
		return 0;
		
	}

	

}
