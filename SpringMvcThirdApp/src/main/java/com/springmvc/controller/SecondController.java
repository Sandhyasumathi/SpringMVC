package com.springmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/Second")
public class SecondController {

	@GetMapping("/welcome")
	public String welcomeMessage1(Model model) {
		
		model.addAttribute("info","Welcome message from second controller");
		return "info";
	}
	
	@GetMapping("/skill1")
	public String welcomeMessage2(Map<String,Object> map) {
		
		map.put("info","Welcome message from skill of second controller");
		return "skill";
	}
	
	@GetMapping("/skill")
	public void welcomeMessage3(Map<String,Object> map) {
		
		map.put("info","Welcome message from skill of second controller");
		return;
	}
}
