package com.mindtree.finalassignment.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mindtree.finalassignment.dao.UserDao;
import com.mindtree.finalassignment.entity.User;

public class UserDaoImpl implements UserDao{

private HibernateTemplate hibernateTemplate;

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	// TODO Auto-generated method stub
	
    this.hibernateTemplate = hibernateTemplate;
}
	public String insert(User user) {
		// TODO Auto-generated method stub
		Session s = hibernateTemplate.getSessionFactory().openSession();
		s.save(user);
		s.beginTransaction().commit();
		
		return null;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> list = hibernateTemplate.loadAll(User.class);
		return list;
	}
	public void update(User user) {
		// TODO Auto-generated method stub
		Session s = hibernateTemplate.getSessionFactory().openSession();
		s.update(user);
		s.beginTransaction().commit();
	}
}
