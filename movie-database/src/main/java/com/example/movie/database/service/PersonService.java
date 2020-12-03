package com.example.movie.database.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.movie.database.model.Person;

@Component
public interface PersonService {
	
	public List<Person> getPerson();

	public void savePerson(Person person);

}
