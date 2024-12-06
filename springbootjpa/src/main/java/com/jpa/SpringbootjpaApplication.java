package com.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.jpa.dao.UserRepository;
import com.jpa.entity.User;

@EnableJpaRepositories
@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootjpaApplication.class, args);
		UserRepository bean = context.getBean(UserRepository.class);
		
		/*
		 * User user=new User(); user.setName("Tinku"); user.setCity("Bhopal");
		 * user.setStatus("Tester");
		 * 
		 * User save = bean.save(user); System.out.println(save);
		 */
		
		//inserting single user
		/*
		 * User user=new User(); user.setName("Raman"); user.setCity("Delhi");
		 * user.setStatus("DBA"); User save = bean.save(user); System.out.println(save);
		 */
		
		// inserting multiple user
		/*
		 * User user=new User(); user.setName("Ram"); user.setCity("Mumbai");
		 * user.setStatus("Devops");
		 * 
		 * User user1=new User(); user1.setName("Shyam"); user1.setCity("Pune");
		 * user1.setStatus("Manager");
		 * 
		 * List<User> users = new ArrayList<User>(); users.add(user); users.add(user1);
		 * Iterable<User> result = bean.saveAll(users); for (User u: result) {
		 * System.out.println(u); }
		 */
		
		//Updating user
		/*
		 * Optional<User> optional = bean.findById(103); User user = optional.get();
		 * user.setName("Shyam Sharma"); bean.save(user); System.out.println(user);
		 */
		
		//get user
		/*
		 * Iterable<User> itr = bean.findAll(); for(User i: itr) {
		 * System.out.println(i); }
		 */
		
		//delete user
		/* bean.deleteById(103); */
		
		//Custom Derived Methods
		/*
		 * List<User> users = bean.findByName("Nikhil"); for(User u: users) {
		 * System.out.println(u); }
		 */
		
		/*
		 * List<User> findByNameAndCity = bean.findByNameAndCity("Nikhil", "Bina");
		 * for(User u: findByNameAndCity) { System.out.println(u); }
		 */
		
		/*
		 * List<User> allUser = bean.getAllUser(); for(User u: allUser) {
		 * System.out.println(u); }
		 */
		
		/*
		 * List<User> userByName = bean.getUserByName("Nikhil"); for(User u: userByName)
		 * { System.out.println(u); }
		 */
		
		/*
		 * List<User> userByNameAndCity = bean.getUserByNameAndCity("Nikhil", "Bina");
		 * for(User u: userByNameAndCity) { System.out.println(u); }
		 */
		
		List<User> users = bean.getUsers();
		for(User u: users) { System.out.println(u); }
		
	}

}
