package com.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
		name = "Accounts",
		description = "Schema to hold Account information"
		)
public class AccountsDto {

	@Schema(
			description = "Account Number of Eazy Bank account", example = "8787878787"
			)
	@NotEmpty(message = "Account Number cannot be empyt")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number should be of 10 digit")
	private Long accountNumber;
	
	
	@Schema(
			description = "Account Type of Eazy Bank account", example = "Savings"
			)
	@NotEmpty(message = "Account Type cannot be empty")
	private String accountType;
	
	
	@Schema(
			description = "Eazy Bank Branch Address",  example = "123, New Market, Bhopal"
			)
	@NotEmpty(message = "Branch Address cannot be empty")
	private String branchAddress;
	
}
