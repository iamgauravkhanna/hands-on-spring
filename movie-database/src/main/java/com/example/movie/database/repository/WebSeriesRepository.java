package com.example.movie.database.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.database.model.WebSeries;

@Repository
public interface WebSeriesRepository extends MongoRepository<WebSeries, String>{

}
