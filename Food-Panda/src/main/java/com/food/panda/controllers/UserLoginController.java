package com.food.panda.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.food.panda.entity.UserRegistration;
import com.food.panda.repository.UserRegistrationRepository;

@Controller
public class UserLoginController {
	
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	@RequestMapping("/login")
	public String Login(Model model,Principal principal) {
		String UserName=principal.getName();
		System.out.println("UserName:::-->"+UserName);
		UserRegistration userRegistration=userRegistrationRepository.getUserRegistrationByUserRegistrationEmail(UserName);
		String UserRegName=userRegistration.getUserRegistrationName();
		System.out.println(UserRegName);
		return "login";
	}
	/*
	 * @RequestMapping("/sd") public String Login(Model model,Principal principal) {
	 * String UserName=principal.getName();
	 * System.out.println("UserName:::-->"+UserName);
	 * 
	 * UserRegistration userRegistration=userRegistrationRepository.
	 * getUserRegistrationByUserRegistrationEmail(UserName); String
	 * UserRegName=userRegistration.getUserRegistrationName();
	 * System.out.println(UserRegName); return "login"; }
	 */

}
