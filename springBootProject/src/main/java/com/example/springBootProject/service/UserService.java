package com.example.springBootProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springBootProject.dao.UserRepository;
import com.example.springBootProject.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void add(User user) {
		
		System.out.println("User Object : " + user.toString());
		
		userRepository.save(user);
		
		System.out.println("User Added");
		
	}

}