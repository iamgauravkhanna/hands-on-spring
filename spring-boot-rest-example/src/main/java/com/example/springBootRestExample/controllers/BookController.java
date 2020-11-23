package com.example.springBootRestExample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootRestExample.entities.Book;
import com.example.springBootRestExample.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> getBooks() {

		return this.bookService.getAllBooks();

	};
	
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		
		return bookService.getBookById(id) ;
		
	}
	
	

}
