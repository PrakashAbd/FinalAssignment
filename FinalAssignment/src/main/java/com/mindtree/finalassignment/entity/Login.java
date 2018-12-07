package com.mindtree.finalassignment.entity;


public class Login {
	private String userId;
	private String password;
	private String type;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Login(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
		
	}
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", password=" + password + ", type=" + type + "]";
	}
	
}
