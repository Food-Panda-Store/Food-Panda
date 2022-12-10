package com.food.panda.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.food.panda.entity.UserRegistration;
import com.food.panda.repository.UserRegistrationRepository;

public class CustomeUserDetalisImpl implements UserDetailsService{
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	@Override
	public UserDetails loadUserByUsername(String UserRegistration) throws UsernameNotFoundException {
		
		UserRegistration userRegistration=userRegistrationRepository.getUserRegistrationByUserRegistrationEmail(UserRegistration);
		
		
		if(userRegistration==null) {
			throw new UsernameNotFoundException("Could Not Found User.");
			
		}
		CustomUserDetails customUserDetails= new CustomUserDetails(userRegistration); 
		
		
		
		return customUserDetails;
	}

}
