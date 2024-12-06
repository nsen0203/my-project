package com.spring;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("This is home view");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		RedirectView redirect=new RedirectView();
		if(query.isEmpty()) {
			System.out.println("Please fill the field");
			redirect.setUrl("redirect:/home");
			return redirect;
		}
		String url="https://www.google.com/search?q=" + query;
		
		redirect.setUrl(url);
		return redirect;
	}
	
	
	/*---------------------------------------------------------------------------------------------*/
	
	//Path Variable Concept
	
	/*@RequestMapping("/user/{userId}/{userName}")
	public String getDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}*/
	
	
	/*---------------------------------------------------------------------------------------------*/
	
	// Exception Handling concept
	/*@RequestMapping("/home")
	public String home() {
		
		System.out.println("This is home view");
		String str = null;
		System.out.println(str.length());
		return "home";
	}
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
		
		System.out.println(userId);
		System.out.println(userName);
		Integer.parseInt(userName);
		return "home";
	}*/
	
	/*@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandler(Model m) {
		m.addAttribute("msg", "Null Pointer Exception has occured");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("msg", "Number Format Exception has occured");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandlerException(Model m) {
		m.addAttribute("msg", "Exception has occured");
		return "null_page";
	}*/

}
