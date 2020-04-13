package com.leo.app.service;

import java.util.List;

import com.leo.app.model.Book;

public interface BookService {

	public Book insertOrUpdate(Book book);
	
	public List<Book> selectAllBooks();
}
