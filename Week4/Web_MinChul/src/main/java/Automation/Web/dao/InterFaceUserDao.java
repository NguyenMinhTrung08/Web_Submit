<<<<<<< HEAD
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
	
	
}
=======
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
	
	
}
>>>>>>> 8c1f23247e42ea9e6c00a664fd37eba6dc83c1d7
