package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home page controller");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String conatact() {
		System.out.println("this is contact page controller");
		return "contact";
	}

}
