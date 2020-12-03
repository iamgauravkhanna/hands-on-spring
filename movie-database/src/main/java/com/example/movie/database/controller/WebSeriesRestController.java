package com.example.movie.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.database.repository.WebSeriesRepository;

@RestController
public class WebSeriesRestController {
	
	@Autowired
	WebSeriesRepository webSeriesRepository ;
	
	@GetMapping("/webseries")
	public ResponseEntity<Object> getSeries(){
		
		return new ResponseEntity<Object>(webSeriesRepository.findAll(), HttpStatus.ACCEPTED);
		
	}

}
