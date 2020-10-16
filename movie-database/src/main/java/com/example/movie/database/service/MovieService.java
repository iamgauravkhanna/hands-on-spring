package com.example.movie.database.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.movie.database.dao.MovieDAOImpl;
import com.example.movie.database.model.Movie;
import com.example.movie.database.repository.MovieRepository;

@Component
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private MovieDAOImpl movieDAOImpl;

	public List<Movie> getMovie() {

		return (List<Movie>) this.movieRepository.findAll();

	}

	public Optional<Movie> getMovieById(int id) {

		return this.movieRepository.findById(id);
	}

	public Movie saveMovie(Movie movie) {

		return movieRepository.save(movie);

	}
	
	public void saveMovieViaDao(Movie movie) {
		
		movieDAOImpl.save(movie);
		
	}

	public void deleteMovie(int id) {

		movieRepository.deleteById(id);

	}

}