package com.validation.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {

	@NotBlank(message = "User name cannot be empty !!")
	@Size(min = 3, max = 12, message = "User name must be in between 3-12 characters !!")
	private String userName;

	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email !!")
	// @Email(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid Email
	// !!")
	private String userEmail;

	@AssertTrue(message = "Must Agree Terms And Condition !!")
	private boolean agreed;

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginData(String userName, String userEmail, boolean agreed) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.agreed = agreed;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", userEmail=" + userEmail + ", agreed=" + agreed + "]";
	}

}
