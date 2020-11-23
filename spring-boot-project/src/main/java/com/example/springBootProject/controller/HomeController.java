package com.example.springBootProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String homePage() {

		System.out.println("This is Home Controller");
		return "home";

	}

}
