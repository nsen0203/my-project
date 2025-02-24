package com.builderDesign;

public class Main {

	public static void main(String[] args) {
		//For non-static
		User user = new User.UserBuilder().setUserId("12").setUserName("Nikhil").setUserEmail("test@gmail.com").build();
		System.out.println(user);
		
		//For static
		User user2 = User.UserBuilder.builder().setUserId("14").setUserName("Tinku").setUserEmail("test2@gmail.com").build();
		System.out.println(user2);

	}

}
