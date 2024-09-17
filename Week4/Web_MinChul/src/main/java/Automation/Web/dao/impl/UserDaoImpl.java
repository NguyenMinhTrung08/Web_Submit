package Automation.Web.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Automation.Web.configs.DBConnectMySQL;
import Automation.Web.dao.InterFaceUserDao;
import Automation.Web.models.UserModel;


public class UserDaoImpl extends DBConnectMySQL implements InterFaceUserDao {

	private static final Statement DatabaseConnection = null;
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
				list.add(new UserModel(rs.getInt("id"), rs.getString("fullname"), rs.getString("image"),
						rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("roleid"),
						rs.getString("phone"), rs.getDate("createDate")));
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
				user = new UserModel(rs.getInt("id"), rs.getString("fullname"), rs.getString("image"),
						rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("roleid"),
						rs.getString("phone"), rs.getDate("createDate"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void insert(UserModel user) {

		String sql = "INSERT INTO users(id, fullname, image ,username, password, email) VALUES (?, ?, ?, ?, ?)";

		try {
			// conn = new DBConnectSQL().getConnection(); //kết nối database
			ps = conn.prepareStatement(sql);// ném câu sql vào cho thực thi

			ps.setInt(1, user.getId());
			ps.setString(2, user.getFullname());
			ps.setString(3, user.getImage());
			ps.setString(4, user.getUsername());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getEmail());

			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public UserModel findByUsername(String username) {
		String sql = "SELECT * FROM user WHERE username = ? ";

		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				UserModel user = new UserModel();
				user.setId(rs.getInt("id"));
				user.setFullname(rs.getString("fullname"));
				user.setImage(rs.getString("image"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				//user.setRoleid(Integer.parseInt(rs.getString("roleid")));
				user.setRoleid(rs.getInt("roleid"));
				user.setPhone(rs.getString("phone"));
				user.setCreateDate(rs.getDate("createDate"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
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
				user = new UserModel(rs.getInt("id"), rs.getString("fullname"), rs.getString("image"),
						rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("roleid"),
						rs.getString("phone"), rs.getDate("createDate"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void Register(UserModel user) {
		String insertSql = "INSERT INTO user(username, password) VALUES (?, ?)";

		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(insertSql);

			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void ChangePassword(String username, String newPassword) {
		String sql = "UPDATE user SET password = ? WHERE username = ?";

		
		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(sql);

	        ps.setString(1, newPassword);
	        ps.setString(2, username);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	public static void main(String[] args) {

		// ------------------------------ FUCTION: FIND ALL ----------------------------

		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); List<UserModel> list =
		 * userDao.findAll(); for (UserModel user : list) { System.out.println(user); }
		 */

		// ------------------------------ FUCTION: FIND BY ID
		// ----------------------------

		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); int userId = 3; UserModel user =
		 * userDao.findById(userId); System.out.println("Information User" + user);
		 */

		// ------------------------------FUCTION: SIGN IN------------------------------

		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); String username = "HuuLam"; String
		 * password = "lam568"; UserModel user = userDao.SignIn(username, password); if
		 * (user != null) { System.out.println(" Sign In Successfully ! " + user); }
		 * else { System.out.
		 * println("Sign In Failed ! Check Your Username And Password Again !"); }
		 */

		// ------------------FUCTION: INSERT (ID INCREASE
		// AUTOMATICALLY)-------------------

		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); userDao.insert(new
		 * UserModel("MinhTrung", "MTrung@gmail.com", "NMT", "null", "8423"));
		 * List<UserModel> list = userDao.findAll(); for (UserModel user : list) {
		 * System.out.println(user); }
		 */

		// ------------------ FUNCTION: FIND BY USER ---------------------------------

		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); String userName = "HuuLam";
		 * UserModel user = userDao.findByUsername(userName);
		 * System.out.println("Information User " + user);
		 */

		// ------------------- FUNCTION: REGISTER ---------------------------

		
		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); userDao.Register(new
		 * UserModel("NgocHan", "han159")); List<UserModel> list = userDao.findAll();
		 * for (UserModel user : list) { System.out.println(user); }
		 */
		 
		// ------------------ FUNCTION: UPDATE PASSWORD ---------------------------
		/*
		 * UserDaoImpl userDao = new UserDaoImpl(); String username = "NgocHan"; String
		 * newPassword = "han582";
		 * 
		 * // Cập nhật mật khẩu userDao.ChangePassword(username, newPassword);
		 * 
		 * // Kiểm tra việc thay đổi mật khẩu UserModel user =
		 * userDao.findByUsername(username);
		 * System.out.println("Information User After Password Change: " + user);
		 */
	    
	    
	}





}
