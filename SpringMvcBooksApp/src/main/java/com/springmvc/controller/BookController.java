package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("homemsg","Welcome to Application");
		model.addAttribute("msg","Click here to get the response");
		return "home";
	}
	
	@GetMapping("/response")
	public String response(Model model) {

		String[] books = new String[] {"Java","Spring","DevOps"};
		model.addAttribute("responsemsg","Displaying data from collections");
		model.addAttribute("booksName",books);
		return "response";
	}
}
