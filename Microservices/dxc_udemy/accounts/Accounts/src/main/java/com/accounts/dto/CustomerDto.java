package com.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
		name = "Customer",
		description = "Schema to hold customer & account information"
		)
public class CustomerDto {
	
	@Schema(
			description = "Schema to hold name of the customer", example = "Nikhil Sen"
			)
	@NotEmpty(message = "Name cannot be null or empty")
	@Size(min=5, max=30, message = "Name length should be between 5 and 30")
	private String name;
	
	
	@Schema(
			description = "Schema to hold email address of the customer", example = "test12@gmail.com"
			)
	@NotEmpty(message = "Email address cannot be null or empty")
	@Email(message = "Email address should be valid value")
	private String email;
	
	
	@Schema(
			description = "Schema to hold mobile number of the customer", example = "9876543212"
			)
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number should be of 10 digit")
	private String mobileNumber;
	
	@Schema(
			description = "Schema to hold Accounts Details of the Customer"
			)
	private AccountsDto accountsDto;

}
