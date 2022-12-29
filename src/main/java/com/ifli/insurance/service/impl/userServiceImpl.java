package com.ifli.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifli.insurance.model.User;
import com.ifli.insurance.repository.UserRepository;
import com.ifli.insurance.service.UserService;

import jakarta.transaction.Transactional;
// @Author name- Govardhan Jadhav
@Service
public class userServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;


	@Override
	@Transactional
	public User saveUser(User user) {
		return userRepository.save(user);
	}


	
	

}
