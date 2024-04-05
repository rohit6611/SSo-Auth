package com.altruist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping(value = "/get/call")
	public String getMapCall() {
		
		return "success";
	}
	
}
