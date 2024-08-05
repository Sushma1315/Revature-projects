package com.facebook.service;

import com.facebook.dao.FacebookDAO;
import com.facebook.dao.FacebookDAOInterface;

import java.util.List;

import com.facebook.Entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	
	public int createProfileService(FacebookUser fc) {
		// TODO Auto-generated method stub
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.createProfileDAO(fc);
		
		return i;
		
	}

	@Override
	public FacebookUser viewProfileService(FacebookUser fu)
	{
		
		FacebookDAOInterface fd=new FacebookDAO();
		FacebookUser res=fd.viewProfileDAO(fu);
		
		return res;
		
	}

	@Override
	public List<FacebookUser> viewAllProfileService() {
		// TODO Auto-generated method stub
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.viewAllProfileDAO();
		
		

	}

	@Override
	public FacebookUser searchProfileService(FacebookUser fu) {
		// TODO Auto-generated method stub
		
		FacebookDAOInterface fd=new FacebookDAO();
		
		
		return fd.searchProfileDAO(fu);
	}


	@Override
	public FacebookUser loginProfileService(FacebookUser fu) {
		// TODO Auto-generated method stub
		
		
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.loginProfileDAO(fu);
	}

	@Override
	public int editProfileService(FacebookUser fu) {
		// TODO Auto-generated method stub
		
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.editProfileDAO(fu);
	}

	@Override
	public int deleteProfileService(FacebookUser fu) {
		FacebookDAO fd=new FacebookDAO();
		
		int res=fd.deleteProfileDAO(fu);
		return res;
	}

	


	
	}

	
	
	


