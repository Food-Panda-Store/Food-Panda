package com.food.panda.config;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.food.panda.entity.UserRegistration;

public class CustomUserDetails implements UserDetails{

	private UserRegistration userRegistration; 
	
	public CustomUserDetails(UserRegistration userRegistration) {
		super();
		this.userRegistration = userRegistration;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority simpleGrantedAuthority  = new SimpleGrantedAuthority(userRegistration.getUserRole());
		return List.of(simpleGrantedAuthority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return userRegistration.getUserRegistrationPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userRegistration.getUserRegistrationEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
