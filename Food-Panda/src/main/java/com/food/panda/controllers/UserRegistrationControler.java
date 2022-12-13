package com.food.panda.controllers;

import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.food.panda.entity.UserRegistration;
import com.food.panda.repository.UserRegistrationRepository;

@Controller
public class UserRegistrationControler {
	
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	

	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String Registration(@ModelAttribute UserRegistration userRegistration, HttpSession session) {
		

		//System.out.println(userRegistration);
		userRegistration.setUserRegistrationPassword(bCryptPasswordEncoder.encode(userRegistration.getUserRegistrationPassword()));
		userRegistration.setUserRegistrationConfiramPassword(bCryptPasswordEncoder.encode(userRegistration.getUserRegistrationConfiramPassword()));
		
		userRegistrationRepository.save(userRegistration);
		session.setAttribute("message", "Done...");
		return "register";
	}
	
	

}
