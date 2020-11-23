package com.example.springBootRestExample.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.springBootRestExample.entities.Book;

@Component
public class BookService {

	public static List<Book> list = new ArrayList<>();

	static {

		list.add(new Book(1, "Head First Java", "Bert Bates and Kathy Sierra"));
		list.add(new Book(2, "Effective Java", "Joshua Bloch"));
		list.add(new Book(3, "Java: A Beginner's Guide", "Herbert Schildt"));

	}

	// Get All Books
	public List<Book> getAllBooks() {

		return list;

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

}
