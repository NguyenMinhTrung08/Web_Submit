package Automation.Web.dao;

import java.util.List;

import Automation.Web.models.UserModel;

public interface InterFaceUserDao {

	List<UserModel> findAll();
	
	UserModel findById(int id);
	
	void insert(UserModel user); //Can add many option you want
	
	UserModel findByUsername(String username);
	
	UserModel SignIn(String username, String password);
	
	void Register(UserModel user); 
	
	void ChangePassword(String username, String newpassword);
	
	public void UpdateProfile(String username, String fullname, String email, String phone);
	
	
}
