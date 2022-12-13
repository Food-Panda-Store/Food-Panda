package com.food.panda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class AllController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/home")
	public String homes() {
		return "home";
	}
	
	@RequestMapping("/about")
	public String aboutUs() {
		return "about";
	}
	
	@RequestMapping("/menu")
	public String menu() {
		return "about";
	}
	
	@RequestMapping("/orders")
	public String orders() {
		return "orders";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("/search")
	public String search() {
		return "search";
	}
	
	@RequestMapping("/cart")
	public String cart() {
		return "cart";
	}
	
	@RequestMapping("/checkout")
	public String checkout() {
		return "checkout";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("/update_address")
	public String update_address() {
		return "update_address";
	}
	
	@RequestMapping("/update_profile")
	public String update_profile() {
		return "update_profile";
	}
	
	

	

}
