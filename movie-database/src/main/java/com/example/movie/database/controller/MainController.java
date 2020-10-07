package com.example.movie.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainController {

	@RequestMapping(value = "/")
	public String Home() {

		System.out.println("This is Home Controller");

		return "Welcome to Movie Database !!";

	}

}