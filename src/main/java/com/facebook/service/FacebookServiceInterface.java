package com.facebook.service;

import java.util.List;

import com.facebook.Entity.FacebookUser;

public interface FacebookServiceInterface {
	int createProfileService(FacebookUser fc);

	FacebookUser viewProfileService(FacebookUser fu);

	List<FacebookUser> viewAllProfileService();

	

	FacebookUser searchProfileService(FacebookUser fu);

	

	FacebookUser loginProfileService(FacebookUser fu);

	int editProfileService(FacebookUser fu);

	

	int deleteProfileService(FacebookUser fu);

	

	
}
