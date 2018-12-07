package com.mindtree.finalassignment.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.mindtree.finalassignment.entity.Project;

public interface ProjectDao {
	
	String insert(Project project);
	List<Project> getAllProjects();
}
