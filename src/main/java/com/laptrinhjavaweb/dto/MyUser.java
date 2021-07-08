package com.laptrinhjavaweb.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

//Lop de sustom lai lop user da duoc viet san

public class MyUser extends User{

	public MyUser(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		// TODO Auto-generated constructor stub 	
		
		
		
	}
	private String fullName;
	public  void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullName() {
		return this.fullName;
	}
}
