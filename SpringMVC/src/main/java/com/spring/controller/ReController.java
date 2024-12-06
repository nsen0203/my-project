package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	/*@RequestMapping("/first")
	public String first() {
		System.out.println("This is first url handler");
		return "redirect:/second";
	}
	
	@RequestMapping("/second")
	public String second() {
		System.out.println("This is second url handler");
		return "";
	}*/
	
	/*@RequestMapping("/first")
	public String first() {
		System.out.println("This is first url handler");
		return "redirect:/second";
	}
	
	@RequestMapping("/second")
	public String second() {
		System.out.println("This is second url handler");
		return "contact";
	}*/
	
	@RequestMapping("/first")
	public RedirectView first() {
		System.out.println("This is first url handler");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("second");
		return redirectView;
	}
	
	@RequestMapping("/second")
	public String second() {
		System.out.println("This is second url handler");
		return "contact";
	}

}
