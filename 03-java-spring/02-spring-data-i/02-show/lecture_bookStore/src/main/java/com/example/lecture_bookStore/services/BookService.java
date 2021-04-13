package com.example.lecture_bookStore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.lecture_bookStore.models.Book;
import com.example.lecture_bookStore.repositories.BookRepository;

@Service
public class BookService {
	
	//conect to repo
	private BookRepository bRepo;
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	// give us a book, with a provided id
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}

	// create a book
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
	// returns all the books
	public List<Book> allBooks() {
		return bRepo.findAll();
	}
	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bRepo.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	
}
