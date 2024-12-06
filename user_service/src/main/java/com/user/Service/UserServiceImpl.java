package com.user.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	 
	List<User> list=List.of(
			new User(1L,"renu gupta","123456789"),
			new User(2L,"rajni gupta","123499789"),
			new User(3L,"tina gupta","1239956789")
	  );
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(e->e.getUserId().equals(id)).findAny().orElse(null);
	}
}