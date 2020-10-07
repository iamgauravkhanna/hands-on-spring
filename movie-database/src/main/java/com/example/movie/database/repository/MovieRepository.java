package com.example.movie.database.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.movie.database.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
