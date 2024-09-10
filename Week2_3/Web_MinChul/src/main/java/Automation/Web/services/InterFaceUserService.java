package Automation.Web.services;

import java.util.List;

import Automation.Web.models.UserModel;

public interface InterFaceUserService {

	List<UserModel> findAll();
	
	UserModel findById(int id);
	
	void insert(UserModel user); //Can add many option you want
	
	UserModel SignIn(String username, String password);
	
}
