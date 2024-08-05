package com.facebook.dao;

import java.util.List;

import com.facebook.Entity.FacebookUser;

public interface FacebookDAOInterface {

	int createProfileDAO(FacebookUser fc);

	FacebookUser viewProfileDAO(FacebookUser fu);

	

	List<FacebookUser> viewAllProfileDAO();

	
	FacebookUser searchProfileDAO(FacebookUser fu);

	FacebookUser loginProfileDAO(FacebookUser fu);

	

	
	

	

	int editProfileDAO(FacebookUser fu);

	

}
