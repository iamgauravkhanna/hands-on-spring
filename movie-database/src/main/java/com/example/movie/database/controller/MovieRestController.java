package com.example.movie.database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class MovieRestController {

	@GetMapping("/movie")
	public void getMovies() {

	}

	@GetMapping("/movie/{id}")
	public void getMovieById(@PathVariable("id") int id) {

	}

	@PostMapping("/movie")
	public void createMovie() {
	}

}
