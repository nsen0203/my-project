package com.practice.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model m) {

		System.out.println("Inside about handler");

		m.addAttribute("name", "Nikhil Sen");
		m.addAttribute("currentDate", new Date().toLocaleString());

		return "about";
	}

	// handler for iteration
	@GetMapping("/example-iterate")
	public String iterateHandler(Model m) {

		// creating a collection
		List<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Hari");
		names.add("Raman");

		m.addAttribute("names", names);

		return "iterate";
	}

	// handler for conditional statements
	@GetMapping("/condition")
	public String conditionHandler(Model m) {

		System.out.println("Inside conditional handler");
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "F");

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(10);
		m.addAttribute("values", list);

		return "condition";
	}

	// handler for include/insert/replace fragment
	/*
	 * @GetMapping("/service") public String servicesHandler(Model m) {
	 * 
	 * return "service";
	 * 
	 * }
	 */

	// handler for passing dynamic values to fragment
	@GetMapping("/service")
	public String servicesHandler(Model m) {

		m.addAttribute("title", "this is title dynamic values");
		m.addAttribute("subtitle", LocalDateTime.now().toString());

		return "service";

	}

	// handler for new about
	@GetMapping("/newabout")
	public String newAbout() {

		return "newabout";
	}

	// handler for contact
	@GetMapping("/contact")
	public String contact() {

		return "contact";
	}

}
