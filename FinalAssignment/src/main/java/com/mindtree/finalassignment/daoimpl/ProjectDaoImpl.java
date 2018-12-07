package com.mindtree.finalassignment.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mindtree.finalassignment.dao.ProjectDao;
import com.mindtree.finalassignment.entity.Project;

public class ProjectDaoImpl implements ProjectDao{
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		// TODO Auto-generated method stub
		
	    this.hibernateTemplate = hibernateTemplate;
	}
	
	public String insert(Project project) {
		// TODO Auto-generated method stub
		Session s = hibernateTemplate.getSessionFactory().openSession();
		s.save(project);
		s.beginTransaction().commit();
		return null;
	}

	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		List<Project> list = hibernateTemplate.loadAll(Project.class);
		return list;
	}

}
