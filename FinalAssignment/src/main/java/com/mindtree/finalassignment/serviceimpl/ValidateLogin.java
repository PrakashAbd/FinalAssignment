package com.mindtree.finalassignment.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.finalassignment.daoimpl.UserDaoImpl;
import com.mindtree.finalassignment.entity.Login;
import com.mindtree.finalassignment.entity.User;

public class ValidateLogin {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserDaoImpl springHibernateExample = (UserDaoImpl) context.getBean("springHibernateTemplateExample2");
	public String validateLogin(Login login)
	{
		List<User> list = springHibernateExample.getAllUsers();
		for(User u : list)
			if(u.getUserId().equals(login.getUserId()) && u.getPassword().equals(login.getPassword()))
			{
				if( u.getRole().equalsIgnoreCase("admin"))
					return "admin";
				else
					return "user";
			}
		return null;
	}
	public void changePassword(Login login)
	{
		List<User> list = springHibernateExample.getAllUsers();
		User user = new User();
		for(User u : list)
		{
			if(u.getUserId().equals(login.getUserId()) )
			{
				u.setPassword(login.getPassword());
				user = u;
			}
		}
		springHibernateExample.update(user);
	}
	public List<User> viewTeamMembers(Login login)
	{
		List<User> list = springHibernateExample.getAllUsers();
		User user = new User();
		String project = "";
		for(User u : list)
			if(u.getUserId().equals(login.getUserId()) && u.getPassword().equals(login.getPassword()))
			{
				project = u.getProject().getProjectName();
			}
		List<User> result = new ArrayList<User>();
		for(User u : list)
			if(project.equals(u.getProject().getProjectName()))
				result.add(u);
		return result;
	}
}
