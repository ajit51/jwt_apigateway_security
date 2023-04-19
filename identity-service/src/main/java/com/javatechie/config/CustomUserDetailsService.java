package com.javatechie.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.javatechie.entity.UserCredential;
import com.javatechie.repository.UserCredentialRepository;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserCredentialRepository credentialRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserCredential> credential = credentialRepository.findByName(username);
		return credential.map(CustomUserDetails::new).orElseThrow(
				() -> new UsernameNotFoundException("user not found with name :" + username));
	}

}
