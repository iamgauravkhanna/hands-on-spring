package com.example.movie.database.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.movie.database.model.Person;

public interface PersonRespository {
	
	Person save(Person person);
	
	List<Person> findAll();

}