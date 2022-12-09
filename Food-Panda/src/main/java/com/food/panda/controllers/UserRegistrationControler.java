package com.food.panda.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.food.panda.entity.UserRegistration;
import com.food.panda.repository.UserRegistrationRepository;

@Controller
public class UserRegistrationControler {
	
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/register")
	public String Registration(@ModelAttribute UserRegistration userRegistration, HttpSession session) {

		System.out.println(userRegistration);
		
		userRegistrationRepository.save(userRegistration);
		session.setAttribute("message", "Done...");
		return "register";
	}
	
	@GetMapping("/login")
	public String Login() {
		return "login";
	}

}
