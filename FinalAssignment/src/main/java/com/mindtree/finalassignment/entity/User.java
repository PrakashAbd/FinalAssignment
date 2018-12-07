package com.mindtree.finalassignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {
	@Id
	private String userId;
	private String password;
	private String doj;
	private String email;
	private String role;
	@ManyToOne
	@JoinColumn(name = "projectName")
	private Project project;
	
	public User(String userId, String password, String doj, String email, String role, String projectName) {
		super();
		this.project = new Project();
		this.userId = userId;
		this.password = password;
		this.doj = doj;  
		this.email = email;
		this.role = role;
		this.project.setProjectName(projectName);
	}
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
	
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", doj=" + doj + ", email=" + email + ", role="
				+ role + ", project=" + project + "]";
	}
	public User() {
		super();
	}
	
	
}
