package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.model.Employee;

@Controller
public class EmployeeController {
	
	
	@GetMapping("/register")
	public String home(Model model) {
		
		model.addAttribute("msg","Registration Application");
		return "register";
	}
	
	@PostMapping("/register")
	public String register(Model model,Employee emp) {
		
		model.addAttribute("responsemsg","Your details are registered and please find the below");
		model.addAttribute("employee",emp);
		return "response";
	}

}
