package com.example.movie.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.movie.database.model.Movie;
import com.example.movie.database.repository.MovieRepository;

public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> getMovie() {

		return (List<Movie>) this.movieRepository.findAll();

	}

}