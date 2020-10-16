package com.example.movie.database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie implements Comparable< Movie >{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String name;

	private int year;

	private String genere;

	private String director;
	
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", year=" + year + ", genere=" + genere + ", director=" + director
				+ "]";
	}
	
	@Override
	public int compareTo(Movie movie) {
		return getId().compareTo(movie.getId());
	}

}