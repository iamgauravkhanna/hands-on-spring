package com.example.springBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springBootProject.model.User;
import com.example.springBootProject.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user")
	public String viewUser() {

		return "user";

	}

	@RequestMapping(value = "/addUser")
	public String addUser() {

		return "addUser";

	}

	@RequestMapping(value = "/postUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {

		userService.add(user);
		
		return "movieSuccess";
	}

}