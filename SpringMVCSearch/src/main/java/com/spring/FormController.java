package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String showForm() {
		
		return "complex_form";
	}

	/*@RequestMapping(path= "/handleform", method = { RequestMethod.GET, RequestMethod.POST })
	public String formHandler(@RequestParam("name") String name, @RequestParam("email") String email) {
		
		System.out.println(name);
		System.out.println(email);
		return "success";
	}*/
	
	/*@RequestMapping(path= "/handleform", method = RequestMethod.GET)
	public String formHandler(@ModelAttribute("student") Student student) {
		
		System.out.println(student);
		return "success";
	}*/
	
	@RequestMapping(path= "/handleform", method = RequestMethod.POST )
	public String formHandler(@ModelAttribute("student") Student student, BindingResult result) {
		
		if(result.hasErrors()) {
			return "complex_form";
		}
		
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}

}
