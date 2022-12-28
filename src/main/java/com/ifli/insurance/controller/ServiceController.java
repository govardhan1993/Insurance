package com.ifli.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifli.insurance.model.User;
import com.ifli.insurance.service.UserService;
// @Author name - Govardhan jadhav
@RestController
@RequestMapping("/user")
public class ServiceController {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/save")
	public ResponseEntity<User> createUser(@RequestBody User user) throws Exception
	{
		User users=userservice.saveUser(user);
		
		return ResponseEntity.ok().body(users);
	}
	
	

}
