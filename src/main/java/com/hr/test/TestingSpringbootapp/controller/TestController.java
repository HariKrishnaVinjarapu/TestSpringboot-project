package com.hr.test.TestingSpringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/")
	public String msg()
	{
		return "spring boot with azure";
		
	}

}
