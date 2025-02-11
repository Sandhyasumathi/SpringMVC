package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@GetMapping("/welcome")
	public ModelAndView welcomeMessage() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Welcome to the Application");
		mv.setViewName("index");
		return mv;
	}

	@GetMapping("/welcome1")
	public String welcomeMessage1(Model model) {
		
		ModelAndView mv = new ModelAndView();
		model.addAttribute("info","Welcome to model object");
		return "index";
	}
}
