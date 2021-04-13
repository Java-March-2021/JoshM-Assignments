package com.example.lecture_bookStore.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.lecture_bookStore.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	//^should extend from parent class with this 		^ being <table, id type>
	//.save(Book); => Book
	//.findById(Long id); => Book
	// this method retrieves all the books from the database
    List<Book> findAll();
    // this method find a book by their description
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
