package com.example.movie.database.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.movie.database.model.Movie;
import com.example.movie.database.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	MovieService movieService;

	@RequestMapping(value = "/movies")
	public String movie(Model model) {

		System.out.println("This is Movie Controller");

		List<Movie> movies = movieService.getMovie();

		Collections.sort(movies);

		model.addAttribute("movie", movies);

		return "movie";

	}
	
	@RequestMapping(value = "/addMovie")
	public String addMovie() {
		
		return "addMovie";
		
	}
	
	@RequestMapping(value = "/postMovie", method = RequestMethod.POST)
	public String saveMovie(@ModelAttribute("movie") Movie movieObj) {
		
		movieService.saveMovieViaDao(movieObj);
		
		return "movieSuccess" ;
	
	}

}