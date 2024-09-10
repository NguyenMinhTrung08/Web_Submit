package Automation.Web.models;

import java.io.Serializable;

public class UserModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String email;
	private String fullname;
	private String image;
	private String password;

	public UserModel() {
		super();
	}

	public UserModel(int id, String username, String email, String fullname, String image, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.fullname = fullname;
		this.image = image;
		this.password = password;
	}
	
	public UserModel(String username, String email, String fullname, String image, String password) {
		super();
		this.username = username;
		this.email = email;
		this.fullname = fullname;
		this.image = image;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", email=" + email + ", fullname=" + fullname
				+ ", image=" + image + ", password=" + password + "]";
	}
	
	
	
}
