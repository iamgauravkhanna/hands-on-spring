package com.example.movie.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping(value = "/movie")
	public String movie() {

		return "movie";

	}

}