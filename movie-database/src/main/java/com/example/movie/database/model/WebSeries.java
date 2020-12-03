package com.example.movie.database.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "webseries")
public class WebSeries {
	
	@Id
	private String id;
	
	private String name ;
	
	private String year ;

}
