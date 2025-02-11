package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/welcome")
	public ModelAndView welcomeMessage() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Welcome to the Application");
		mv.setViewName("index");
		return mv;
	}

}
