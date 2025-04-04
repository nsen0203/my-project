package com.blogapp.services;

import java.util.List;

import com.blogapp.payloads.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user, Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUser(); 
	
	void deletUser(Integer userId);
}
