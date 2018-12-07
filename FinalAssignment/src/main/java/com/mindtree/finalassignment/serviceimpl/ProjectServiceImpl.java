package com.mindtree.finalassignment.serviceimpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.finalassignment.daoimpl.ProjectDaoImpl;
import com.mindtree.finalassignment.entity.Project;
import com.mindtree.finalassignment.service.ProjectService;

public class ProjectServiceImpl implements ProjectService{
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    ProjectDaoImpl springHibernateExample = (ProjectDaoImpl) context.getBean("springHibernateTemplateExample");
	@Transactional(readOnly=false)
	public String insert(Project project) {
		// TODO Auto-generated method stub
		springHibernateExample.insert(project);
		return null;
	}

	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return springHibernateExample.getAllProjects();
	}

}
