package com.example.movie.database.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.movie.database.model.Movie;

@Component
//CRUD operations
public interface MovieDAO {

	// Create
	public void save(Movie movie);

	// Read
	public Movie getById(int id);

	// Update
	public void update(Movie movie);

	// Delete
	public void deleteById(int id);

	// Get All
	public List<Movie> getAll();

}