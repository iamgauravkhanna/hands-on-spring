package com.example.movie.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	public String Home() {

		System.out.println("This is Home Controller");

		return "home";

	}

	@RequestMapping(value = "/login")
	public String login() {

		System.out.println("This is Login Controller");

		return "redirect:/";

	}

}