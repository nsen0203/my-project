package com.jwt.example.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.jwt.example.entities.User;
import com.jwt.example.repo.UserRepository;


@Service
public class UserService {
	
//	private List<User> store = new ArrayList<User>();
	
//	public UserService() {
//		store.add(new User(UUID.randomUUID().toString(), "Nikhil", "test@dev.in"));
//		store.add(new User(UUID.randomUUID().toString(), "Nikhil1", "test1@dev.in"));
//		store.add(new User(UUID.randomUUID().toString(), "Nikhil2", "test2@dev.in"));
//		store.add(new User(UUID.randomUUID().toString(), "Nikhil3", "test3@dev.in"));
//	}
	
//	public List<User> getUser(){
//	return this.store;
//}
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUser(){
		return userRepository.findAll();
	}
	
	public User createUser(User user) {
		(com.jwt.example.entities.User).setUserId(UUID.randomUUID().toString());
		return userRepository.save(user);
		
	}
		

}
