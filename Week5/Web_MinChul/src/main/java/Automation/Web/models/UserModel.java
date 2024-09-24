package Automation.Web.models;

import java.io.Serializable;
import java.sql.Date;

public class UserModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String fullname;
	private String image;
	private String username;
	private String password;
	private String email;
	private int roleid;
	private String phone;
	private Date createDate;

	public UserModel() {
		super();
	}
	


	public UserModel(int id, String fullname, String image, String username, String password, String email, int roleid,
			String phone, Date createDate) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.image = image;
		this.username = username;
		this.password = password;
		this.email = email;
		this.roleid = roleid;
		this.phone = phone;
		this.createDate = createDate;
	}
	
	  public UserModel(String username, String password) { super(); this.username =
	  username; this.password = password;
	  
	  }
	 
	
	public UserModel(String fullname, String email, String phone,  String username, String password) {
		super();
		this.fullname = fullname;
		this.email = email;	
		this.phone = phone;		
		this.username = username;
		this.password = password;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", fullname=" + fullname + ", image=" + image + ", username=" + username
				+ ", password=" + password + ", email=" + email + ", roleid=" + roleid + ", phone=" + phone
				+ ", createDate=" + createDate + "]";
	}

	}

