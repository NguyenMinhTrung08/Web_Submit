<<<<<<< HEAD
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
}
=======
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
}
>>>>>>> 8c1f23247e42ea9e6c00a664fd37eba6dc83c1d7
