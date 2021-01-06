package com.example.movie.database.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.database.model.Person;
import com.example.movie.database.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonRestController {
	
	@Autowired
	PersonService personService ;
	
	@GetMapping("/list")
	public ResponseEntity<Object> getPerson(){
		
		return new ResponseEntity<Object>(personService.getPerson(), HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<Object> createPerson(@Valid Person person, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()) {
			
			System.out.println("Found Errors for Person Object : " + bindingResult.getErrorCount());
			
			return new ResponseEntity<Object>(personService.getPerson(), HttpStatus.INTERNAL_SERVER_ERROR);
			
		} else {
		
		personService.savePerson(person);
		
		return new ResponseEntity<Object>(personService.getPerson(), HttpStatus.CREATED);
		
		}
		
	}

}
