package com.mindtree.finalassignment.service;

import java.util.List;

import com.mindtree.finalassignment.entity.User;

public interface UserService {
	String insert(User user);
	List<User> getAllUsers();
}
