package com.leo.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leo.app.model.Book;

/**
 * 
 * @author anoop
 *
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
}
