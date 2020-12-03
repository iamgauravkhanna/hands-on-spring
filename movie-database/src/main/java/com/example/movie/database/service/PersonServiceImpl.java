package com.example.movie.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.movie.database.model.Person;
import com.example.movie.database.repository.PersonRespository;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Person> getPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		
	}

//	@Autowired
	//@Qualifier("JdbcPersonRespository")
	//@Qualifier("NamedParameterJdbcPersonRespository")
//	PersonRespository personRespository;
//
//	@Override
//	public List<Person> getPerson() {
//
//		return (List<Person>) personRespository.findAll();
//
//	}
//
//	@Override
//	public void savePerson(Person person) {
//		
//		personRespository.save(person);
//		
//	}

}