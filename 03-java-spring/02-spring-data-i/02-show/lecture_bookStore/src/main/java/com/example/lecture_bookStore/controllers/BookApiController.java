package com.example.lecture_bookStore.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lecture_bookStore.models.Book;
import com.example.lecture_bookStore.services.BookService;

@RestController
@RequestMapping("api")
public class BookApiController {
	private BookService bService;
	public BookApiController(BookService service) {
		this.bService = service;
	}
	
	
	
	@RequestMapping("")
	public String index() {
		return "Hello World";
	}
	//localhost:8080/api/1
	//localhost:8080/api/22
	@RequestMapping("{id}")
	public Book showBook(@PathVariable Long id) {
		return this.bService.getOneBook(id);
	}
	// localhost:8080/api/create POST
	@PostMapping("create")
	public Book createBook(Book book) {
		return this.bService.createBook(book);
	}
	
	
	
	
	
}
