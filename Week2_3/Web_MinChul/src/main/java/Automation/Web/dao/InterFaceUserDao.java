package Automation.Web.dao;

import java.util.List;

import Automation.Web.models.UserModel;

public interface InterFaceUserDao {

	List<UserModel> findAll();
	
	UserModel findById(int id);
	
	void insert(UserModel user); //Can add many option you want
	
	UserModel SignIn(String username, String password);
}
