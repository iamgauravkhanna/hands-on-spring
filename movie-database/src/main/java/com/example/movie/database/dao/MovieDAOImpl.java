package com.example.movie.database.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.movie.database.model.Movie;

@Component
public class MovieDAOImpl implements MovieDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void save(Movie movie) {

		String query = "insert into movie(name,year,genere,director) values(?,?,?,?)";

		int result = jdbcTemplate.update(query, movie.getId(), movie.getName(), movie.getYear(), movie.getGenere(),
				movie.getDirector());

		System.out.println("Number of record inserted : " + result);

	}

	@Override
	public Movie getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Movie movie) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Movie> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
