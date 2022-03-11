package ratingproject.ratingapp;

public class User {
	
	
	private String username;
	private String emailid;
	private String password;
	private String mobileno;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public User(String username, String emailid, String password, String mobileno) {
		super();
		this.username = username;
		this.emailid = emailid;
		this.password = password;
		this.mobileno = mobileno;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
