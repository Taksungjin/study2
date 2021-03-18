package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.domain.UserDto;


public interface UserService extends UserDetailsService {
	
	public UserDto login(String username, String password);
}