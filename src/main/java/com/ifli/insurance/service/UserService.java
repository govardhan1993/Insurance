package com.ifli.insurance.service;

import java.util.List;

import com.ifli.insurance.model.User;

public interface UserService {
	
	
	public User saveUser(User user);
	public List<User> AllUserList();

}
