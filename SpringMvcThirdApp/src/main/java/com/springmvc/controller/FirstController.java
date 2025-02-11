package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/First")
public class FirstController {

	@GetMapping("/welcome1")
	public String welcomeMessage1(Model model) {
		
	
		model.addAttribute("info","Welcome message from first controller");
		return "index";
	}
}
