package Automation.Web.services;

import java.util.List;

import Automation.Web.models.UserModel;

public interface InterFaceUserService {

	List<UserModel> findAll();
	
	UserModel findById(int id);
	
	UserModel Register(UserModel user); 
	
	UserModel SignIn(String username, String password);
	
	UserModel FindByUserName(String username);
	
	UserModel ChangePassword(String username, String newpassword); 
	
	UserModel UpdateProfile(String username, String fullname, String email, String phone); 
}
