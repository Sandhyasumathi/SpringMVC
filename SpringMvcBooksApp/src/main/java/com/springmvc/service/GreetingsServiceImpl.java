package com.springmvc.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService{
	
	@Autowired
	public LocalTime time;

	@Override
	public String greet(String name) {
		int hour = time.getHour();
		
		if(hour<12)
		   return "Good Morning " + name;
		else if(hour>12 && hour<16)
			return "Good Afternoon " + name;
		else
			return "Good Evening " + name;
	}

}
