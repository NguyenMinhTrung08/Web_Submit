package Automation.Web.services.impl;

import java.util.List;

import Automation.Web.dao.InterFaceUserDao;
import Automation.Web.dao.impl.UserDaoImpl;
import Automation.Web.models.UserModel;
import Automation.Web.services.InterFaceUserService;

public class UserServiceImpl implements InterFaceUserService {
	InterFaceUserDao userDao = new UserDaoImpl();

	@Override
	public List<UserModel> findAll() {
		return userDao.findAll();
	}

	@Override
	public UserModel findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public UserModel SignIn(String username, String password) {
		UserModel user = this.FindByUserName(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;

	}

	@Override
	public UserModel FindByUserName(String username) {
		return userDao.findByUsername(username);
	}

	public static void main(String[] args) {
		UserServiceImpl userService = new UserServiceImpl();
		System.out.println(userService.SignIn("MinhTrung", "trung125"));
	}

	@Override
	public UserModel Register(UserModel user) {
	    UserModel existingUser = userDao.findByUsername(user.getUsername()); 
	    if (existingUser != null) {
	        // Nếu user đã tồn tại, trả về null
	        return null;
	    }

	    // Nếu chưa tồn tại, thêm user vào cơ sở dữ liệu
	    userDao.Register(user);
	    return user;
		
	}

	@Override
	public UserModel ChangePassword(String username, String newpassword) {
		// Kiểm tra xem username có tồn tại không
        UserModel user = userDao.findByUsername(username);

        if (user != null) {
            // Username tồn tại, thay đổi mật khẩu
            userDao.ChangePassword(username, newpassword);
            return userDao.findByUsername(username); // Trả về thông tin người dùng sau khi thay đổi mật khẩu
        } else {
            // Username không tồn tại, trả về null
            return null;
        }
	}

}
