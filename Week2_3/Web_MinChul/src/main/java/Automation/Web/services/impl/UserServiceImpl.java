package Automation.Web.services.impl;

import java.util.List;

import Automation.Web.dao.impl.UserDaoImpl;
import Automation.Web.models.UserModel;
import Automation.Web.services.InterFaceUserService;

public class UserServiceImpl  implements InterFaceUserService {
	UserDaoImpl userDao = new UserDaoImpl();

	@Override
	public List<UserModel> findAll() {
        return userDao.findAll();
	}

	@Override
	public UserModel findById(int id) {
        return userDao.findById(id);
	}

	@Override
	public void insert(UserModel user) {
        userDao.insert(user);
		
	}

	@Override
	public UserModel SignIn(String username, String password) {
		return userDao.SignIn(username, password);
	}
}
