package com.example.movie.database.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.database.model.Movie;
import com.example.movie.database.service.MovieService;

@RestController("/api")
public class MovieRestController {

	@Autowired
	MovieService movieService;

	@GetMapping("/movie")
	public List<Movie> getMovies() {

		return this.movieService.getMovie();

	}
	
	@GetMapping("/movie-listing")
	public ResponseEntity<Object> getMoviesListing() {

		return new ResponseEntity<Object>(this.movieService.getMovie(), HttpStatus.ACCEPTED);

	}

	@GetMapping("/movie/{id}")
	public Optional<Movie> getMovieById(@PathVariable("id") int id) {

		return this.movieService.getMovieById(id);

	}

	@PostMapping("/movie")
	public Movie createMovie(@RequestBody Movie movie) {

		System.out.println(movie.toString());

		return this.movieService.saveMovie(movie);
	}

	@PutMapping("/movie")
	public Movie updateMovie(@RequestBody Movie movie) {

		return this.movieService.saveMovie(movie);

	}

	@DeleteMapping("/movie/{id}")
	public void deleteMovie(@PathVariable("id") int id) {

		movieService.deleteMovie(id);

	}

}
