package com.example.lecture_bookStore.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.lecture_bookStore.models.Book;
import com.example.lecture_bookStore.services.BookService;

@Controller
public class BookController {
	private BookService bService;
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bService.allBooks();
		model.addAttribute("books",books);
		
		return "/books/index.jsp";
	}
	
	@RequestMapping("books/{index}")
	public String findBookByIndex(Model model, @PathVariable("index") Long index){
		Book book = bService.findBook(index);
		model.addAttribute("book",book);
		return "showBook.jsp";
	}
	
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		bService.save(book);
		return "/books/new.jsp";
	}
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("books") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/new.jsp";
		}else {
			bService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("books") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/new.jsp";
		}else {
			bService.save(book);
			return "redirect:/books";
		}
	}
}
