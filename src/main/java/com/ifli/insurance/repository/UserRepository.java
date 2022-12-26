package com.ifli.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifli.insurance.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Serializable>{
	
		public User findByUsername(String username);
		

}
