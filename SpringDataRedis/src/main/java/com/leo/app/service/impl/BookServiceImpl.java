package com.leo.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.app.dao.BookDao;
import com.leo.app.model.Book;
import com.leo.app.repository.BookRepository;
import com.leo.app.service.BookService;

/**
 * 
 * @author anoop
 *
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	BookDao bookDao;

	@Override
	public Book insertOrUpdate(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> selectAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

}
