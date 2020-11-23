package com.example.springBootProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.springBootProject.dao.BookRepository;
import com.example.springBootProject.model.Book;

@Component
public class BookService {

	public static List<Book> list = new ArrayList<>();

//	static {
//
//		list.add(new Book(1, "Head First Java", "Bert Bates and Kathy Sierra"));
//		list.add(new Book(2, "Effective Java", "Joshua Bloch"));
//		list.add(new Book(3, "Java: A Beginner's Guide", "Herbert Schildt"));
//
//	}

	@Autowired
	private BookRepository bookRepository;

	// Get All Books
	public List<Book> getAllBooks() {

		return (List<Book>) bookRepository.findAll();

	}

	// Get Book By ID
	public Book getBookById(int id) {

		for (Book bookList : list) {

			if (bookList.getId() == id) {
				return bookList;
			}

		}
		return null;

	}

	public Book saveBook(Book book) {
		bookRepository.save(book);
		return null;
	}

}
