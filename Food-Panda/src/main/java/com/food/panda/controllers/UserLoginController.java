package com.food.panda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLoginController {
	
	
	@RequestMapping("/login")
	public String Login() {
		return "login";
	}
	

}
