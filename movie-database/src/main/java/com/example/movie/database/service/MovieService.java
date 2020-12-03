package com.example.movie.database.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.movie.database.model.Movie;

@Component
public interface MovieService {

	public List<Movie> getMovie();

	public Optional<Movie> getMovieById(int id);

	public Movie saveMovie(Movie movie);	
	
	public void saveMovieViaDao(Movie movie);

	public void deleteMovie(int id);

	public List<Movie> getMovieByName(String name);

}