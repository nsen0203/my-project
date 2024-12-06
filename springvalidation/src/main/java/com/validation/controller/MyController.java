package com.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.entities.LoginData;

import jakarta.validation.Valid;

@RestController
public class MyController {

	@GetMapping("/form")
	public String openForm(Model m) {
		System.out.println("opening form");
		m.addAttribute("loginData", new LoginData());
		return "form";
	}
	
	// handler for processing form
	@PostMapping("/process")
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "form";
		}
		
		System.out.println(loginData);
		return "success";
	}
}
