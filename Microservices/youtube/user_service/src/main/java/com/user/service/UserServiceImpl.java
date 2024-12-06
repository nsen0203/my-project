package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	//fake user List
	List<User> list = List.of(
			new User(1211L, "Testing1", "21212121"),
			new User(1212L, "Testing2", "23232323"),
			new User(1213L, "Testing3", "24242424")
			
			);
	@Override
	public User getUser(Long id) {
		
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

	
	
}
