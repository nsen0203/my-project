package com.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice Rest APIs Documentation",
				description = "Eazybank Account microservice Rest API Dcoumentation",
				version = "v1",
				contact = @Contact(
						name = "Nikhil Sen",
						email = "Testingmicro@gmail.com"
						),
				license = @License(
						name = "Apache 2.0"
						)
				),
		externalDocs = @ExternalDocumentation(
				description = "Eazy Bank microservice REST API Documentation"
				)
		
		)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
