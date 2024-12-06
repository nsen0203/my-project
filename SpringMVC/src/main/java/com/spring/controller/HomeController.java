package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

/*import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path= "/home", method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url controller");
		
		model.addAttribute("name", "Nikhil Sen");
		model.addAttribute("id", 12);
		
		/*List<String> friend=new ArrayList<String>();
		friend.add("Nishti");
		friend.add("Renu");
		friend.add("Tinku");
		model.addAttribute("f", friend);*/
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url controller");
		return "about";
	}
	
	@RequestMapping("/service")
	public String service() {
		System.out.println("This is service url controller");
		return "service";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help url controller");
		
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//set data
		modelAndView.addObject("name", "Nikhil");
		modelAndView.addObject("roll", 12);
		/*LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);*/
		
		//marks
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(101);
		marks.add(102);
		marks.add(103);
		modelAndView.addObject("list", marks);
		
		
		//setting view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
