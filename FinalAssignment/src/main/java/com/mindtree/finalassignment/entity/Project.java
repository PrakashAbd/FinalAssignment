package com.mindtree.finalassignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	
	private int projectId;
	@Id
	private String projectName;
	private String projectDesc;
	private int hours;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectDesc=" + projectDesc
				+ ", hours=" + hours + "]";
	}
	public Project(int projectId, String projectName, String projectDesc, int hours) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.hours = hours;
	}
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
}
