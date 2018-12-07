package com.mindtree.finalassignment.service;

import java.util.List;

import com.mindtree.finalassignment.entity.Project;

public interface ProjectService {
	String insert(Project project);
	List<Project> getAllProjects();
}
