package com.springmvc.config;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingsConfig {
	
	
	@Bean
	public LocalTime time() {
		
		 LocalTime time = LocalTime.now();
		return time;
		
	}

}
