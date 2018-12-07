package com.mindtree.finalassignment.serviceimpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.finalassignment.dao.UserDao;
import com.mindtree.finalassignment.daoimpl.UserDaoImpl;
import com.mindtree.finalassignment.entity.User;

public class UserServiceImpl implements UserDao{
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDaoImpl springHibernateExample = (UserDaoImpl) context.getBean("springHibernateTemplateExample2");
	public String insert(User user) {
		// TODO Auto-generated method stub
		springHibernateExample.insert(user);
		return null;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return springHibernateExample.getAllUsers();
	}

}
