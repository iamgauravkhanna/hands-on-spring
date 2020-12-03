package com.example.movie.database.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.movie.database.model.Movie;
import com.example.movie.database.service.MovieService;

@Controller
public class MainController {
	
	@Autowired
	MovieService movieService;

	@RequestMapping(value = "/")
	public String Home(Model model) {

		System.out.println("This is Home Controller");
		
		List<Movie> movies = movieService.getMovie();

		Collections.sort(movies);

		model.addAttribute("movie", movies);

		return "home";

	}

	@RequestMapping(value = "/login")
	public String login() {

		System.out.println("This is Login Controller");

		return "redirect:/";

	}

}