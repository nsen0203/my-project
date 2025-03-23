package com.jwt.example.controller;

import java.security.Principal;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.entities.User;
import com.jwt.example.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUser() {
		
		System.out.println("Returning users");
		
		return this.userService.getUser();
	}
	
	@GetMapping("/current-user")
	public String currentLoggedInUser(Principal principal) {
		return principal.getName();
	}

}
