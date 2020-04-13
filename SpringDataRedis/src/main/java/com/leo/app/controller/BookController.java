package com.leo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.app.model.Book;
import com.leo.app.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		bookService.insertOrUpdate(book);
		return book;
	}
	
	@GetMapping("all")
	public List<Book> selectAllBooks(){
		return bookService.selectAllBooks();
	}

}
