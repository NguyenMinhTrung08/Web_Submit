package Automation.Web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Automation.Web.configs.DBConnectMySQL;
import Automation.Web.dao.InterFaceUserDao;
import Automation.Web.models.UserModel;

public class UserDaoImpl extends DBConnectMySQL implements InterFaceUserDao {

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<UserModel> findAll() {
		String sql = "select * from user";
		List<UserModel> list = new ArrayList<>();
		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new UserModel(rs.getInt("id"), rs.getString("username"), rs.getString("email"),
						rs.getString("fullname"), rs.getString("image"), rs.getString("password")));
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public UserModel findById(int id) {
		String sql = "SELECT * FROM user WHERE id = ?";
		UserModel user = null;
		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				user = new UserModel(rs.getInt("id"), rs.getString("username"), rs.getString("email"),
						rs.getString("fullname"), rs.getString("image"), rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void insert(UserModel user) {
		String Max_id = "SELECT MAX(id) FROM user";
		String insertSql = "INSERT INTO user(id, username, email, fullname, image, password) VALUES (?, ?, ?, ?, ?, ?)";

		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(Max_id);
			rs = ps.executeQuery();
			int newId = 1;
			if (rs.next()) {
				newId = rs.getInt(1) + 1;
			}
			rs.close();
			ps.close();

			ps = conn.prepareStatement(insertSql);
			ps.setInt(1, newId);
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getFullname());
			ps.setString(5, user.getImage());
			ps.setString(6, user.getPassword());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public UserModel SignIn(String username, String password) {

		String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
		UserModel user = null;
		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();

			if (rs.next()) {

				user = new UserModel(rs.getInt("id"), rs.getString("username"), rs.getString("email"),
						rs.getString("fullname"), rs.getString("image"), rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public static void main(String[] args) {

		// ------------------------------ FUCTION: FIND ALL ----------------------------

		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); List<UserModel> list =
		 * userDao.findAll(); for (UserModel user : list) { System.out.println(user); }
		 */

		// ------------------------------ FUCTION: FIND BY ID ----------------------------

		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); int userId = 3; UserModel user =
		 * userDao.findById(userId); System.out.println("Information User " + user);
		 */

		// ------------------------------FUCTION: SIGN IN------------------------------

		
		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); String username = "MinhTrung";
		 * String password = "8423"; UserModel user = userDao.SignIn(username,
		 * password); if (user != null) { System.out.println(" Sign In Successfully ! "
		 * + user); } else { System.out.
		 * println("Sign In Failed ! Check Your Username And Password Again !"); }
		 */
		 

		// ------------------FUCTION: REGISTER (ID INCREASE AUTOMATICALLY)-------------------

		
		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); userDao.insert(new
		 * UserModel("MinhTrung", "MTrung@gmail.com", "NMT", "null", "8423"));
		 * List<UserModel> list = userDao.findAll(); for (UserModel user : list) {
		 * System.out.println(user); }
		 */
		 

	}

}
