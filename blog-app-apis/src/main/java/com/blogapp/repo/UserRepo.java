package com.blogapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
