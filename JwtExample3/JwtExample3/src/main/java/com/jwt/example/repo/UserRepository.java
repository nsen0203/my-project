package com.jwt.example.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	public Optional<User> findByEmail(String email);
	
}
