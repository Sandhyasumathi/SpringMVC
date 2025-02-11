package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.service.GreetingsService;

@Controller
public class GreetingsController {
	
	@Autowired
	public GreetingsService service;
	
	@GetMapping("/greet")
	public String greet(Model model) {
		
		String greetings = service.greet("Name");
		model.addAttribute("wish",greetings);
		return "greet";
	}

}
