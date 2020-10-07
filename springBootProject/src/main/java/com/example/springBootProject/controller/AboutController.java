package com.example.springBootProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

	@RequestMapping(value = "/about")
	public String aboutPage() {

		System.out.println("This is About Controller");
		return "about";

	}

}