package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvc.model.Course;

@Controller
public class CourseController {
	
//	@GetMapping("/courseinfo")
//	public String courseInfo(Model model) {
//		Course course = new Course();
//		course.setCid(1);
//		course.setCname("Java");
//		course.setPrice(5999.9);
//		model.addAttribute("courseinfo",course);
//		return "course";
//	}
	
	@GetMapping("/courseinfo")
	public String courseInfo(Model model) {

		model.addAttribute("cid","1");
		model.addAttribute("cname","DevOps");
		model.addAttribute("price","8000.9");
		return "course";
	}

}
