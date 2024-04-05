package com.altruist.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.altruist.request.RequestDto;

@RestController
public class UserController {

	@PostMapping(value = "/user/response")
	public String userResponse(@Valid @RequestBody RequestDto req) {
		
		return "success";
		
	}
	
	
	
//    @RequestMapping("/user/me")
//    public Principal user(Principal principal) {
//        return principal;
//    }
//
////    @PreAuthorize("#oauth2.hasScope('read')")
//    @RequestMapping("/user/also-me")
//    public String test(Principal user) {
//        return "The principal's name is: " + user.getName();
//    }
    
}
