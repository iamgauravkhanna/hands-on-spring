package com.example.springBootProject.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springBootProject.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
