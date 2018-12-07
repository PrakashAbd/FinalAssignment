package com.mindtree.finalassignment.dao;

import java.util.List;

import com.mindtree.finalassignment.entity.User;

public interface UserDao {
	String insert(User user);
	List<User> getAllUsers();
}
