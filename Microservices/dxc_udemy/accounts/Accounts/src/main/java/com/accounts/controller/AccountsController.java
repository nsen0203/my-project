package com.accounts.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.constants.AccountsConstants;
import com.accounts.dto.CustomerDto;
import com.accounts.dto.ErrorResponseDto;
import com.accounts.dto.ResponseDto;
import com.accounts.service.IAccountsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;


@Tag(
		name = "CRUD Rest API for Accounts Eazy Bank",
		description = "CRUD REST APIs in EazyBank to Create, Read, Update and Delete account details"
		)
@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class AccountsController {
	
	
	private IAccountsService iAccountsService;
	
	@Operation(
			summary = "Create Account REST API",
			description = "REST API to create new Customer & Accounts in EazyBank"
			)
	@ApiResponse(
			responseCode = "201",
			description = "HTTP Status CREATED"
			)
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDto> createAccount(@Valid @RequestBody CustomerDto customerDto){
		
		iAccountsService.createAccount(customerDto);
		
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
		
	}
	
	@Operation(
			summary = "Fetch Account Details REST API",
			description = "REST API to fetch Customer & Accounts details"
			)
	@ApiResponse(
			responseCode = "200",
			description = "HTTP Status OK"
			)
	
	@GetMapping("/fetch")
	public ResponseEntity<CustomerDto> fetchAccountDetails(@RequestParam 
			@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number should be of 10 digit")
			String mobileNumber){
		
		CustomerDto customerDto = iAccountsService.fetchAccount(mobileNumber);
		
		return ResponseEntity.status(HttpStatus.OK).body(customerDto);
		
	}
	
	@Operation(
			summary = "Update Account Details REST API",
			description = "REST API to Update Customer & Accounts details based on account number"
			)
	@ApiResponses(
			{
				@ApiResponse(
						responseCode = "200",
						description = "HTTP Status OK"
						),
				@ApiResponse(
						responseCode = "500",
						description = "HTTP Status Internal Server Error"
						)
			}
			)
	
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDto> updateAccountDetails(@Valid @RequestBody CustomerDto customerDto){
		
		boolean isUpdated = iAccountsService.updateAccount(customerDto);
		if(isUpdated) {
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(AccountsConstants.STATUS_200,AccountsConstants.MESSAGE_200));
		}else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR
					).body(new ResponseDto(AccountsConstants.STATUS_500,AccountsConstants.MESSAGE_500));
		}	
	}
	
	@Operation(
			summary = "Delete Account & Customer Details REST API",
			description = "REST API to delete Customer & Accounts details based on a mobile number"
			)
	@ApiResponses(
			{
				@ApiResponse(
						responseCode = "200",
						description = "HTTP Status OK"
						),
				@ApiResponse(
						responseCode = "500",
						description = "HTTP Status Internal Server Error"
						)
			}
			)
	
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseDto> deleteAccountDetails(@RequestParam 
			@Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number should be of 10 digit")
			String mobileNumber){
		
		boolean isDeleted = iAccountsService.deleteAccount(mobileNumber);
		if(isDeleted) {
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(AccountsConstants.STATUS_200,AccountsConstants.MESSAGE_200));
		}else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR
					).body(new ResponseDto(AccountsConstants.STATUS_500,AccountsConstants.MESSAGE_500));
		}
		
	}

}
