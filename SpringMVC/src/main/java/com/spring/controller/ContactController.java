package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;
import com.spring.service.UserService;

@Controller
public class ContactController {

	/*@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
*/
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleFrom(HttpServletRequest request) {
	 * 
	 * String email = request.getParameter("email");
	 * System.out.println("user email Id is" + email); return ""; }
	 */
	
	/*--------------------------------------------------------------------------------------------------------*/

	/*@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleFrom(
			@RequestParam("email") String userEmail, 
			@RequestParam("userName") String userName, 
			@RequestParam("password") String userPassword, Model model) {
		
		System.out.println("user Email " +  userEmail);
		System.out.println("user Name " + userName);
		System.out.println("User Password " + userPassword);
		
		model.addAttribute("userName", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		
		return "success";
	}*/
	
	/*--------------------------------------------------------------------------------------------------------*/
	
	/*@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleFrom(
			@RequestParam("email") String userEmail, 
			@RequestParam("userName") String userName, 
			@RequestParam("password") String userPassword, Model model) {
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		model.addAttribute("user", user);
		
		return "success";
	}*/
	
	/*--------------------------------------------------------------------------------------------------------*/
	
	/*@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleFrom(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		
		return "success";
	}*/
	
	/*--------------------------------------------------------------------------------------------------------*/
	
	/*@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Registration From");
		m.addAttribute("Description", "Registration From For Programmers");
		System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		m.addAttribute("Header", "Registration From");
		m.addAttribute("Description", "Registration From For Programmers");
		
		System.out.println("");
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleFrom(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		model.addAttribute("Header", "Registration From");
		model.addAttribute("Description", "Registration From For Programmers");
		
		return "success";
	}*/
	
	/*--------------------------------------------------------------------------------------------------------*/
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Registration From");
		m.addAttribute("Description", "Registration From For Programmers");
		System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		System.out.println("");
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleFrom(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		
		if(user.getUserName().isEmpty()) {
			return "redirect:/contact";
		}
		
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User Created with id "+ createUser);
		
		return "success";
	}
	
}
